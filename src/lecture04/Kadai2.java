package lecture04;

public class Kadai2 {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.existsAccount("新木魁","12345");
        atm.registerAccount("新木魁","12345");
        atm.existsAccount("新木魁","12345");
        atm.deposit("12345",2000);
        atm.deposit("12345",2000);
        atm.withdraw("12345",500);
    }
}
