package com.dekhke.app.callbacks;

import java.util.ArrayList;

import com.dekhke.app.pojo.Movie;

/**
 * Created by Windows on 02-03-2015.
 */
public interface BoxOfficeMoviesLoadedListener {
    public void onBoxOfficeMoviesLoaded(ArrayList<Movie> listMovies);
}
