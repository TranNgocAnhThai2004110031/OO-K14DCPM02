package Tuan01.k14dcpm02.oop;

public class StudentTestDrive {
    public static void main(String[] args) {
        Student taiStudent = new Student();
        taiStudent.input();
        taiStudent.print();
        taiStudent.hoc();
        taiStudent.thi();

        Student thachStudent = new Student();
        thachStudent.input();
        thachStudent.print();
        thachStudent.doc();
        thachStudent.hoatDongNgoaiKhoa();
        
        Student trungStudent = new Student();
        trungStudent.input();
        trungStudent.print();
        trungStudent.hoatDongNgoaiKhoa();
        
    }
}
