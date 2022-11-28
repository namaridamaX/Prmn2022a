package lecture07.battle;

import lecture07.monster.IMonster;
import lecture07.monster.Monster;
import lecture07.skill.Skill;

import java.util.List;

abstract class BattleMonster extends Monster implements IBattleMonster {
    protected BattleMonster(IMonster monster){
        super(monster);
    }

    @Override
    public final void attack(int skillIndex,IMonster opponent){
        List<Skill> skills = this.getSkills(); //技の選択肢が入ったList
        int skillPower = skills.get(skillIndex).getPower(); //Index番目の技を選択
        System.out.printf("%sは%sを繰り出した\n",this.getName(),skills.get(skillIndex).getName()); //技を撃った表示
        int damage = this.getPower()+skillPower - opponent.getDefense(); //技のダメ量＋攻撃力と敵の守備力を取得してダメージ計算
        receiveDamage(damage,opponent); //ダメージと敵を引数
    }

    protected void receiveDamage(int damage,IMonster opponent){ //ダメージを与えるメソッド
        int HP = opponent.getHP(); //敵のHPを取得
        int remainHP = HP - damage; //残りのHPを計算
        if(remainHP < 0) remainHP = 0;
        opponent.setHP(remainHP); //残りのHPをセット
        System.out.printf("%sに%dのダメージ！",opponent.getName(),damage);
        System.out.printf("(HP %d -> %d)\n",HP,remainHP);
        System.out.println();
    }
}
