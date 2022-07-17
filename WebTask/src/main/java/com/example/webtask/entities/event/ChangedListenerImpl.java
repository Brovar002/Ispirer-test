package com.example.webtask.entities.event;

import com.example.webtask.entities.ListUsr;

import java.time.LocalDateTime;

public class ChangedListenerImpl implements ChangedListener {
    private final ListUsr<?> list;

    public ChangedListenerImpl(ListUsr<?> list) {
        this.list = list;
    }

    @Override
    public String update(ListenerType event, Object object) {
        return (LocalDateTime.now() + " list " + list.hashCode()
                + ", " + event);
    }
}
