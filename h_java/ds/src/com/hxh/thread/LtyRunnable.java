package com.hxh.thread;

public class LtyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("LtyRunnable 线程执行...");
    }
}
class Test01 {
    public static void main(String[] args) {
        Runnable runnable = new LtyRunnable();
        new Thread(runnable).start();

    }
}
