package com.example.webtask.entities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.atomic.AtomicInteger;


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
