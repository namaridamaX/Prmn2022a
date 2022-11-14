package lecture03;

import java.util.ArrayList;
import java.util.Scanner;

public class Kadai2 {
    public static void main(String[] args) {
        System.out.println("何行分入力しますか");
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.println(i + "行目:");
            Scanner sca = new Scanner(System.in);
            String line = sca.nextLine();
            list.add(line);
        }
        System.out.println("入力した文字列:");
        for (int j = 0; j < list.size(); j++) {
            System.out.println("[" + j + "] " + list.get(j));
        }
    }
}
