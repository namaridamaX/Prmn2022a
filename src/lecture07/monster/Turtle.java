package lecture07.monster;

import lecture07.skill.Ember;
import lecture07.skill.RazorLeaf;
import lecture07.skill.Skill;
import lecture07.skill.Tackle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Turtle extends Monster{
    private static final List<Skill> skills = new ArrayList<>(Arrays.asList(new Tackle(),new RazorLeaf(),new Ember()));
    public Turtle(){
        super("Turtle",55,17,16,15,skills);
    }
}
