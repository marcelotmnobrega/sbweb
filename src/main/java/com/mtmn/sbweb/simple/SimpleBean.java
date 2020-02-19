package com.mtmn.sbweb.simple;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SimpleBean {

    //injected by name
    private final NotSimpleBean notSimpleBeanAImpl;

    //bean name = 'simpleBean'
    public String sayHello() {
        return "Hello";
    }

}
