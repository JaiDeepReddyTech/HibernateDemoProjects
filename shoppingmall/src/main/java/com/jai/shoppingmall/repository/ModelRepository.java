package com.jai.shoppingmall.repository;

import java.util.ArrayList;
import java.util.Iterator;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.jai.shoppingmall.entities.Model;

public class ModelRepository {
	public Session openSession() {

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(Model.class);
		SessionFactory factory = configuration.buildSessionFactory();
		return factory.openSession();
	}

	public void saveModelDetails(ArrayList<Model> model) {
		try {
			// create session
			Session session = openSession();

			Transaction transaction = session.beginTransaction();
			Iterator<Model> t = model.iterator();
			while (t.hasNext()) {
				session.save(t.next());
			}
			transaction.commit();
		} catch (Exception e) {

			e.printStackTrace();
		} finally {

		}
	}

	public void getModel() {

	}

	public void updateModel() {

	}

	public void deleteModel(Integer i) {

		try {
			// create session
			Session session = openSession();
			session.beginTransaction();
			session.delete(session.get(Model.class, i));
			session.getTransaction().commit();

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
