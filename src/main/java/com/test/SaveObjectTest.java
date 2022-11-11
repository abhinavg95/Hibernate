package com.test;

import com.entity.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveObjectTest {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Product product = new Product(1, "MotherBoard", 11000.00f,1);

        //Saving the object
        session.save(product);

        // All non select operations should be committed
        transaction.commit();

        session.close();
        sessionFactory.close();
    }
}
