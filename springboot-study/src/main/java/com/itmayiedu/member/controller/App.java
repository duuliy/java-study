package com.itmayiedu.member.controller;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

//启动代码抽离处理
//@EnableAutoConfiguration
//@ComponentScan(basePackages = {"com.itmayiedu.member.controller", "com.itmayiedu.member.controller.controller"})
@SpringBootApplication
@MapperScan(basePackages = {"com.itmayiedu.member.controller"})
@EnableAsync
public class App {


    public static void main(String[] args){
        SpringApplication.run(App.class, args);
    }

}

/**
 * SpringApplication 跑起来
 * @ComponentScan("xx") 启动的扫包范围
 *
 * @SpringBootApplication 本级包以及子包启动，小项目用，比较消耗性能
 *
 * @Value 初始化的时候从application.properties取值
 *
 * @Component 没有明确角色的组件
 * @Service 在业务逻辑层（Service层）使用
 * @Repositpry 在数据访问层（dao层）使用
 * @Controller 用于标注控制层组件
 * @Bean 实例化
 *
 *
 * @MapperScan 全局注入Mapper 相当于依赖注入连接池
 *
 * @EnableAsync 开启异步调用 提高扫包性能
 * */


/**
 * swagger:
 * tags	String[]	控制器标签。
 * description	String	控制器描述（该字段被申明为过期）。
 *
 *
 * @ApiOperation: 可设置对接口的描述:
 * value	String	接口说明。
 * notes	String	接口发布说明。
 * tags	Stirng[]	标签。
 * response	Class<?>	接口返回类型。
 * httpMethod	String	接口请求方式。
 *
 * @ApiIgnore: Swagger 文档不会显示拥有该注解的接口。
 * @ApiImplicitParams: 用于描述接口的非对象参数集。
 * @ApiImplicitParam: 用于描述接口的非对象参数，一般与 @ApiImplicitParams 组合使用。
 *
 * @ApiModel: 可设置接口相关实体的描述。
 * @ApiModelProperty: 可设置实体属性的相关描述:
 * value	String	字段说明。
 * name	String	重写字段名称。
 * dataType	Stirng	重写字段类型。
 * required	boolean	是否必填。
 * example	Stirng	举例说明。
 * hidden	boolean	是否在文档中隐藏该字段。
 * allowEmptyValue	boolean	是否允许为空。
 * allowableValues	String	该字段允许的值，当我们 API 的某个参数为枚举类型时，使用这个属性就可以清楚地告诉 API 使用者该参数所能允许传入的值。
 *
 * */