package Task2;

import java.util.Queue;

public class ThreadD extends Thread{

    private final Queue<String> outQueue;

    public ThreadD(Queue<String> outQueue) {
        this.outQueue = outQueue;
    }

    @Override
    public void run() {
        while (true) {

            if (!outQueue.isEmpty()) {
                System.out.print(outQueue.poll() + ", ");
            }

            try {
                sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}