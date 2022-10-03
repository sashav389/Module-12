package Task2;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StarterOfSecondTask {

    public static final int N = 30;

    public void startSecondTask() {

        Queue<Integer> inQueue = IntStream.range(1, N + 1).boxed().collect(Collectors.toCollection(ArrayDeque::new));
        Queue<String> outQueue = new ArrayDeque<>();

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        executorService.submit(new ThreadA(inQueue, outQueue));
        executorService.submit(new ThreadB(inQueue, outQueue));
        executorService.submit(new ThreadC(inQueue, outQueue));
        executorService.submit(new ThreadD(outQueue));
        executorService.submit(new ThreadForNumbers(inQueue, outQueue));
    }
}