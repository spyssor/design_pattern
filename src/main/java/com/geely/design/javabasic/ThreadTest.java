package com.geely.design.javabasic;

import java.util.concurrent.ThreadPoolExecutor;

public class ThreadTest {
    private static void attack(){
        System.out.println("Fight");
        System.out.println("Current Thread is :" + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread thread = new Thread(){
            public void run(){
                attack();
            }
        };
//        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor()
        System.out.println("current main thread is :" + Thread.currentThread().getName());
        thread.start();

    }
}
