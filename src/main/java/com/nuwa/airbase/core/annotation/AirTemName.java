package com.nuwa.airbase.core.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ClassName Air
 * @Description:模板
 * @Author：豆包同学
 * @Date 2020/4/11
 * @Version V1.0
 **/
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AirTemName {
    /**
     * 指定ID
     * @return
     */
    String value() default "";

    /**
     *是否启动模板引擎，进行渲染。如果node没有使用模板语法，推荐false
     * @return
     */
    boolean render() default true;
}
