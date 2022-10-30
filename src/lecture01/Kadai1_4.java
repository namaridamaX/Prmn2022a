package lecture01;

public class Kadai1_4 {
    public static void main(String args[]) {
        int j = 0;
        int sum = 0;
        int[] array = new int[100];

        //配列に要素を代入
        for (int i = 0; i < 100; i++) {
            array[i] = i + 1;
        }

        //偶数の値の総和を求める
        while (j < 100) {
            sum += array[j];
            j += 2;
        }
        System.out.println(sum);
    }
}
