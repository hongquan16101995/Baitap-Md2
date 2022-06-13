package bai4;

public class Ex2 {
    public static void main(String[] args) {
        Ex2_StopWatch stopWatch = new Ex2_StopWatch();
        stopWatch.start();
        sortBubbles();
        stopWatch.stop();
        System.out.println(stopWatch.getStartTime());
        System.out.println(stopWatch.getEndTime());
        System.out.println("Thời gian sắp xếp của pt là: "
                + stopWatch.getElapsedTime());

    }

    public static void sortBubbles() {
        double[] doubles = new double[100000];
        for (int i = 0; i < doubles.length; i++) {
            doubles[i] = Math.random() * 100000;
        }

        for (int i = 0; i < doubles.length; i++) {
            for (int j = 0; j < doubles.length; j++) {
                if (doubles[i] > doubles[j]) {
                    double temp = doubles[i];
                    doubles[i] = doubles[j];
                    doubles[j] = temp;
                }
            }
        }
    }
}
