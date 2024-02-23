package com.hxh.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class LtyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        return "求1~100的和:"+sum;
    }
}
class Test02{
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<String> task = new FutureTask<>(new LtyCallable());
        new Thread(task).start();
        String s = task.get();
        System.out.println(s);
    }
}