package com.nuwa.airbase.core.enumeration;

/**
 * @ClassName AirBaseContext
 * @Description: 事务传播性
 * @Author：豆包同学
 * @Date 2020/4/11
 * @Version V1.0
 **/
public enum Spread {

    /**
     * PROPAGATION_REQUIRED：如果当前没有事务，就创建一个新事务，如果当前存在事务，就加入该事务，该设置是最常用的设置。
     */
    REQUIRED,

    /**
     * PROPAGATION_SUPPORTS：支持当前事务，如果当前存在事务，就加入该事务，如果当前不存在事务，就以非事务执行。
     */
    SUPPORTS,

    /**
     * PROPAGATION_MANDATORY：支持当前事务，如果当前存在事务，就加入该事务，如果当前不存在事务，就抛出异常。
     */
    MANDATORY,

    /**
     * PROPAGATION_REQUIRES_NEW：创建新事务，无论当前存不存在事务，都创建新事务。
     */
    REQUIRES_NEW,

    /**
     * PROPAGATION_NOT_SUPPORTED：以非事务方式执行操作，如果当前存在事务，就把当前事务挂起。
     */
    NOT_SUPPORTED,

    /**
     * PROPAGATION_NEVER：以非事务方式执行，如果当前存在事务，则抛出异常。
     */
    NEVER,

    /**
     * PROPAGATION_NESTED：如果当前存在事务，则在嵌套事务内执行。如果当前没有事务， 则执行与PROPAGATION_REQUIRED类似的操作。
     */
    NESTED
}
