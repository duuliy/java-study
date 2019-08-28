package com.itmayiedu.member.controller.service;


import com.itmayiedu.member.controller.bean.UserBean;
import com.itmayiedu.member.controller.controller.UserController;
import com.itmayiedu.member.controller.dao.UserDao;
import com.itmayiedu.member.controller.response.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public List<UserBean> selectAllUser() {

//        List<UserBean> allUser = userDao.findAllUser();
//
//
//        allUser.forEach(e ->{
//            e.setWight(0);
//        });
        return userDao.findAllUser();
    }


    public List<UserResponse> selectAllUser2() {
        return userDao.findAllUser2();
    }

    public List<UserBean> findUserByNames(String name) {
        return userDao.findUserByNames(name);
    }

    public List<UserBean> findUserByName(String name) {
        return userDao.findUserByName(name);
    }

    public void deleteUser(int id) {
        userDao.deleteUser(id);
    }

    //    public void insertUser(int id,String userName,int sex,int height,int wight) {
//        userDao.insertUser(id,userName,sex,height,wight);
//    }
    public void insertUser(UserController.Usern usern) {
        userDao.insertUser(usern);
    }


//    insertUser


}

/**
 * @Autowired 相当于实例化 直接使用
 * @Service 告诉spring这里是个service
 */