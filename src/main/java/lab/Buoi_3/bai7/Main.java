package lab.Buoi_3.bai7;

public class Main {
    static void testScoreODD(int number) throws Exception {
        if(number %2 != 0)
            throw new ChildrenException("phai la so chan");
        else if(number > 40) {
            throw new ParentException("Phia nho hon 40");
        }
    }
    public static void main(String[] args) {
        int a = 10;
        try {
           testScoreODD(a);
        } catch (ChildrenException ex) {
            System.out.println(ex.getMessage());
        } catch (ParentException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Luon chay lenh nay");
        }
    }
}
