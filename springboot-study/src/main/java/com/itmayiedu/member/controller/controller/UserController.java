package com.itmayiedu.member.controller.controller;


import com.itmayiedu.member.controller.bean.UserBean;
import com.itmayiedu.member.controller.response.UserResponse;
import com.itmayiedu.member.controller.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/select",method = RequestMethod.GET)
    public List<UserBean> testSelectAll() {
        return userService.selectAllUser();
    }

    @RequestMapping(value = "/select2",method = RequestMethod.GET)
    public UserResponse select2() {
        return userService.selectAllUser2().get(0);
    }

    @RequestMapping(value = "/findUserByNames2",method = RequestMethod.GET)
    public List<UserBean> findUserByNames(@RequestParam("name") String name) {
        System.out.println(name);
        return userService.findUserByNames(name);
    }

    public static class reqN{
        private String name;
        public reqN() {

        }
        public reqN(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
    //    @RequestBody
    //    @RequestParam
    @RequestMapping(value = "/findUserByNames",method = RequestMethod.POST)
    public List<UserBean> findUserByNames(@RequestBody reqN reqn) {
        System.out.println(reqn.getName());
        return userService.findUserByNames(reqn.getName());
    }

    @Transactional
    @RequestMapping(value = "/findUserByName",method = RequestMethod.GET)
    public List<UserBean> findUserByName(@RequestParam("name") String name) {
        System.out.println(name);
        return userService.findUserByName(name);
    }

    @RequestMapping(value = "/deleteUser",method = RequestMethod.GET)
    public String deleteUser(@RequestParam("id") int id) {
        userService.deleteUser(id);
        return "删除成功";
    }

    public static class Usern{
        private int id;
        private String userName;
        private String sex;
        private String height;
        private String weight;

        public Usern() {}

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }

        public String getWeight() {
            return weight;
        }

        public void setWeight(String weight) {
            this.weight = weight;
        }
    }

    //这样方便很多，不用一个个的写
    @RequestMapping(value = "/adduser",method = RequestMethod.POST)
    public String insertUser(@RequestBody Usern usern) {
        System.out.println(usern.getUserName());
        userService.insertUser(usern);
        return "插入成功";
    }
}


/**
 * @Autowired 引入serive
 * @RequestBody 接收post参数
 * @RequestParam 接收get参数
 *
 * @Transactional 异常捕获
 * 如果出现异常 则报错行不会往下执行，不得加进数据库
 * 也可以指定某个数据库
 *
 *
 * */


/**
 * 多数据库怎么区分:
 * 也可以用bean
 * @Datasource(ref="配置文件里面数据库名字")
 *
 * */