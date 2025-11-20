package com.suraev;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.model.naming.CamelCaseToUnderscoresNamingStrategy;
import org.hibernate.boot.model.naming.PhysicalNamingStrategy;
import org.hibernate.cfg.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;

public class HibernateRunner {

    public static void main(String[] args) throws SQLException {

      /*  Connection connection = DriverManager
                .getConnection("jdbc:postgresql://192.168.10.2:5432/postgres", "postgres", "123");
*/
        Configuration configuration = new Configuration();
        //configuration.setPhysicalNamingStrategy(new CamelCaseToUnderscoresNamingStrategy());
        configuration.configure();

        try (SessionFactory sessionFactory = configuration.buildSessionFactory();
             Session ses = sessionFactory.openSession()) {

            ses.beginTransaction();

            User currentUser = User.builder()
                    .username("suravvvitaly@gmail.co1m1")
                    .firstName("Vitaly")
                    .lastName("Surayev")
                    .dateOfBirth(LocalDate.of(1996, 10, 21))
                    .role(Role.USER)
                    .age(23)
                    .build();

            ses.persist(currentUser);

            ses.getTransaction().commit();
        }




    }
}
