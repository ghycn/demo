package synchronzed;

public class SingletonTest {
    public static void main(final String[] args) throws InterruptedException {
        for (int i = 1; i <= 100; i++) {
            final Thread thread = new Thread(new ThreadSingleton());
            thread.setName("thread" + i);
            thread.start();
        }
    }

    public static class ThreadSingleton implements Runnable {
        @Override
        public void run() {
            Singleton.getInstance();
        }
    }
}
