package com.example.ratingdataservice.models;

import lombok.Data;
import java.util.List;

@Data
public class UserRating {

    private List<Rating> userRating;

}
