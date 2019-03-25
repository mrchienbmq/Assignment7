package Assignment7;


import java.util.Scanner;

public class Student extends StudentManager  {
    public int ID;
    public String name;
    public int age;
    public String address;
    public float gpa;


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        
        this.gpa = gpa;
    }

    public Student() {
    }
    public Student(int ID, String name, int age, String address, float gpa){
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.address = address;
        this.gpa = gpa;
    }

    @Override
    public void addStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Studen ID: ");
        ID = scanner.nextInt();
        System.out.println("Nhập Tên Sinh Viên: ");
        name = scanner.next();
        System.out.println("Nhập Tuổi Sinh Viên: ");
        age = scanner.nextInt();
        System.out.println("Nhập Địa Chỉ Sinh Viên: ");
        address = scanner.next();
        System.out.println("Nhập Điểm Trung Bình Của Sinh Viên: ");
        gpa = scanner.nextFloat();
        Student student = new Student(ID, name, age, address, gpa);
        super.studentList.add(student);

    }



}
