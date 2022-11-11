package com.test;

import com.entity.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveObjectTest {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml"); // Populates the properties from the cfg file
        System.out.println(configuration.getProperties()); // Prints the properties
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        System.out.println(sessionFactory.getClass());
        Session session = sessionFactory.openSession();
        System.out.println(session.getClass());
        Transaction transaction = session.beginTransaction();
        Product product = new Product(7, "Ball", 300.00f,1);

        //Saving the object
        System.out.println("Before save method");
        session.save(product);
        System.out.println("After save method");

        // All non select operations should be committed
        transaction.commit();
        System.out.println("Object saved");

        session.close();
        sessionFactory.close();
    }
}
