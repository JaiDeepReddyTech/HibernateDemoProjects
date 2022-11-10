package com.jai.shoppingmall.repository;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.jai.shoppingmall.entities.Brand;

public class BrandRespository {
	public Session openSession() {
		// creating configuration
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(Brand.class);
		SessionFactory factory = configuration.buildSessionFactory();
		return factory.openSession();
	}

	public void saveBrandDetails(ArrayList<Brand> brand) {

		try {

			// create session
			Session session = openSession();
			Transaction transaction = session.beginTransaction();
			for (Brand b : brand) {
				session.save(b);
			}
			transaction.commit();
		} catch (Exception e) {

			e.printStackTrace();
		} finally {

		}
	}

	public Brand getBrand(int i) {
		Session session = openSession();
		return session.get(Brand.class, i);

	}

	public void updateBrand() {

	}

	public void deleteBrand(Integer i) {
		try {

			// create session
			Session session = openSession();
			session.beginTransaction();
			session.delete(session.get(Brand.class, i));
			session.getTransaction().commit();

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
