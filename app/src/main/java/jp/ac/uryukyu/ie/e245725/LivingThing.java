package jp.ac.uryukyu.ie.e245725;

public class LivingThing {
    /**
 * 敵クラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    //getterメソッド
    public String getName(){
        return this.name;
    }
    
    public int getHitpoint(){
        return this.hitPoint;
    }

    //setterメソッド
    public void setHitpoint(int _hitPoint){
        this.hitPoint = _hitPoint;
    }

    public void setDead(boolean _dead){
        this.dead = _dead;
    }

    public LivingThing(String _name, int _hitPoint, int _attack){
        this.name = _name;
        this.hitPoint = _hitPoint;
        this.attack = _attack;
        this.dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, _hitPoint, attack);
    }
    
    public boolean isDead(){
        return this.dead;
    }

    public void attack(LivingThing opponent){
        if (this.dead == false){
            int damage = (int)(Math.random() * this.attack); 
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
            }
    }

    public void wounded(int damage){
        this.hitPoint -= damage;
        if( this.hitPoint <= 0 ) {
            this.dead = true;
            System.out.printf("%sは倒れた。\n", getName());
        }
    }
}

