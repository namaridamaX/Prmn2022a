package lecture07.skill;

public class Skill {
    private final String name;
    private final int power;

    public Skill(final String name,final int power){
        this.name = name;
        this.power = power;
    }

    public final String getName(){
        return name;
    }

    public final int getPower(){
        return power;
    }
}
