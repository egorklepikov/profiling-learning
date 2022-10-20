package basic;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class FixedThreadPoolMain {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(3);
        executor.submit(() -> {
            while (true) {
                //Some heavy task
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(1);
            }
        });
        executor.submit(() -> {
            while (true) {
                //Some heavy task
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("1");
            }
        });
        executor.submit(() -> {
            while (true) {
                //Some heavy task
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(1.2f);
            }
        });
    }
}
