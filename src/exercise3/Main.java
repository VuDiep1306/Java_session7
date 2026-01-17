package exercise3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Person person1 = new Person();
        System.out.println("Nhap ten nguoi thu nhat: ");
        person1.setName(sc.nextLine());
        System.out.println("Nhap tuoi nguoi thu nhat: ");
        person1.setAge(sc.nextInt());
        sc.nextLine();

        Person person2 = new Person();
        System.out.println("Nhap ten nguoi thu hai: ");
        person2.setName(sc.nextLine());
        System.out.println("Nhap tuoi nguoi thu hai: ");
        person2.setAge(sc.nextInt());

        if (person1.getAge() > person2.getAge()) {
            System.out.println(person1.getName() + " lon tuoi hon " + person2.getName());
        } else if (person1.getAge() < person2.getAge()) {
            System.out.println(person1.getName() + " nho tuoi hon " + person2.getName());
        } else {
            System.out.println(person1.getName() + " bang tuoi voi " + person2.getName());
        }
        sc.close();
    }
}
