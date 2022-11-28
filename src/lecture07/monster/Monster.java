package lecture07.monster;

import lecture07.skill.Skill;

import java.util.List;

public class Monster implements IMonster {
    private final String name;
    private HP hp;
    private final int power;
    private final int defense;
    private final int speed;
    private final List<Skill> skills;

    public final static int MAX_NUMBER_OF_SKILLS = 3;

    protected Monster(String name, int hp, int power, int defense, int speed, List<Skill> skills) {
        if (skills.size() > MAX_NUMBER_OF_SKILLS)
            throw new IllegalArgumentException(String.format("技の数は%dつ以内です", MAX_NUMBER_OF_SKILLS));
        this.name = name;
        this.hp = new HP(hp);
        this.power = power;
        this.defense = defense;
        this.speed = speed;
        this.skills = skills;
    }

    protected Monster(IMonster monster) {
        this.name = monster.getName();
        this.hp = new HP(monster.getHP());
        this.power = monster.getPower();
        this.defense = monster.getDefense();
        this.speed = monster.getSpeed();
        this.skills = monster.getSkills();
    }

    @Override
    public final String getName() {
        return name;
    }

    @Override
    public final int getHP() {
        return hp.getHP();
    }

    @Override
    public void setHP(int hp) {
        this.hp = new HP(hp);
    }

    @Override
    public int getPower() {
        return power;
    }

    @Override
    public int getDefense() {
        return defense;
    }

    @Override
    public final int getSpeed() {
        return speed;
    }

    @Override
    public final List<Skill> getSkills() {
        return skills;
    }

    @Override
    public boolean isAlive() {
        return hp.isAlive();
    }
}
