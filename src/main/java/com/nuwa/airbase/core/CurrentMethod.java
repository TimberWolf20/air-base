package com.nuwa.airbase.core;

import com.nuwa.airbase.core.annotation.*;

import java.lang.reflect.Parameter;

/**
 * @ClassName CurrentMethod
 * @Description: 当前方法基类
 * @Author：豆包同学
 * @Date 2020/4/11
 * @Version V1.0
 **/
public class CurrentMethod {
    private final CurrentMethod currentMethod;
    private final AirModify airModify;
    private final AirQuery[] airQueries;
    private final Parameter[] parameters;
    private final boolean containQueryBuilderParam;
    private final Class<?> returnType;
    private final AirKey airKey;
    private final Transactional t;
    private final AirTemName airTemName;
    private final AirNotSums airNotSums;


    public CurrentMethod(CurrentMethod currentMethod, AirModify airModify, AirQuery[] airQueries, Parameter[] parameters, boolean containQueryBuilderParam, Class<?> returnType, AirKey airKey, Transactional t, AirTemName airTemName, AirNotSums airNotSums) {
        this.currentMethod = currentMethod;
        this.airModify = airModify;
        this.airQueries = airQueries;
        this.parameters = parameters;
        this.containQueryBuilderParam = containQueryBuilderParam;
        this.returnType = returnType;
        this.airKey = airKey;
        this.t = t;
        this.airTemName = airTemName;
        this.airNotSums = airNotSums;
    }
}
