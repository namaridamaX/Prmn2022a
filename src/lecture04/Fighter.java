package lecture04;

public class Fighter {
    private int hitPoint;
    private int power;
    private String name;

    public Fighter(int hitPoint, int power, String name) {
        this.hitPoint = hitPoint;
        this.power = power;
        this.name = name;
    }

    public void attack(Fighter enemy) {
        enemy.hitPoint -= this.power;
        System.out.println(this.name + " は " + enemy.name + " に " + this.power + " ダメージを与えた。");
    }

    public boolean isAlive() {
        if (this.hitPoint <= 0) {
            return false;
        } else {
            return true;
        }
    }

    public int getHitPoint() {
        return this.hitPoint;
    }

    public void setHitPoint(int hitPoint) {
        if (hitPoint > 0) {
            this.hitPoint = hitPoint;
        } else {
            System.out.println("正確な値を入力してください");
        }
    }

    public String getName() {
        return this.name;
    }
}
