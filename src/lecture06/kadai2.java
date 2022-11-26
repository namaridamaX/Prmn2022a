package lecture06;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class kadai2 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> randomList = new ArrayList<>();

        for(int i=0;i<5;i++){
            randomList.add(random.nextInt(6)+1);
        }

        System.out.println("サイコロを5つ振りました");
        System.out.println("何番目のサイコロを確認しますか(0から4)");

        try{
            Scanner sc = new Scanner(System.in);
            int index = sc.nextInt();
            System.out.println(index+"番目のサイコロの目は"+randomList.get(index));
        }catch (IndexOutOfBoundsException e){
            System.out.println("ArrayListの範囲外アクセスを確認しました.");
            System.out.println("プログラムを終了します.");
        }catch (InputMismatchException e){
            System.out.println("整数以外の値が入力されました。");
            System.out.println("プログラムを終了します。");
        }
    }
}
