package lecture07.monster;

import lecture07.skill.Ember;
import lecture07.skill.Scratch;
import lecture07.skill.Skill;
import lecture07.skill.Tackle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Monkey extends Monster {
    private static final List<Skill> skills = new ArrayList<>(Arrays.asList(new Scratch(), new Tackle(), new Ember()));

    public Monkey() {
        super("Monkey", 44, 14, 11, 31, skills);
    }
}
