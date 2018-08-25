package com.imooc.miaosha.service;

import com.imooc.miaosha.dao.UserDao;
import com.imooc.miaosha.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author: woodpecker
 * @Date: 2018/8/16 12:35
 */

@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public User getById(int id){
        return userDao.getById(id);
    }

    //由于整个方法有事务控制，而user2插入失败，所以user1也会失败
    @Transactional
    public Boolean tx() {
        User user1 = new User();
        user1.setId(2);
        user1.setName("2222");
        userDao.insert(user1);

        User user2 = new User();
        user2.setId(1);
        user2.setName("1111");
        userDao.insert(user2);

        return true;
    }
}
