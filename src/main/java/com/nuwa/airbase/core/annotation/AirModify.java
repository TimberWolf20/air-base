package com.nuwa.airbase.core.annotation;

import java.lang.annotation.*;

/**
 * @ClassName AirModify
 * @Description: 修改注解
 * @Author：豆包同学
 * @Date 2020/4/11
 * @Version V1.0
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD, ElementType.ANNOTATION_TYPE })
@Documented
public @interface AirModify {

    /**
     * 主键默认id
     *
     * @return String
     */
    String id() default "id";

    /**
     * 指定当前正在修改的表
     *
     * @return String
     */
    String table() default "";


    String selectFields() default "*";

}
