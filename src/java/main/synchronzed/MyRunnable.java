package synchronzed;

public class MyRunnable implements Runnable {

    private int count=5;

    @Override
    public synchronized void run() {
        count--;
        System.out.println(Thread.currentThread().getName()+" count:"+count);
    }


    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread1 =  new Thread(myRunnable,"thread1");
        Thread thread2 =  new Thread(myRunnable,"thread2");
        Thread thread3 =  new Thread(myRunnable,"thread3");
        Thread thread4 =  new Thread(myRunnable,"thread4");
        Thread thread5 =  new Thread(myRunnable,"thread5");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
