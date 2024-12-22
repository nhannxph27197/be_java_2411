package bai_tap_cuoi_module1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    private ArrayList<Student> students;

    public StudentManager(){
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student){
        for (Student s : students){
            if(s.getStudentId().equals(student.getStudentId())){
                System.out.println("Mã sinh viên đã tồn tại, không thể thêm sinh viên");
                return;
            }
        }
        students.add(student);
        System.out.println("Sinh viên đã được thêm vào danh sách");
    }

    public void ediStudent(String studentId){
        for (Student s: students){
            if(s.getStudentId().equals(studentId)){
                Scanner scanner = new Scanner(System.in);
                System.out.println("Thông tin sinh viên hiện tại: "+ s);
                System.out.println("Nhập tên sinh viên chỉnh sửa: ");
                s.setName(scanner.nextLine());
                System.out.println("Nhập tuổi sinh viên chỉnh sửa: ");
                s.setAge(scanner.nextInt());
                scanner.nextLine();
                System.out.println("Nhập mã sinh viên chỉnh sửa: ");
                s.setStudentId(scanner.nextLine());
                System.out.println("Thông tin sinh viên đã được cập nhật.");
                return;
            }
        }
        System.out.println("không tìm thấy sinh viên với mã: "+ studentId+ ".");
    }

    public void deleteStudent(String studentId){
        for(Student s: students){
            if(s.getStudentId().equals(studentId)){
                students.remove(s);
                System.out.println("Sinh viên đã được xóa khỏi danh sách.");
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên với mã: "+ studentId + ".");
    }

    public void searchStudentByName(String name){
        boolean found = false;
        for (Student s : students){
            if(s.getName().equals(name)){
                System.out.println("Kết quả tìm kiếm: "+ s);
                found = true;
            }
        }
        if(!found){
            System.out.println("Không tìm thấy sinh viên nào có tên: "+ name);
        }
    }
    
    public void displayStudent(){
        if(students.isEmpty()){
            System.out.println("Danh sách sinh viên hiện tại đang trống");
        }else{
            System.out.println("Danh sách sinh viên hiện tại: ");
            for (Student s: students){
                System.out.println(s);
            }
        }
    }
}
