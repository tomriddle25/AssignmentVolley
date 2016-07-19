package com.example.tomriddle.assignmentvolley.model;

/**
 * Created by tomriddle on 7/12/16.
 */
import java.util.ArrayList;

public class Movie {
    private String title, thumbnailUrl;
    private String year;
    private String rating;
    //private ArrayList<String> genre;
    private String category;

    public Movie() {
    }

    public Movie(String name, String thumbnailUrl, String year, String rating,
                 String category) {
        this.title = name;
        this.thumbnailUrl = thumbnailUrl;
        this.year = year;
        this.rating = rating;
        this.category=category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
