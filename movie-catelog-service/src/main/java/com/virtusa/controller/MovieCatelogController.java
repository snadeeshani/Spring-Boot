package com.virtusa.controller;

import com.virtusa.model.CatelogItem;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/catelog")
public class MovieCatelogController {

    @RequestMapping("{userId}")
    public List<CatelogItem> getCatelog(@PathVariable("userId") String userID)
    {
        return Collections.singletonList(
                new CatelogItem("ABCD","Hindi",1)
        );

    }
}
