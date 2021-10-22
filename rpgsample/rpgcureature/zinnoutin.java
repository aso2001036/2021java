package rpgcreature;

import java.util.Random;

/**
 * メタルスライムクラス
 */
public class zinnoutin extends Monster{
    private final static int GOMI_RATE = 5;
    
    /**
     * メタルスライムのコンストラクタ
     */
    public zinnoutin(){
        super("ゴーレム",100,4);
    }

    /**
     * 攻撃メソッド
     * @param opponent：攻撃相手
     */
    @Override
    public void attack(Creature opponent) {
        
        Random r = new Random();
        if( r.nextInt(100) < GOMI_RATE ){
            System.out.printf("%sの攻撃！\n",getName());
            
            opponent.damaged(50);
            
            displayMessage(opponent,50);
        }else{
            int damage = r.nextInt(5);
            damage = damage*2;
            System.out.printf("%sの攻撃！\n",getName());
            
            opponent.damaged(damage);
            
            displayMessage(opponent,damage);
        }
    }
}
