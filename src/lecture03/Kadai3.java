package lecture03;

import java.util.Scanner;

public class Kadai3 {
    public static void main(String[] args) {
        int sum = 0;
        int[] number = new int[2];
        for (int i = 0; i < 2; i++) {
            System.out.println(i + 1 + "つ目の整数を入力してください:");
            Scanner sc = new Scanner(System.in);
            String s_num = sc.nextLine();
            int i_num = Integer.parseInt(s_num);
            number[i] = i_num;
            sum += i_num;
        }
        System.out.println(number[0] + "+" + number[1] + "=" + sum);
    }
}
