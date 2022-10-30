package lecture01;

public class Kadai1_5 {
    public static void main(String args[]) {

        int[] score = {41, 85, 72, 38, 80};

        for (int i = 0; i < score.length; i++) {
            if (score[i] < 60) {
                System.out.println(i + "番 " + score[i] + "点 " + "不可");
            } else if (score[i] < 70) {
                System.out.println(i + "番 " + score[i] + "点 " + "可");
            } else if (score[i] < 80) {
                System.out.println(i + "番 " + score[i] + "点 " + "良");
            } else if (score[i] < 90) {
                System.out.println(i + "番 " + score[i] + "点 " + "優");
            } else {
                System.out.println(i + "番 " + score[i] + "点 " + "秀");
            }
        }

        System.out.println("最高点:" + max(score) + "点");
        System.out.println("最低点:" + min(score) + "点");
        System.out.println("平均点:" + average(score) + "点");

    }

    static int min(int[] sc) {
        int min = 100;

        for (int i = 0; i < sc.length; i++) {
            if (min > sc[i]) {
                min = sc[i];
            }
        }
        return min;
    }

    static int max(int[] sc) {
        int max = 0;

        for (int i = 0; i < sc.length; i++) {
            if (max < sc[i]) {
                max = sc[i];
            }
        }
        return max;
    }

    static double average(int[] sc) {
        double sum = 0;

        for (int i = 0; i < sc.length; i++) {
            sum += sc[i];
        }
        double ave = sum / sc.length;
        return ave;
    }
}