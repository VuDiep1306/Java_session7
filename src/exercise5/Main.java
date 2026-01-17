package exercise5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Product> productList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1: Thêm mới sản phẩm");
            System.out.println("2: Hiển thị danh sách sản phẩm");
            System.out.println("3: Cập nhật sản phẩm");
            System.out.println("4: Xóa sản phẩm");
            System.out.println("5: Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Nhap id: ");
                    String id = scanner.nextLine();
                    System.out.print("Nhap name: ");
                    String name = scanner.nextLine();
                    System.out.print("Nhap price: ");
                    double price = scanner.nextDouble();
                    productList.add(new Product(id, name, price));
                    System.out.println("San pham da duoc them.");
                    break;

                case 2:
                    if (productList.isEmpty()) {
                        System.out.println("Danh sach san pham trong");
                        break;
                    }
                    System.out.println("Danh sach san pham:");
                    for (Product product : productList) {
                        System.out.println("ID: " + product.getId() + ", Ten: " + product.getName() + ", Gia: " + product.getPrice());
                    }
                    break;
                case 3:
                    System.out.println("Nhap ID san pham can cap nhat: ");
                    String updateId = scanner.nextLine();
                    boolean found = false;
                    for (Product product : productList) {
                        if (product.getId().equals(updateId)) {
                            System.out.print("Nhap ten moi: ");
                            product.setName(scanner.nextLine());
                            System.out.print("Nhap gia moi: ");
                            product.setPrice(scanner.nextDouble());
                            found = true;
                            System.out.print("San pham da duoc cap nhat");
                            break;
                        }
                    }
                    if (!found) {
                        System.out.print("San pham khong ton tai");
                    }
                    break;
                case 4:
                    System.out.print("Nhap ID san pham can xoa: ");
                    String deleteId = scanner.nextLine();
                    found = false;
                    for (int i = 0; i < productList.size(); i++) {
                        if (productList.get(i).getId().equals(deleteId)) {
                            productList.remove(i);
                            found = true;
                            System.out.println("San pham da duoc xoa");
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("San pham khong ton tai.");
                    }
                    break;
                case 5:
                    System.out.println("Thoat khoi chuong trinh");
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long thu lai.");
            }
        } while (choice != 5);
        scanner.close();
    }
}
