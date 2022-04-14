package com.in28minutes.java.oops.multithreading;

public class ThreadExample implements Runnable{

    @Override
    public void run() {
        System.out.println("In a thread!");
    }



    public static void main(String[] args) {
        ThreadExample threadExample=new ThreadExample();
        System.out.println("Main Thread!");

        // calling the run method for running the thread
         threadExample.run();
    }

}
