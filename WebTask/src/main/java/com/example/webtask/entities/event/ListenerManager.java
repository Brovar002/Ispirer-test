package com.example.webtask.entities.event;

import java.util.*;

public class ListenerManager {
    List<String> messages = new ArrayList<>();
    EnumMap<ListenerType, List<ChangedListener>> listeners = new EnumMap<>(ListenerType.class);

    public ListenerManager(ListenerType... types) {
        for (ListenerType operation : types) {
            this.listeners.put(operation, new ArrayList<>());
        }
    }

    public void subscribe(ListenerType listenerType, ChangedListener listener) {
        List<ChangedListener> users = listeners.get(listenerType);
        users.add(listener);
    }

    public void unsubscribe(ListenerType listenerType, ChangedListener listener) {
        List<ChangedListener> users = listeners.get(listenerType);
        users.remove(listener);
    }

    public String notify(ListenerType listenerType, Object o) {
        List<ChangedListener> users = listeners.get(listenerType);
        for (ChangedListener listener : users) {
            messages.add(listener.update(listenerType, o));
        }
        return messages.toString();
    }
}
