package designpatterns.observer;

import designpatterns.observer.editor.Editor;
import designpatterns.observer.listeners.EmailNotificationListener;
import designpatterns.observer.listeners.LogOpenListener;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("C:\\Windows\\Temp\\file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}