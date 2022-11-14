package lecture04;

public class Kadai1 {
    public static void main(String[] args) {
        //fighter関数をインスタンス化
        Fighter hero = new Fighter(100, 30, "蘇我氏");
        Fighter enemy = new Fighter(500, 20, "加藤");

        //無限ループ
        while (true) {

            //heroの攻撃
            hero.attack(enemy);

            //enemyの体力が0になった場合の処理
            if (!enemy.isAlive()) {
                break;
            }

            //enemyの攻撃
            enemy.attack(hero);

            //heroの体力が0になった場合の処理
            if (!hero.isAlive()) {
                break;
            }
        }
    }
}
