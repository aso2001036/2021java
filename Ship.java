import java.util.*;
import java.util.Random;

public class Ship {
       public static int ship1 = 3;
       public static int ship2 = 3;
       public static int ship3 = 3;
       public static int[][] boad = new int[7][7];
    public static void create(){
        for(int i = 1;i<=6;i++){
            for(int q = 1;q<=6;q++){
                boad[i][q] = 0;
            }
        }
        for(int a = 0;a<3;a++){
            Random random = new Random();
            int x = random.nextInt(5)+1;
            int y = random.nextInt(5)+1;
            if(boad[x][y]==0){
            boad[x][y] = a+1;
            }else{
                a--;
            }
        }
    }
    public static int kekka(int x,int y){
        for(int i = 1;i<=3;i++){
            if(boad[x][y]==i){
                System.out.println("船"+i+"：あたり");
                if(i==1){
                    ship1--;
                    if(ship1==0){
                        return i;
                    }
                }else if(i==2){
                    ship2--;
                    if(ship2==0){
                        return i;
                    }
                }else{
                    ship3--;
                    if(ship3==0){
                        return i;
                    }
                }
            }else if(boad[x][y+1]==i||boad[x][y-1]==i||boad[x-1][y]==i||boad[x+1][y]==i){
                System.out.println("船"+i+"：波高し");
            }else{
                System.out.println("船"+i+"はずれ");
            }
        }
        return 0;
    }
}
