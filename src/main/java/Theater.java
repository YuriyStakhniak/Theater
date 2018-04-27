import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Theater {

    public static final int NUMBER_OF_CALLS = 3;

    public void spectacleStart() {

        CountDownLatch latch = new CountDownLatch(NUMBER_OF_CALLS);
        ExecutorService executorService = Executors.newFixedThreadPool(NUMBER_OF_CALLS);

        for (int i = 1; i <= NUMBER_OF_CALLS; i++) {
            executorService.submit(new Call(latch));
            System.out.println("Call #" + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

