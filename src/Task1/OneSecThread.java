package Task1;

public class OneSecThread extends Thread{

    private Long seconds = 1L;

    @Override
    public void run() {
        System.out.println(seconds + " seconds program is running...");
        seconds++;
    }
}