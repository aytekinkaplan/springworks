package com.springworks.springworks;

public class TvSeries {
    private String title;
    private String episode;
    private double rating;

    public TvSeries(String title, String episode, double rating) {
        this.title = title;
        this.episode = episode;
        this.rating = rating;
    }

    public TvSeries() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEpisode() {
        return episode;
    }

    public void setEpisode(String episode) {
        this.episode = episode;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
