package baitapjames.bai4;

public class Ex2_StopWatch {
    private long startTime;
    private long endTime;

    public Ex2_StopWatch() {
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }
}
