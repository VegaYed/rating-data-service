package com.example.ratingdataservice.models;

import lombok.Data;

@Data
public class Rating {

    private String idMovie;
    private int rating;

    public Rating(String idMovie, int rating) {
        this.idMovie = idMovie;
        this.rating = rating;
    }
}
