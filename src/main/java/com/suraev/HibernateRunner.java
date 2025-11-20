package com.suraev;


import com.suraev.converter.BirthDayConverter;
import com.suraev.entity.Birthday;
import com.suraev.entity.Role;
import com.suraev.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.SQLException;
import java.time.LocalDate;

public class HibernateRunner {

    public static void main(String[] args) throws SQLException {

      /*  Connection connection = DriverManager
                .getConnection("jdbc:postgresql://192.168.10.2:5432/postgres", "postgres", "123");
*/
        Configuration configuration = new Configuration();
        //configuration.setPhysicalNamingStrategy(new CamelCaseToUnderscoresNamingStrategy());
        configuration.addAttributeConverter(new BirthDayConverter());
        configuration.configure();

        try (SessionFactory sessionFactory = configuration.buildSessionFactory();
             Session ses = sessionFactory.openSession()) {

            ses.beginTransaction();

            User currentUser = User.builder()
                    .username("suravvvital1y@gma111i1l.co1m1")
                    .firstName("Vitaly")
                    .lastName("Surayev")
                    .dateOfBirth(new Birthday(LocalDate.of(1996, 10, 21)))
                    .role(Role.USER)
                    .build();

            User user = ses.find(User.class, "suravvvital1y@gmai1l.co1m1");

            ses.getTransaction().commit();
        }




    }
}
