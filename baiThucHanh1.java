package lesson3;

import java.util.Scanner;

public class baiThucHanh1 {
    int id, age, salary;
    String name, address;
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập name: ");
        name = sc.nextLine();
        System.out.println("Nhập address: ");
        address = sc.nextLine();
        System.out.println("Nhập age: ");
        age = sc.nextInt();
        System.out.println("Nhập salary: ");
        salary = sc.nextInt();
    }

    public void ViewDaTa(){
        System.out.println("id= "+id);
        System.out.println("name= "+name);
        System.out.println("address= "+address);
        System.out.println("age= "+age);
        System.out.println("salary= "+salary);
    }

    double calSalary(int bonus){
        return salary + salary * (bonus/100);
    }

    double calSalary(double bonus){
        return salary + bonus;
    }

    public static void main(String[] args) {
        baiThucHanh1 bth1 = new baiThucHanh1();
        bth1.input();
        bth1.ViewDaTa();
        System.out.println("Lương int: "+ bth1.calSalary(200));
        ;
        System.out.println("Lương double: "+ bth1.calSalary(100));
    }
}
