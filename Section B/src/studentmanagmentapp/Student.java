/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmanagmentapp;

/**
 *
 * @author olwet
 */
public class Student {
    private String name;
    private int studentId;
    private double[] grades; // Array for multiple grades

    public Student(String name, int studentId, double[] grades) {
        this.name = name;
        this.studentId = studentId;
        this.grades = grades.clone(); // Protect array
    }

    public String getName() { return name; }
    public int getStudentId() { return studentId; }
    public double[] getGrades() { return grades.clone(); }

    public double calculateAverage() {
        double sum = 0;
        for(double grade : grades) {
            sum += grade;
        }
        return grades.length > 0 ? sum / grades.length : 0;
    }

    public String getPerformance() {
        double avg = calculateAverage();
        if(avg >= 75) return "Excellent";
        else if(avg >= 50) return "Average";
        else return "Poor";
    }

    public void printReport() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.print("Grades: ");
        for(double g : grades) System.out.print(g + " ");
        System.out.println("\nAverage: " + calculateAverage());
        System.out.println("Performance: " + getPerformance());
        System.out.println("-----------------------------");
    }
}

