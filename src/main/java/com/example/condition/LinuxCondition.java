package com.example.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author zy
 * @version 1.0.0
 * @ClassName WidowsCondition.java
 * @Description
 * @CreateDate 2021-02-20  23:17:15
 */

//判断当前的操作系统是不是linux 系统
public class LinuxCondition implements Condition {
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {

        String property = context.getEnvironment().getProperty("os.name");
        return property.contains("linux");
    }
}
