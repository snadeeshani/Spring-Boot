package com.virtusa.controller;

import com.virtusa.model.Ratings;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratings")
public class RatingController {

    @RequestMapping("{movieId}")
    public Ratings getRatings(@PathVariable ("movieId") String movieId)
    {
        return new Ratings("1",1);
    }
}
