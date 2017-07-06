package ru.fisher.service;

import org.springframework.stereotype.Service;
import ru.fisher.dao.UserDao;
import ru.fisher.model.User;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Tkachenko on 06.07.2017.
 */
@Service
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional
    public List<User> userList() {
        return this.userDao.listUsers();
    }
}
