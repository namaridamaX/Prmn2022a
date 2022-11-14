package lecture04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ATM {
    private List<Account> accountList;

    public ATM() {
        this.accountList = new ArrayList<>();
    }

    //アカウントの登録
    public void registerAccount(String name, String number) {
        Account ac = new Account(name, number);
        this.accountList.add(ac);
        System.out.println(name + " さんのアカウントを口座番号:" + number + " で登録しました。");
    }

    //アカウントの存在確認
    public boolean existsAccount(String name, String number) {
        for (Account account : accountList) {
            if (account.getName().equals(name) && account.getNumber().equals(number)) {
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
                    balance -= money;
                    account.setBalance(balance);
                    System.out.println("口座番号:" + number + " から " + money + "円引き出しました。残高:" + balance + "円です");
                }

            } else {
                System.out.println("口座番号" + number + "は存在しませんでした。");
            }

        }
    }
}
