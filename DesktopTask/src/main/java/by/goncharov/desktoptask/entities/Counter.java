package by.goncharov.desktoptask.entities;

import java.util.concurrent.atomic.AtomicInteger;
public class Counter {
    private static final AtomicInteger atomicInteger = new AtomicInteger(0);
    public Counter() {
        atomicInteger.getAndIncrement();

    }

    public static int getClassCount(){
        return atomicInteger.get();
    }
}
