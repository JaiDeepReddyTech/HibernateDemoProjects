package com.first.demo;
import com.first.demo.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.*;
import java.util.stream.Collectors;

public class App 
{
    
    public static void main( String[] args )
    {
//create configuration
        Configuration configuration= new Configuration();
        configuration.configure("hibernate.cfg.xml");
        configuration.addAnnotatedClass(Employee.class);
       //create session factory
        SessionFactory sessionFactory= configuration.buildSessionFactory();
        //initialize session object
        Session session=sessionFactory.openSession();
        Transaction t=session.beginTransaction();
        Query createQuery= session.createQuery("from Employee");
        List<Employee> e=createQuery.list();
        e.stream().forEach(System.out::println);
        System.out.println("==================");
//        Iterator itr= e.iterator();
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }
//        System.out.println(createQuery.list());
//        session.save(new Employee("Star","HR",32000.00));
//        System.out.println("\n"+session.get(Employee.class,2));
//        ArrayList<Employee> arr=new ArrayList<>();
//        arr.add(session.get(Employee.class,1));
//        arr.add(session.get(Employee.class,2));
//        arr.add(session.get(Employee.class,3));
//        arr.add(session.get(Employee.class,4));
//
//        session.update(emp);
        t.commit();


    }
}
