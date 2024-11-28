package jp.ac.uryukyu.ie.e245725;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class WarriorTest {
    @Test
    void attackWithWeponSkillTest(){
        int defaultHeroHp = 100;
        Warrior demoWarrior = new Warrior("デモ勇者", defaultHeroHp, 100);
        Enemy slime = new Enemy("スライムもどき", 10, 100);
        for (int i = 0; i < 3; i++){
            int beforeHitPoint = slime.getHitpoint();
            demoWarrior.attackWithWeponSkill(slime);
            int afterHitPoint = slime.getHitpoint();
            int damage = beforeHitPoint - afterHitPoint;
            assertEquals(damage, 150);
        }
    }
}
