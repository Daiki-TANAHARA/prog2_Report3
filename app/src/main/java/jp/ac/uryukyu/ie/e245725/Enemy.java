package jp.ac.uryukyu.ie.e245725;

public class Enemy extends LivingThing{
    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name ヒーロー名
     * @param maximumHP ヒーローのHP
     * @param attack ヒーローの攻撃力
     */
    public Enemy (String name, int maximumHP, int attack) {
        super (name, maximumHP, attack);
    }

    @Override
    public void wounded(int damage){
        setHitpoint(getHitpoint() - damage);
        if( getHitpoint() <= 0 ) {
            setDead(true) ;
            System.out.printf("モンスター%sは倒れた。",getName());
        }
    }
}

