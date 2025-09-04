/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seriesappproject;

/**
 *
 * @author olwet
 */
import java.util.ArrayList;
import java.util.Scanner;

public class SeriesManager {
    private ArrayList<Series> seriesList = new ArrayList<>();
    private Scanner input = new Scanner(System.in);

    
    public void captureSeries() {
        System.out.print("Enter series ID: ");
        int id = input.nextInt();
        input.nextLine();

        System.out.print("Enter series name: ");
        String name = input.nextLine();

        System.out.print("Enter age restriction: ");
        int age = input.nextInt();

        System.out.print("Enter number of episodes: ");
        int episodes = input.nextInt();

        seriesList.add(new Series(id, name, age, episodes));
        System.out.println("Series successfully added!\n");
    }

    public void searchSeries() {
        System.out.print("Enter the series ID to search: ");
        int id = input.nextInt();
        Series s = findSeriesById(id);

        if (s != null) {
            System.out.println("\n" + s + "\n");
        } else {
            System.out.println("Series with Series ID: " + id + " was not found!\n");
        }
    }

    public void updateSeries() {
        System.out.print("Enter the series ID to update: ");
        int id = input.nextInt();
        input.nextLine();

        Series s = findSeriesById(id);
        if (s != null) {
            System.out.print("Enter the new series name: ");
            s.setSeriesName(input.nextLine());

            System.out.print("Enter the new age restriction: ");
            s.setAgeRestriction(input.nextInt());

            System.out.print("Enter the new number of episodes: ");
            s.setNumEpisodes(input.nextInt());

            System.out.println("Series updated successfully!\n");
        } else {
            System.out.println("Series with Series ID: " + id + " was not found!\n");
        }
    }

    public void deleteSeries() {
        System.out.print("Enter the series ID to delete: ");
        int id = input.nextInt();
        input.nextLine();

        Series s = findSeriesById(id);
        if (s != null) {
            System.out.print("Are you sure you want to delete series " + id + "? (y/n): ");
            String confirm = input.nextLine();
            if (confirm.equalsIgnoreCase("y")) {
                seriesList.remove(s);
                System.out.println("Series with Series ID: " + id + " was deleted!\n");
            } else {
                System.out.println("Delete cancelled.\n");
            }
        } else {
            System.out.println("Series with Series ID: " + id + " was not found!\n");
        }
    }

    public void seriesReport() {
        if (seriesList.isEmpty()) {
            System.out.println("No series available!\n");
            return;
        }
        int count = 1;
        for (Series s : seriesList) {
            System.out.println("Series " + count + "\n" + s + "\n");
            count++;
        }
    }

    public Series findSeriesById(int id) {
        for (Series s : seriesList) {
            if (s.getSeriesID() == id) {
                return s;
            }
        }
        return null;
    }

    public boolean updateSeriesById(int id, String newName, int newAge, int newEpisodes) {
        Series s = findSeriesById(id);
        if (s != null) {
            s.setSeriesName(newName);
            s.setAgeRestriction(newAge);
            s.setNumEpisodes(newEpisodes);
            return true;
        }
        return false;
    }

    public boolean deleteSeriesById(int id) {
        Series s = findSeriesById(id);
        if (s != null) {
            seriesList.remove(s);
            return true;
        }
        return false;
    }

    public boolean isAgeRestrictionValid(int age) {
        // Example rule: valid age between 0 and 21 inclusive
        return age >= 0 && age <= 21;
    }

    // Allows tests to insert series directly
    public void addSeries(Series series) {
        seriesList.add(series);
    }
}

