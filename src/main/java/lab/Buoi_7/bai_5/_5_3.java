package lab.Buoi_7.bai_5;

import java.util.Optional;

class User {
    private Address address;

    public Address getAddress() {
        return address;
    }
}
class Address {
    private String street;

    public String getStreet() {
        return street;
    }
}
public class _5_3 {

    public static User getUser() {
        return  null;
    }

    public String notUsedOptional() {
        User user = getUser();
        if(user != null) {
            Address address = user.getAddress();
            if(address!=null) {
                String street = address.getStreet();
                if(street != null)
                    return street;
            }
        }
        return "not specified";
    }

    public String usedOptional() {
        Optional<User> user = Optional.ofNullable(getUser());
        return user.map(User::getAddress)
                .map(Address::getStreet).orElse("not specified");
    }

}
