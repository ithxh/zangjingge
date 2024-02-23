package hxh_thread;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
       for (int i = 0; i <5; i++) {
            System.out.println("MyRunnable线程执行..." + i);
       }
    }
}
class test {
    public static void main(String[] args) {
        Runnable t1 =  new MyRunnable();
        //public Thread(Runnable target)
        new Thread(t1).start();
        for (int i = 0; i < 5; i++) {
            System.out.println("main线程执行..." + i);
        }
    }
}