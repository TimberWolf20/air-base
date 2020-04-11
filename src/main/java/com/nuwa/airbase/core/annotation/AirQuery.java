package com.nuwa.airbase.core.annotation;

import java.lang.annotation.*;

/**
 * @ClassName AirQuery
 * @Description: TODO
 * @Author：豆包同学
 * @Date 2020/4/11
 * @Version V1.0
 **/
@Repeatable(AirQueries.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD, ElementType.ANNOTATION_TYPE })
public @interface AirQuery {

    /**
     * sql语句
     *
     * @return String
     */
    String value() default "";

    /**
     * 求和语句
     *
     * @return String
     */
    String countQuery() default "";

    /**
     * 求和字段
     *
     * @return String
     */
    String countField() default "id";

    /**
     * 是否采用本地查询
     *
     * @return 布尔 boolean
     */
    boolean nativeQuery() default true; // NO_UCD
}
