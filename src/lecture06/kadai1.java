package lecture06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class kadai1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            Double db = sc.nextDouble();
            System.out.println(db);

        } catch (InputMismatchException e) {
            System.out.println("エラー.");

        }
    }
}
