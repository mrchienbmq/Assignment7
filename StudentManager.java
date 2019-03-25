package Assignment7;

import java.util.Comparator;
import java.util.*;

public class StudentManager extends QLSV {
    Scanner scanner = new Scanner(System.in);
    int counter = 0;

    public List<Student> studentList;


    public StudentManager(){
       this.studentList = new ArrayList<>();


    }

    @Override
    public void addStudent() {
    }

    @Override
    public void editStudentById(int ID){
        Student student = new Student();
        boolean isExisted = false;
        int size = studentList.size();
        for (int i = 0; i < size; i++) {
            if (studentList.get(i).getID() == ID) {
                System.out.println("Sửa Tên Sinh Viên");
                studentList.get(i).setName(scanner.next());
                System.out.println("Sửa Tuổi Sinh Viên");
                studentList.get(i).setAge(scanner.nextInt());
                System.out.println("Sửa Địa Chỉ Sinh Viên");
                studentList.get(i).setAddress(scanner.next());
                System.out.println("Sửa Điểm Trung Bình Chỉ Sinh Viên");
                studentList.get(i).setGpa(scanner.nextFloat());
                break;
            }
            if (!isExisted){
                System.out.println("ID Này Không Tồn Tại: "+ID);
            }

        }

        }
    @Override
    public void deleteStudentById(int ID) {
        Student student = new Student();
        int size = studentList.size();
        for (int i = 0; i < size ; i++) {
            if (studentList.get(i).getID() == ID){
                student = studentList.get(i);
            }if (student != null){
                studentList.remove(student);
            }else {
                System.out.println("Không Tồn Tại ID này"+ID);
            }
            
        }

    }

    @Override
    public void sortStudentByGpa(float gpa) {
        Collections.sort(this.studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return 0;
            }
        });

    }

    @Override
    public void sortStudentByName(String name) {
        Collections.sort(this.studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        for (Student st:studentList){
            System.out.println(st.getName());
        }

        }



    @Override
    public void showStudent() {
        for (Student student:studentList){
            System.out.println("ID Của Sinh Viên: "+student.ID);
            System.out.println("Tên Của Sinh Viên:  "+student.name);
            System.out.println("Tuổi Của Sinh Viên: "+student.age);
            System.out.println("Địa Chỉ Của Sinh Viên: "+student.address);
            System.out.println("Điểm Trung Bình Của Sinh Viên: "+student.gpa);

        }
    }
}
