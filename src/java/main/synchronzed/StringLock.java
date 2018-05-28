package synchronzed;

public class StringLock {
    private String lock="lock";

    public void method(){
        synchronized (lock){
            try {
                System.out.println("当前线程："+Thread.currentThread().getName()+"开始");
                Thread.sleep(1000);
                System.out.println("当前线程："+Thread.currentThread().getName()+"结束");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {
        final  StringLock stringLock = new StringLock();
        new Thread(new Runnable() {
            @Override
            public void run() {
                stringLock.method();
            }
        },"ti").start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                stringLock.method();
            }
        },"t2").start();
    }
}
