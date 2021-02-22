package com.example.config;

import com.example.service.BookService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * @author zy
 * @version 1.0.0
 * @ClassName MainConfig.java
 * @Description
 * @CreateDate 2021-02-20  22:23:54
 */
@Configuration
@ComponentScan(value = "com.example",
//        excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class, Service.class})},
        includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class, Service.class}),
        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,classes = {BookService.class})},
        useDefaultFilters = false
        )  //告诉Spring需要扫描组件的位置
//@ComponentScans(value = {
//        @ComponentScan(value = "com.example",
////        excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class, Service.class})},
//                includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class, Service.class})},
//                useDefaultFilters = false
//        ),  //告诉Spring需要扫描组件的位置
//        @ComponentScan(value = "com.example",
////        excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class, Service.class})},
//                includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class, Service.class})},
//                useDefaultFilters = false
//        )  //告诉Spring需要扫描组件的位置
//})
public class MainConfig {


}
