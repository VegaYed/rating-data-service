package com.example.ratingdataservice.resources;

import com.example.ratingdataservice.models.Rating;
import com.example.ratingdataservice.models.UserRating;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("ratingsdata")
public class RatingResource {

    @GetMapping("/{movieId}")
    public Rating getRating(@PathVariable String movieId){
        return new Rating("1", 10);
    }

    @GetMapping("/user/{id}")
    public UserRating getUserRating(@PathVariable String id){
        List<Rating> ratings = Arrays.asList(
                new Rating("123", 4),
                new Rating("456", 3)
        );
        UserRating userRating = new UserRating();
        userRating.setUserRating(ratings);
        return userRating;
    }

}
