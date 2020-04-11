package com.nuwa.airbase.core.annotation;

import com.nuwa.airbase.core.enumeration.Spread;

/**
 * @ClassName Transactional
 * @Description: 事务
 * @Author：豆包同学
 * @Date 2020/4/11
 * @Version V1.0
 **/
public @interface Transactional {

    /**
     * 超时,默认-1,表示永不超时
     *
     * @return int
     */
    int timeout() default -1;

    /**
     * 传播行为
     *
     * @return Spread
     */
     Spread spread() default Spread.REQUIRED;
}
