package com.itmayiedu.member.controller.dao;


import com.itmayiedu.member.controller.bean.UserBean;
import com.itmayiedu.member.controller.controller.UserController;
import com.itmayiedu.member.controller.response.UserResponse;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface  UserDao {

    /**
     * 查询所有用户信息
     */
    @Select("SELECT * FROM user")
    List<UserBean> findAllUser();

    @Select("SELECT * FROM user")
//    @Result(property="userName ",column ="user_Name")
    List<UserResponse> findAllUser2();


//    SELECT * FROM t_student WHERE stuname LIKE "王%"; -- % 通配0-N字符的模糊查询
//    查询
    @Select("SELECT * FROM user WHERE userName = #{name} ")
    List<UserBean> findUserByNames(@Param("name") String name);

    /**
     * 通过名字查询用户信息
     */
    List<UserBean> findUserByName(String name);


    //增
    @Insert("INSERT INTO user(id,userName, sex,height,weight) VALUES(#{id}, #{userName}, #{sex}, #{height}, #{weight})")
//    void insertUser(@Param("id") Integer id,@Param("userName") String userName, @Param("sex") Integer sex, @Param("height") Integer height, @Param("wight") Integer weight);
    void insertUser(UserController.Usern usern);

    //删
    @Delete("DELETE FROM user WHERE id = #{id}")
    void deleteUser(@Param("id") int id);

    //改
}

/**
 * @Select 是查询类的注解，所有的查询均使用这个
 * @Result 修饰返回的结果集，关联实体类属性和数据库字段一一对应，如果实体类属性和数据库属性名保持一致，就不需要这个属性来修饰。
 * @Insert 插入数据库使用，直接传入实体类会自动解析属性到对应的值
 * @Update 负责修改，也可以直接传入对象
 * @delete 负责删除
 *
 * @Param 参数
 *
 * */