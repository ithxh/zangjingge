package hxh_thread;

public class MyThread  extends Thread{
    
    public MyThread(){
        
    }
    public MyThread(String name) {
        super(name);
    }
   
    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName()+"输出线程执行。。。" +i);
        }
  
    }
}

class Test {
    public static void main(String[] args) {
        MyThread t1  = new MyThread();
        t1.start();
        for (int i = 0; i <= 5 ; i++) {
            System.out.println("main线程输出" + i);
        }
    }
}