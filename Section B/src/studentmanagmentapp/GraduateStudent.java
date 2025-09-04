/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmanagmentapp;

/**
 *
 * @author olwet
 */
public class GraduateStudent extends Student {
    private String researchTopic;

    public GraduateStudent(String name, int studentId, double[] grades, String researchTopic) {
        super(name, studentId, grades);
        this.researchTopic = researchTopic;
    }

    public String getResearchTopic() { return researchTopic; }

    @Override
    public void printReport() {
        super.printReport();
        System.out.println("Research Topic: " + researchTopic);
        System.out.println("-----------------------------");
    }
}

