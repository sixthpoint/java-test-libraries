package com.sixthpoint.futurecallabletask;

import static java.lang.Thread.sleep;
import java.util.concurrent.Callable;

/**
 *
 * @author sixthpoint
 */
public class CounterCallable implements Callable {

    private long start;
    private long end;

    public CounterCallable(long start, long end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public SumTimeAnswer call() throws Exception {
        long sum = 0;
        long startTime = System.currentTimeMillis();
        for (long i = start; i <= end; i++) {
            sum += i;
        }
        long endTime = System.currentTimeMillis();

        sleep(10);

        return new SumTimeAnswer(sum, endTime - startTime);
    }

}
