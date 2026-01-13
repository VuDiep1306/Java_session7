package exercise1;

public class Main {
    public static void main(String[] args) {

        Rectangle rect1 = new Rectangle();
        System.out.println("Hinh chu nhat 1:");
        rect1.display();

        Rectangle rect2 = new Rectangle(5.0, 3.0);
        System.out.println("\nHinh chu nhat 2:");
        rect2.display();
    }
}
