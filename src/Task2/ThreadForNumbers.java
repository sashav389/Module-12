package Task2;

import java.util.Queue;

public class ThreadForNumbers extends Thread{

    private final Queue<Integer> inQueue;
    private final Queue<String> outQueue;

    public ThreadForNumbers(Queue<Integer> inQueue, Queue<String> outQueue) {
        this.inQueue = inQueue;
        this.outQueue = outQueue;
    }

    @Override
    public void run() {
        while (true) {
            if (!inQueue.isEmpty()) {
                if (!(inQueue.peek() % 3 == 0 || inQueue.peek() % 5 == 0)) {
                    outQueue.add(inQueue.poll().toString());
                }
            }

            try {
                sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}