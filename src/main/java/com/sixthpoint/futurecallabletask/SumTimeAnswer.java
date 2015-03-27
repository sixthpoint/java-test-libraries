package com.sixthpoint.futurecallabletask;

/**
 *
 * @author sixthpoint
 */
public class SumTimeAnswer {

    private long timeToFinish;
    private long sum;

    public SumTimeAnswer(long sum, long timeToFinish) {
        this.sum = sum;
        this.timeToFinish = timeToFinish;
    }

    public long getTimeToFinish() {
        return timeToFinish;
    }

    public long getSum() {
        return sum;
    }
}
