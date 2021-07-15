import java.util.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Ship.create();
        Scanner scanner = new Scanner(System.in);
        System.out.println("******************");
        System.out.println("戦艦ゲーム");
        System.out.println("******************");
        int se = 0;
        int ss = 0;
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        int ll = 99;
        for(int i = 1;i<1000;i++){
            System.out.println("-------[ターン"+i+"]-------");
                //System.out.println("船"+a+"：死んでる");
                    Tin.tin(v1,v2,v3);
            if(ss == 6){
                System.out.println("終わり");
                break;
            }
            System.out.println("爆弾のx座標を入力してください");
            int x = scanner.nextInt();
            System.out.println("爆弾のy座標を入力してください");
            int y = scanner.nextInt();
            se = Ship.kekka(x,y);
            if(se==1){
                v1 = se;
            }else if(se==2){
                v2 = se;
            }else{
                if(se==3){
                v3 = se;
                }else{
                    ll++;
                }
            }
            ss = v1 + v2 + v3;
        }
    }
}
