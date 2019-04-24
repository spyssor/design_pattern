package com.geely.design.javabasic;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class FutureTaskDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<String> futureTask  = new FutureTask<String>(new MyCallable());
        new Thread(futureTask).start();
        if (!futureTask.isDone()){
            System.out.println("task has not finished, please wait");
        }
        String res = futureTask.get();
        System.out.println("task has finished,result: " + res);

    }
}
