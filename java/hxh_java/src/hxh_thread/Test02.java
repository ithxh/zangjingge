package hxh_thread;

public class Test02 {
    public static void main(String[] args) throws Exception {
        Thread t1= new MyThread("1号线程");
        t1.start();
        t1.join(); 


        Thread t2= new MyThread("2号线程");
        t2.start();
        t2.join();

        Thread t3= new MyThread("3号线程");
        t3.start();
        t3.join();
    }
    
}
