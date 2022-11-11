package com.first.demo.factory;

import com.first.demo.entity.Employee;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class SessionFactoryUtil {
    public static SessionFactory sessionFactory;

   private SessionFactoryUtil(){
    }
    static SessionFactory getSessionFactory(){
        if(sessionFactory==null) {

            SessionFactory sessionFactory = new Configuration()
                    .configure()
                    .addAnnotatedClass(Employee.class)
                    .buildSessionFactory();
        }
        return sessionFactory;
    }
}
