package com.example.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author zy
 * @version 1.0.0
 * @ClassName Boss.java
 * @Description
 * @CreateDate 2021-02-21  22:24:14
 */
@Component
public class Boss {

    @Autowired
    public Boss(Car car) {
        this.car = car;
    }

    private Car car;

    public Car getCar() {
        return car;
    }

    //@Autowired  //标注在方法，Spring容器创建当前对象，就会调用方法，完成赋值；方法使用的参数，自定义类型的值从ioc容器中获取
    public void setCar(Car car) {
        this.car = car;
    }
}
