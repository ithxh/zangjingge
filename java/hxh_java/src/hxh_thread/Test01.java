package hxh_thread;

public class Test01 {
   public static void main(String[] args) {
        Thread t1 = new MyThread();
        t1.start();
        System.out.println("t1:" + t1.getName());

        Thread t2 = new MyThread();
        t2.start();
        System.out.println("t2:"+ t2.getName());

        Thread m = Thread.currentThread();
        System.out.println("m:" + m.getName());

        for (int i = 0; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName()+"线程输出:" + i);
        }
   } 
}
