package org.example.creational.singleton;

public class Main {
    public static void main(String[] args) {
        // Single-Thread => Singleton

        /*ILogging logging = DatabaseLogging.getInstance("Logging 1");
        logging.log();

        ILogging logging2 = DatabaseLogging.getInstance("Logging 2");
        logging2.log();*/


        // Multi-Thread => ?

        Thread thread1 = new Thread(new LoggerThread1());
        Thread thread2 = new Thread(new LoggerThread2());
        thread1.start();
        thread2.start();
    }

    static class LoggerThread1 implements Runnable{

        @Override
        public void run() {
            ILogging logging = DatabaseLogging.getInstance("Thread 1");
            logging.log();
            System.out.println(logging);
        }
    }
    static class LoggerThread2 implements Runnable{

        @Override
        public void run() {
            ILogging logging = DatabaseLogging.getInstance("Thread 2");
            logging.log();
            System.out.println(logging);
        }
    }
}
