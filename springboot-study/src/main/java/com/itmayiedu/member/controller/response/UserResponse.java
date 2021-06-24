package com.itmayiedu.member.controller.response;


/**
 * 相当于继承bean  但是改变bean的数据结构
 * class Dao{
 *     private Student student;
 *
 *
 *
 * }
 *
 * class = new Service();
 * class.setStudent(student);
 *
 *
 * @Autowired
 * Controller controlelr = new Controller();
 *  new Service();\
 *  controlelr.setService(Dao);
 *
 *
 *
 * controlelr.getServcie()
 *
 */

public class UserResponse {
    private int id;
    private String userName;
    private short sex;
    private short height;

    public UserResponse(){}

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

    public short getSex() {
        return sex;
    }

    public void setSex(short sex) {
        this.sex = sex;
    }

    public short getHeight() {
        return height;
    }

    public void setHeight(short height) {
        this.height = height;
    }
}

