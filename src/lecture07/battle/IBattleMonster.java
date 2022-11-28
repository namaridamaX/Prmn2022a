package lecture07.battle;

import lecture07.monster.IMonster;

public interface IBattleMonster extends IBattleOutput,IBattleCommand, IMonster {
    void attack(int skillIndex, IMonster opponent);
}
