package lecture07.battle;

import lecture07.monster.IMonster;

import java.util.Random;

public class EnemyMonster extends BattleMonster{
    public EnemyMonster(IMonster monster){
        super(monster);
    }

    @Override
    public final int skillSelect(){
        return new Random().nextInt(this.getSkills().size());
    }

    @Override
    public final void attackOutput(){
        System.out.println("野生の"+this.getName()+"の攻撃！");
    }

    @Override
    public final void remainHpOutput(){
        System.out.printf("野生の%sのHP: %d\n",this.getName(),this.getHP());
    }

    @Override
    public final void skillListOutput(){
        System.out.print("\n");
    }

    @Override
    public void winOutput(){
        System.out.println("野生の"+this.getName()+"の勝ち！");
    }

    @Override
    public void loseOutput(){
        System.out.println("野生の"+this.getName()+"は倒れた！");
    }
}
