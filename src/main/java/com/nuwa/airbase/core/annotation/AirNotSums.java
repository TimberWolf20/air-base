package com.nuwa.airbase.core.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ClassName AirNotSums
 * @Description: 数量不记
 * @Author：豆包同学
 * @Date 2020/4/11
 * @Version V1.0
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD,ElementType.PARAMETER })
public @interface AirNotSums {
}
