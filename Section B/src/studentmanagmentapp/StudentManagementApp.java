/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentmanagmentapp;

/**
 *
 * @author olwet
 */
public class StudentManagementApp {
    public static void main(String[] args) {
        Student[] students = new Student[3];

        students[0] = new Student("Alice", 101, new double[]{80, 90, 85});
        students[1] = new GraduateStudent("Bob", 102, new double[]{70, 75, 65}, "AI in Healthcare");
        students[2] = new Student("Charlie", 103, new double[]{40, 50, 45});

        System.out.println("STUDENT PERFORMANCE REPORT");
        System.out.println("===========================");
        for(Student s : students) {
            s.printReport();
        }
    }
}

