package observer.demoprogram;

import javax.security.auth.Subject;

public abstract class Observer {
    public Subject subject;

    public void Observer (Subject subject) {
        this.subject = subject;
    }

    public abstract void update();
}
