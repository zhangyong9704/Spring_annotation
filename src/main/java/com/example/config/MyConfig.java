package com.example.config;

import com.example.bean.Person;
import com.example.condition.LinuxCondition;
import com.example.condition.WidowsCondition;
import org.springframework.context.annotation.*;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_SINGLETON;

/**
 * @author zy
 * @version 1.0.0
 * @ClassName MyConfig.java
 * @Description
 * @CreateDate 2021-02-20  22:08:02
 */
//配置类的方式进行注入
@Configuration  //告诉spring这是一个配置类
public class MyConfig {

    //@Bean("Person")  通过这种形式可以变更注入的名称
    @Bean  //默认是方法名称的小写
    @Scope(value = SCOPE_SINGLETON)
    @Lazy
    public Person person(){
        return new Person("张三",18);
    }


    @Bean
    @Conditional(value = {WidowsCondition.class})  //当前操作系统是windows时会注入windows组件
    public Person windows(){
        return new Person("张三",18);
    }

    @Bean
    @Conditional(LinuxCondition.class) //当前操作系统是linux时会注入linux组件
    public Person linux(){
        return new Person("张三",18);
    }
}
