package com.nuwa.airbase.structure;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * @ClassName Substance
 * @Description: air-base 基础
 * @Author 豆包同学
 * @Date 2020/4/11
 * @Version V1.0
 **/
public class Substance {
    private static final Logger logger = LoggerFactory.getLogger(Substance.class);
    /**
     * 未执行SQL
     */
    private String airSql;
    /**
     * 占位符所对应的参数
     */
    private List<Object> airValues;


    public Substance(){}

    public Substance(String airSql,List<Object> airValues){

    }

}
