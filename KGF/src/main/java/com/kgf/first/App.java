package com.kgf.first;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.kgf.first.entity.Movie;
import com.kgf.first.repo.MovieRepo;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

//        System.out.println(movie);
//		MovieRepo rep = new MovieRepo(new Movie("Kantara", "30Cr", "RS"));
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Movie.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Movie m = session.get(Movie.class, 3);
		System.out.println("before From db" + m);
		if (m != null) {
			session.delete(m);
		} else {
			System.out.println("no obj");
		}
		session.beginTransaction().commit();
		
		System.out.println("after From db" + m);

	}
}
