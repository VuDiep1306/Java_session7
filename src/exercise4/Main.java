package exercise4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student[] studentArray = new Student[5];

        studentArray[0] = new Student("Alice", 20, "A1", 8.5);
        studentArray[1] = new Student("Bob", 21, "A1", 7.0);
        studentArray[2] = new Student("Charlie", 19, "A2", 9.0);
        studentArray[3] = new Student("David", 22, "A2", 6.5);
        studentArray[4] = new Student("Eve", 20, "A1", 8.0);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap diem Min: ");
        double min = scanner.nextDouble();
        System.out.println("Nhap diem Max: ");
        double max = scanner.nextDouble();

        System.out.println("Danh sach sinh vien co diem trung binh tu " + min + " den " + max + "：");
        for (Student student : studentArray) {
            if (student.getAvgScore() >= min && student.getAvgScore() <= max) {
                System.out.println(student);
            }
        }
        scanner.close();
    }
}
