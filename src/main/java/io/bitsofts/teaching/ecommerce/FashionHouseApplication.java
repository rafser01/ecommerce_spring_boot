package io.bitsofts.teaching.ecommerce;
// https://o7planning.org/11683/spring-boot-apache-tiles-jsp

import javax.persistence.EntityManagerFactory;
import org.hibernate.SessionFactory;
import org.hibernate.ejb.HibernateEntityManagerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.vendor.HibernateJpaSessionFactoryBean;


@SpringBootApplication
public class FashionHouseApplication {

    public static void main(String[] args) {
        SpringApplication.run(FashionHouseApplication.class, args);
    }



}
