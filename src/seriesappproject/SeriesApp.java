/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seriesappproject;

/**
 *
 * @author olwet
 */
import java.util.Scanner;

public class SeriesApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SeriesManager manager = new SeriesManager();
        int choice;

        do {
            System.out.println("Please select one of the following menu items:");
            System.out.println("(1) Capture a new series");
            System.out.println("(2) Search for a series");
            System.out.println("(3) Update a series");
            System.out.println("(4) Delete a series");
            System.out.println("(5) Print series report");
            System.out.println("(6) Exit Application");
            System.out.print("Enter choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1 -> manager.captureSeries();
                case 2 -> manager.searchSeries();
                case 3 -> manager.updateSeries();
                case 4 -> manager.deleteSeries();
                case 5 -> manager.seriesReport();
                case 6 -> System.out.println("Exiting application...");
                default -> System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 6);

        input.close();
    }
}
