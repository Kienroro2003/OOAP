package chapter_02;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class DogDoor {
    private boolean open;
    private List allowedBarks;

    public DogDoor() {
        this.open = false;
    }

    public void open(){
        System.out.println("The dog door opens.");
        open = true;

        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                close();
                timer.cancel();
            }
        }, 5000);
    }

    public List getAllowedBarks() {
        return allowedBarks;
    }

    public void close(){
        System.out.println("The dog door closes.");
        open = false;
    }

    public boolean isOpen(){
        return open;
    }
}
