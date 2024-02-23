package hxh_thread;

public class CreateThread {
    public static void main(String[] args) {
        // 匿名内部类写法
        Runnable target = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 5; i++) {
                    System.out.println("子线程1输出:" + i);
                }
            }
        };
        new Thread(target).start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 5; i++) {
                    System.out.println("子线程2输出:" + i);
                }
                
            }
        }).start();
        // 
        new Thread(()-> {
                for (int i = 0; i <= 5; i++) {
                    System.out.println("子线程3输出:" + i);
                }
        }).start();

        for (int i = 0; i <= 5; i++) {
            System.out.println("main线程执行..." + i);
        }
    }
}
