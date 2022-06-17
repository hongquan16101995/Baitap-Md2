package baitapjames.bai3;

public class Ex2_Diff {
    public static void main(String[] args) {
        int[][] ints = {{1, 2, 3}, {123, 123, 555}, {6, 4, 77}};
        int cheoChinh = 0;
        int cheoPhu = 0;
        for (int i = 0; i < ints.length; i++) {
            cheoChinh += ints[i][i];
            cheoPhu += ints[i][ints.length - 1 - i];
        }
        System.out.println("Tổng chéo chính là: " + cheoChinh);
        System.out.println("Tổng chéo phụ là: " + cheoPhu);
    }
}
