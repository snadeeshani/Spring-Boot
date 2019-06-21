package com.virtusa.controller;

import com.virtusa.model.Movie;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie")
public class MovieInfoController {

    @RequestMapping("{movieId}")
    public Movie getMovie(@PathVariable ("movieId")String movieId)
    {
        return new Movie("1H","ABCD");
    }
}
