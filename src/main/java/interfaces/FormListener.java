package interfaces;

import events.FormEvent;

import java.util.EventListener;

public interface FormListener extends EventListener {
    void formEventOccurred(FormEvent e);
}
