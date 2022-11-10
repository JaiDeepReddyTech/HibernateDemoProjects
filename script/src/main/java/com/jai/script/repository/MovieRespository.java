package com.jai.script.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.jai.script.entity.Movie;

public class MovieRespository {
	public void saveMovieDetails(Movie movie) {

		try {
			// creating configuration
			Configuration configuration = new Configuration();
			configuration.configure("hibernate.cfg.xml");
//			configuration.addAnnotatedClass(Movie.class);
			// create sessionFactory
			SessionFactory factory = configuration.buildSessionFactory();
			// create session
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(movie);
			transaction.commit();
		} catch (Exception e) {

			e.printStackTrace();
		} finally {

		}
	}

	public void getMovie() {

	}

	public void updateMovie() {

	}

	public void deleteMovie() {

		try {
			// creating configuration
			Configuration configuration = new Configuration();
			configuration.configure("hibernate.cfg.xml");
//			configuration.addAnnotatedClass(Movie.class);
			// create sessionFactory
			SessionFactory factory = configuration.buildSessionFactory();
			// create session
			Session session = factory.openSession();
			session.beginTransaction();

			session.delete(session.get(Movie.class, 7));
			session.getTransaction().commit();

		} catch (Exception e) {

			e.printStackTrace();
		} finally {

		}
	}

}
