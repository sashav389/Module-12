package Task1;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import static java.util.concurrent.TimeUnit.SECONDS;

public class StarterOfFirstTask {

    private static final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2);

    public void startFirstTask() throws InterruptedException {

        scheduler.scheduleAtFixedRate(new OneSecThread(), 1, 1, SECONDS);
        Thread.sleep(50);
        scheduler.scheduleAtFixedRate(new FiveSecThread(), 5, 5, SECONDS);
    }
}