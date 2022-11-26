package lecture04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ATM {
    private List<Account> accountList;

    public ATM() {
        this.accountList = new ArrayList<>();
    } //リストの初期化

    //アカウントの登録
    public void registerAccount(String name, String number) {
        //name="新木魁",number="12345"
        Account ac = new Account(name, number); //acは名前が新木魁、口座番号は12345
        this.accountList.add(ac); //accountListの０番目に↑のacを保存　配列でいうところのaccountList[0]=ac
        System.out.println(name + " さんのアカウントを口座番号:" + number + " で登録しました。");
    }

    //アカウントの存在確認
    public boolean existsAccount(String name, String number) {
        for (Account account : accountList) { //account←accountListの０番目から順番に入れていく
            if (account.getName().equals(name) && account.getNumber().equals(number)) { //accountから取り出した名前と引数の名前が同じであればtrueが帰ってくる
                System.out.println("名前:" + name + " 口座番号:" + number + " は存在します。");
                return true;
            }
        }
        System.out.println("名前:" + name + " 口座番号:" + number + " は存在しません。");
        return false;
    }

    //入金動作
    public void deposit(String number, long money) {
        for (Account account : accountList) {
            if (account.getNumber().equals(number)) {

                account.setBalance(account.getBalance() + money);

//                long balance = account.getBalance();
//                balance += money;
//                account.setBalance(balance);

                System.out.println("口座番号:" + number + " に " + money + "円入金しました。");
                return;
            }
        }
        System.out.println("口座番号:" + number + " は存在しません。");
    }

    //引き出し
    public void withdraw(String number, long money) {
        for (Account account : accountList) {
            if (account.getNumber().equals(number)) {
                long balance = account.getBalance();

                //残高よりも引き出す金額の方が大きい場合
                if (balance < money) {
                    System.out.println("口座番号:" + number + " から " + money + "円引き出せませんでした。残高:" + balance + "円です");
                } else {
                    balance -= money; //balance = balance - money
                    account.setBalance(balance);
                    System.out.println("口座番号:" + number + " から " + money + "円引き出しました。残高:" + balance + "円です");
                }

            } else {
                System.out.println("口座番号" + number + "は存在しませんでした。");
            }

        }
    }
}
