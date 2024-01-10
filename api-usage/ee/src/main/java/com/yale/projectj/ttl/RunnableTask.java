package com.yale.projectj.ttl;

/**
 * @Author Yale
 * @Description
 */
public class RunnableTask implements Runnable {
    ThreadLocal<String> ttl;

    public RunnableTask(ThreadLocal<String> ttl) {
        this.ttl = ttl;
    }

    @Override
    public void run() {
        System.out.println(ttl.get());
    }
}
