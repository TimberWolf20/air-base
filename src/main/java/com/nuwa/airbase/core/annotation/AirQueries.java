package com.nuwa.airbase.core.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ClassName AirQueries
 * @Description: TODO
 * @Author：豆包同学
 * @Date 2020/4/11
 * @Version V1.0
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD, ElementType.ANNOTATION_TYPE })
public @interface AirQueries {
    AirQuery[] value() default {};
}
