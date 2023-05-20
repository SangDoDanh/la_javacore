package io;

import io.models.Employee;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static List<Employee> employees = new ArrayList<>();

    static final String PATH = "./data/employeeList.txt";
    public static void main(String[] args) throws IOException {

        int choose;
        do {
            showMenu();
            System.out.println("--> ");
             choose = Integer.parseInt(sc.nextLine());
             switch (choose){
                 case 1:
                     addEmployee();
                     break;
                 case 2:
                     showEmployeeList();
                     break;
                 case 3:
                     sort();
                     break;
                 case 4:
                     deleteEmployee();
                     break;
                 case 0:
                     break;
                 default:
                     System.out.println("Vui long chon dung chuc nang");
             }
        }
        while (choose != 0);

    }

    private static void sort() throws IOException{
        employees = readFile(PATH);
        if (employees.isEmpty()) {
            System.out.println("Is empty");
        } else {
            employees.sort(Comparator.comparingDouble(Employee::getSalary));
            writeFile(PATH, employees);
        }
    }

    private static void deleteEmployee() throws IOException {
        System.out.println("Delete employee...");
        employees = readFile(PATH);
        System.out.println("id employee: ");
        int id = Integer.parseInt(sc.nextLine());

        if(employees.stream().anyMatch(e -> e.getId() == id)) {
            Iterator<Employee> employeeIterator = employees.iterator();
            Employee employee;
            while (employeeIterator.hasNext()) {
                employee = employeeIterator.next();
                if (employee.getId() == id) {
                    employeeIterator.remove();
                    break;
                }
            }
            writeFile(PATH, employees);
        } else {
            System.out.println("Not Found");
        }
    }

    private static void showEmployeeList() throws IOException {
        employees = readFile(PATH);

        if(employees.isEmpty())
            System.out.println("Danh sach trong!");
        else {
            for(Employee e : employees) {
                e.showInfo();
            }
        }

    }

    static  void addEmployee() throws IOException {

        System.out.println("Them moi nhan vien.....");

        System.out.println("id employee: ");
        int id = Integer.parseInt(sc.nextLine());

        System.out.println("lastname employee: ");
        String lastname = sc.nextLine();

        System.out.println("firstname employee: ");
        String firstname = sc.nextLine();

        System.out.println("address employee: ");
        String address = sc.nextLine();

        System.out.println("salary employee: ");
        double salary = Double.parseDouble(sc.nextLine());

        System.out.println("birthday employee  dd/mm/yyyy: ");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birthday = LocalDate.parse(sc.nextLine(), dateTimeFormatter);

        Employee employee = new Employee(id, lastname, firstname, address, birthday, salary);
        employees = readFile(PATH);
        employees.add(employee);
        writeFile(PATH, employees);

    }

    static void writeFile(String path, List<Employee> employees) throws IOException {
        FileWriter fileWriter = new FileWriter(path);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for(Employee e : employees) {
            bufferedWriter.write(e.toString());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        fileWriter.close();
    }

    static List<Employee> readFile(String path) throws IOException {
        List<Employee> source = new ArrayList<>();
        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;

        while ((line = bufferedReader.readLine()) != null) {
            if(!line.equals("")) {
                String[] emplArr = line.split(",");
                Employee employee = new Employee();
                employee.setId(Integer.parseInt(emplArr[0]));
                employee.setLastname(emplArr[1]);
                employee.setFirstname(emplArr[2]);
                employee.setAddress(emplArr[3]);
                DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                employee.setBirthday(LocalDate.parse(emplArr[4], dateTimeFormatter));
                employee.setSalary(Double.parseDouble(emplArr[5]));
                source.add(employee);
            }
        }
        bufferedReader.close();
        fileReader.close();
        return source;
    }


    static void showMenu() {
        System.out.println("1. Them moi nhan vien");
        System.out.println("2. Hien thi danh sach nhan vien");
        System.out.println("3. sap xep theo luong nhan vien");
        System.out.println("4. Xoa nhan vien");
        System.out.println("0. Thoat");
    }
}
