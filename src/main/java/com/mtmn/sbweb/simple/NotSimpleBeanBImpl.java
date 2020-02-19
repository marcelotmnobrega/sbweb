package com.mtmn.sbweb.simple;

import org.springframework.stereotype.Service;

@Service
public class NotSimpleBeanBImpl implements NotSimpleBean {

    //bean name = 'notSimpleBeanBImpl'
    public String sayHelloAgain() {
        return "Hello";
    }
}
