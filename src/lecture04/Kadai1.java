package lecture04;

public class Kadai1 {
    public static void main(String[] args) {
        Fighter hero = new Fighter(100, 30, "蘇我氏");
        Fighter enemy = new Fighter(500, 20, "加藤");

        while (hero.isAlive() && enemy.isAlive()) {
            hero.attack(enemy);
            System.out.println(enemy.getName() + " の残り hitPoint : " + enemy.getHitPoint());
            if (enemy.getHitPoint() <= 0) {
                System.out.println(enemy.getName() + " は倒れた。");
                break;
            }
            enemy.attack(hero);
            System.out.println(hero.getName() + " の残り hitPoint : " + hero.getHitPoint());
            if (hero.getHitPoint() <= 0) {
                System.out.println(hero.getName() + " は倒れた。");
                break;
            }
        }
    }
}
