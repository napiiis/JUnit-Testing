package com.example.test.movieSearch.model;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

import java.util.ArrayList;

@JsonObject
public class MovieSearchResult {
    @JsonField(name = "Search")
    public ArrayList<Movie> movieSearchList;
}
