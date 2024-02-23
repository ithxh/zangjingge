package com.hxh.thread;

public class LtyThread extends Thread{
    @Override
    public void run() {
        System.out.println("LtyThread-线程执行...");
    }
}
class Test00 {
    public static void main(String[] args) {
        LtyThread ltyThread = new LtyThread();
        ltyThread.start();

        //mian 线程
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName()+"线程执行...");
        }
    }
}
