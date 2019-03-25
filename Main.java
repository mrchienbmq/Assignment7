package Assignment7;



import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);
        StudentManager studentManager = new StudentManager();
        int studetID;
        String studentStr;
/*
        student.addStudent();
        student.showStudent();
*/

        showMenu();
        boolean cont = true;
        do {
            int chon = scanner.nextInt();
            switch (chon) {
                case 1:
                    System.out.println("Thêm Sinh Viên Mới");
                    student.addStudent();
                    break;
                case 2:
                    System.out.println("Sửa Thông Tin Nhân Viên");
                    student.editStudentById(1);
                    break;
                case 3:
                    System.out.println("Xóa Thông Tin Sinh Viên");
                    student.deleteStudentById(1);
                    break;
                case 4:
                    System.out.println("Sắp Xếp Học Sinh Theo Điểm Trung Bình");
                    student.sortStudentByGpa(8);
                    break;
                case 5:
                    System.out.println("Sắp Xếp Học Sinh Theo Tên");
                    student.sortStudentByName("chien");
                    break;
                case 6:
                    System.out.println("Hiển Thị Danh Sách Sinh Viên");
                    student.showStudent();
                    break;
                case 0:
                    System.out.println("Thoát");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không Hợp Lệ Vui Lòng Chọn Lại :");
                    break;

            }
        }while (cont);
    }

    public static void showMenu() {
        System.out.println("-----------menu------------");
        System.out.println("1. Add student.");
        System.out.println("2. Edit student by id.");
        System.out.println("3. Delete student by id.");
        System.out.println("4. Sort student by gpa.");
        System.out.println("5. Sort student by name.");
        System.out.println("6. Show student.");
        System.out.println("0. exit.");
        System.out.println("---------------------------");
        System.out.print("Please choose: ");
    }
}
