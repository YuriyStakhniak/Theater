import java.util.concurrent.CountDownLatch;

public class Call implements Runnable {
    private CountDownLatch latch;

    public Call(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        latch.countDown();
    }
}
