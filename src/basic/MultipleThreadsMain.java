package basic;

public class MultipleThreadsMain {
    public static void main(String[] args) {
        new FirstThread().start();
        new SecondThread().start();
    }

    private static class FirstThread extends Thread {
        public FirstThread() {
            setName("First thread");
        }

        @Override
        public void run() {
            while (true) {
                //Some heavy task
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(1);
            }
        }
    }

    private static class SecondThread extends Thread {
        public SecondThread() {
            setName("Second thread");
        }

        @Override
        public void run() {
            while (true) {
                //Some heavy task
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("1");
            }
        }
    }
}
