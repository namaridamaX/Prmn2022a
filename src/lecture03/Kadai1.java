package lecture03;

import java.util.Scanner;

public class Kadai1 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("任意の文字列を入力してください:");
        String line = sc.nextLine();
        System.out.println("”" + line + "” と入力されました");
    }
}
