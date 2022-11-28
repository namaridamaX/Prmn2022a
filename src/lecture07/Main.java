package lecture07;

import lecture07.battle.EnemyMonster;
import lecture07.battle.PlayerMonster;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        PlayerMonster playerMonster = new PlayerMonster(MonsterCreator.of(stdinMonsterId()));
        EnemyMonster enemyMonster = new EnemyMonster(MonsterCreator.of(randomMonsterId()));
        Field field = new Field(playerMonster,enemyMonster);
        field.battleStart();
    }

    private static int stdinMonsterId(){
        Scanner scanner = new Scanner(System.in);
        int monsterMinId = MonsterCreator.monsterMinId();
        int monsterMaxId = MonsterCreator.monsterMaxId();
        int playerMonsterId;
        while(true){
            try{
                MonsterCreator.viewMonsterList();
                System.out.print("オーキド博士「ここに３匹のMonsterがおるじゃろ？好きな１匹を選ぶんじゃ」 > ");
                playerMonsterId = Integer.parseInt((scanner.nextLine()));
                if(!(monsterMinId <= playerMonsterId && playerMonsterId <= monsterMaxId)) throw new InputMismatchException("オーキド博士「ほかにMonsterはいないぞ？」");
                break;
            }catch (InputMismatchException e){
                System.out.println(e.getMessage());
            }catch (NumberFormatException ignored){

            }finally {
                System.out.print("\n");
            }
        }
        return playerMonsterId;
    }

    private static int randomMonsterId(){
        return new Random().nextInt(MonsterCreator.values().length) + 1;
    }
}
