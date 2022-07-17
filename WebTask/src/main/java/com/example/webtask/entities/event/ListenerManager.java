package com.example.webtask.entities.event;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListenerManager {
    List<String> messages = new ArrayList<>();
    Map<ListenerType, List<ChangedListener>> listeners = new HashMap<>();

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
