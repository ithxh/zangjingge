package hxh_thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class MyCallable implements Callable<String> {
    private int n;
    public MyCallable(int n ){
        this.n = n;
    }
    @Override
    public String call() throws Exception {

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return "MyCallable线程1~n的和:" + sum;
    }
    
}

class test {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Callable<String> call =  new MyCallable(100);
        FutureTask<String> f1 = new  FutureTask<>(call);
        new Thread(f1).start();

        //获取线程执行完毕后的结果
        // 如果执行到这里，等到上面线程执行完毕后才会获取结果
        String rs = f1.get();
        System.out.println(rs);

    }
}

