package com.mtmn.sbweb.simple;

import org.springframework.stereotype.Service;

@Service
public class NotSimpleBeanAImpl implements NotSimpleBean {

    //bean name = 'notSimpleBeanAImpl'
    public String sayHelloAgain() {
        return "Hello";
    }
}
