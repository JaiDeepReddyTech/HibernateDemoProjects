package com.kgf.first.repo;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.kgf.first.entity.Movie;

public class MovieRepo {
 private Movie movie;
 
 
	public MovieRepo(Movie movie) {
	super();
	this.movie = movie;
}


	public void deleteMovie(int i) {
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Movie.class);
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Movie m=session.get(Movie.class,i);
		if(m!=null) {
			session.delete(m);			
		}else {
			System.out.println("no obj");
		}
		session.beginTransaction().commit();
		System.out.println("from con"+movie);
		System.out.println("From db"+m);
			
	}
}
