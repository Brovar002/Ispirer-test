package com.example.webtask.entities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;
@Component
@Scope("prototype")
public class Counter {
    private static final AtomicInteger atomicInteger = new AtomicInteger(0);
    static final Logger LOGGER = LogManager.getLogger();

    public Counter() {
        atomicInteger.getAndIncrement();

    }

    public static int getClassCount(){
        //LOGGER.info(atomicInteger.get()); // проверка на количество экземляров в памяти
        return atomicInteger.get();
    }
}
