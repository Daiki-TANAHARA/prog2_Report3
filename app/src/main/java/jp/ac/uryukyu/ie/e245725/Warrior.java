package jp.ac.uryukyu.ie.e245725;

public class Warrior extends Hero{
    public Warrior (String name, int maximumHP, int attack){
        super(name, maximumHP, attack);
    }

    public void attackWithWeponSkill(LivingThing opponent){
        if (isDead() == false){
            int damage = (int)(getAttack() * 1.5); 
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", getName(), opponent.getName(), damage);
            opponent.wounded(damage);
            }
    }

    
}