package by.goncharov.desktoptask.entities.event;


import by.goncharov.desktoptask.entities.ListUsr;

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
