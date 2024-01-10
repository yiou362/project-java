package com.yale.projectj.ttl;

import com.alibaba.ttl.TransmittableThreadLocal;
import com.alibaba.ttl.TtlRunnable;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Yale
 */
public class TransmittableThreadLocalSample {

    @Test
    @SneakyThrows
    public void ttlSample() {

        ThreadLocal<String> tl = new ThreadLocal<>();
        tl.set("hello ThreadLocal");
        Runnable task1 = new RunnableTask(tl);
        new Thread(task1).start();
        Thread.sleep(1000);

        ExecutorService es = Executors.newSingleThreadExecutor();
        ThreadLocal<String> itl = new InheritableThreadLocal<>();
        itl.set("hello InheritableThreadLocal");
        Runnable task2 = new RunnableTask(itl);
        es.submit(task2);
        Thread.sleep(1000);

        itl.set("hello again InheritableThreadLocal");
        Runnable task3 = new RunnableTask(itl);
        es.submit(task3);
        Thread.sleep(1000);

        ThreadLocal<String> ttl = new TransmittableThreadLocal<>();
        ttl.set("hello TransmittableThreadLocal");
        Runnable task4 = new RunnableTask(ttl);
        Runnable ttlTask = TtlRunnable.get(task4);
        es.submit(ttlTask);
        Thread.sleep(1000);

        ttl.set("hello again TransmittableThreadLocal");
        Runnable ttlTask2 = TtlRunnable.get(task4);     //如果需要更新ttl，需要再执行一遍TtlRunnable.get()
        es.submit(ttlTask2);
        Thread.sleep(1000);
    }
}
