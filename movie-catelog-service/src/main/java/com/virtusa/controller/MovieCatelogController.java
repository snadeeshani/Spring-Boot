package com.virtusa.controller;

import com.virtusa.model.CatelogItem;
import com.virtusa.model.Movie;
import com.virtusa.model.Ratings;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catelog")
public class MovieCatelogController {

    @RequestMapping("{userId}")
    public List<CatelogItem> getCatelog(@PathVariable("userId") String userID)
    {
        RestTemplate restTemplate= new RestTemplate();

        //get all rated movieIds
        List<Ratings> ratings= Arrays.asList(
                new Ratings("1",1),
                new Ratings("123",2)
        );
        return ratings.stream().map(rating -> {
            Movie movie=restTemplate.getForObject("http://localhost:8084/movie/"+ rating.getMovieId(), Movie.class);
            return new CatelogItem(movie.getName(),"Hindi",rating.getRating());
        }).collect(Collectors.toList());
        //For each movie ID call movie Info and get details

        //put them all together


    }
}
