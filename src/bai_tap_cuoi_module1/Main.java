package bai_tap_cuoi_module1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("\nMenu Quản lý danh sách Sinh Viên");
            System.out.println("1. Thêm sinh viên vào danh sách.");
            System.out.println("2. Sửa thông tin sinh viên.");
            System.out.println("3. Xóa sinh viên khỏi danh sách");
            System.out.println("4. Tìm kiếm sinh viên theo tên.");
            System.out.println("5. Hiển thị danh sách sinh viên.");
            System.out.println("6. Thoát");
            System.out.print("Chọn một tùy chọn: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    System.out.print("Nhập tên sinh viên: ");
                    String name = scanner.nextLine();
                    System.out.print("Nhập tuổi sinh viên: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nhập mã sinh viên: ");
                    String studentId = scanner.nextLine();
                    manager.addStudent(new Student(name, age, studentId));
                    break;
                case 2:
                    System.out.print("Nhập mã sinh viên cần chỉnh sửa: ");
                    String editId = scanner.nextLine();
                    manager.ediStudent(editId);
                    break;
                case 3:
                    System.out.print("Nhập mã sinh viên cần xóa: ");
                    String deleteId = scanner.nextLine();
                    manager.deleteStudent(deleteId);
                    break;
                case 4:
                    System.out.print("Nhập tên sinh viên cần tìm: ");
                    String searchName = scanner.nextLine();
                    manager.searchStudentByName(searchName);
                    break;
                case 5:
                    manager.displayStudent();
                    break;
                case 6:
                    System.out.println("Đã thoát khỏi chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }
}
