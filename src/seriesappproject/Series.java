/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seriesappproject;

/**
 *
 * @author olwet
 */
public class Series {
    private int seriesID;
    private String seriesName;
    private int ageRestriction;
    private int numEpisodes;

    public Series(int seriesID, String seriesName, int ageRestriction, int numEpisodes) {
        this.seriesID = seriesID;
        this.seriesName = seriesName;
        this.ageRestriction = ageRestriction;
        this.numEpisodes = numEpisodes;
    }

    public int getSeriesID() { return seriesID; }
    public String getSeriesName() { return seriesName; }
    public int getAgeRestriction() { return ageRestriction; }
    public int getNumEpisodes() { return numEpisodes; }

    public void setSeriesName(String seriesName) { this.seriesName = seriesName; }
    public void setAgeRestriction(int ageRestriction) { this.ageRestriction = ageRestriction; }
    public void setNumEpisodes(int numEpisodes) { this.numEpisodes = numEpisodes; }

    @Override
    public String toString() {
        return "SERIES ID: " + seriesID + "\n" +
               "SERIES NAME: " + seriesName + "\n" +
               "SERIES AGE RESTRICTION: " + ageRestriction + "\n" +
               "NUMBER OF EPISODES: " + numEpisodes;
    }
}
