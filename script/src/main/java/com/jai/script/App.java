package com.jai.script;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jai.script.entity.Movie;
import com.jai.script.repository.MovieRespository;


public class App 
{
    public static void main( String[] args )
    {

    	Movie movie = new Movie();
    	movie.setId(13);
    	movie.setName("Darling");
    	movie.setActorName("Prabhas");
    	movie.setActressName("Anuska");
    	movie.setBudget("10cr");
    	movie.setRating("4.8");
    	MovieRespository respository = new MovieRespository();
//    	respository.saveMovieDetails(movie);
//    	respository.deleteMovie();
        
    }
}
