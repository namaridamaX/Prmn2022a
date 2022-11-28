package lecture07.monster;

import lecture07.skill.Bubble;
import lecture07.skill.Peck;
import lecture07.skill.Scratch;
import lecture07.skill.Skill;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Penguin extends Monster {
    private static final List<Skill> skills = new ArrayList<>(Arrays.asList(new Scratch(), new Bubble(), new Peck()));

    public Penguin() {
        super("Penguin", 53, 12, 13, 20, skills);
    }
}
