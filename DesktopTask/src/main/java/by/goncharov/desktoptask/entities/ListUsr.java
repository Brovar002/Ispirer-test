package by.goncharov.desktoptask.entities;

import by.goncharov.desktoptask.entities.event.ChangedListenerImpl;
import by.goncharov.desktoptask.entities.event.ListenerManager;
import by.goncharov.desktoptask.entities.event.ListenerType;

import java.util.Arrays;
import java.util.Objects;
import java.util.StringJoiner;
import java.util.stream.Stream;
public class ListUsr<E> {
    private static final Object[] EMPTY_DATA = {};
    private static final int DEFAULT_CAPACITY_EMPTY_DATA = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private static int size;

    private static Object[] data;
    private ListenerManager events;
    private ChangedListenerImpl listener;

    public ListUsr() {
        size = DEFAULT_CAPACITY_EMPTY_DATA;
        this.data = EMPTY_DATA;
        events = new ListenerManager(ListenerType.CHANGED);
    }

    public String add(E element) {
        add(size, element);
        return events.notify(ListenerType.CHANGED, element);
    }

    public Object get(int index) {
        return data[index];
    }

    public ChangedListenerImpl getListener() {
        return listener;
    }

    public static String show() {
        StringJoiner sj = new StringJoiner(", ");
        Stream<Object> stream = Arrays.stream(data);
        stream.filter(Objects::nonNull).forEach(e -> sj.add(e.toString()));
        return "{" + sj.toString() + "}";
    }
    public static int getSize() {
        return size;
    }

    public int capacity() {
        return data.length;
    }

    public void addChangedListener() {
        if (listener == null) {
            listener = new ChangedListenerImpl(this);
            events.subscribe(ListenerType.CHANGED, listener);
        }

    }

    public void removeChangedListener() {
        if (listener != null) {
            events.unsubscribe(ListenerType.CHANGED, listener);
        }

    }

    private Object[] grow() {
        return Arrays.copyOf(data, newCapacity());
    }

    private void add(int index, E element) {
        if (index == data.length)
            data = grow();
        data[index] = element;
        size = index + 1;
    }

    private int newCapacity() {
        int oldCapacity = data.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        if (data == EMPTY_DATA) {
            return DEFAULT_CAPACITY;
        }
        return newCapacity;
    }


    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner(", ");
        Stream<Object> stream = Arrays.stream(data);
        stream.filter(Objects::nonNull).forEach(e -> sj.add(e.toString()));
        return "[ListUsr {" + sj.toString() + "}]";
    }
}