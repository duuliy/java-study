package com.itmayiedu.member.controller;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.itmayiedu.member.controller.Example;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExampleTests {

    @Autowired
    private Example example2;

    @Test
    public void hello() {
        Assert.assertSame("hello world",example2.hello());
    }

    //初始化执行
//    @Before
//    public void setUp() throws Exception {
//        mvc = MockMvcBuilders.standaloneSetup(new HelloController()).build();
//    }
//
//    //验证controller是否正常响应并打印返回结果
//    @Test
//    public void getHello() throws Exception {
//        mvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andDo(MockMvcResultHandlers.print())
//                .andReturn();
//    }
//
//    //验证controller是否正常响应并判断返回结果是否正确
//    @Test
//    public void testHello() throws Exception {
//        mvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk())
//                .andExpect(content().string(equalTo("Hello World")));
//    }

}



/**
 * @RunWith(SpringRunner.class)  单元测试用
 * @SpringBootTest  单元测试用
 *
 *
 *  Assert.assertSame  是否等于某值
 *
 * */
