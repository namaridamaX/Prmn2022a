package lecture07.monster;

public class HP {
    private final int hp;

    private final int dead = 0;

    public HP(final int hp) {
        this.hp = hp;
    }

    public boolean isAlive() {
        return hp <= dead;
    }

    public int getHP() {
        return hp;
    }
}
