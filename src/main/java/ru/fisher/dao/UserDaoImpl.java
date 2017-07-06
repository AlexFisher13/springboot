package ru.fisher.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import ru.fisher.model.User;

import java.util.List;
@Repository
public class UserDaoImpl {
    private SessionFactory sessionFactory;

    public List<User> listUsers() {
        Session session = this.sessionFactory.getCurrentSession();
        List<User> userList = session.createQuery("from users").list();
        return userList;
    }
}
