public class Tin {
    public static void tin(int a,int b,int c){
        if(a==0&&b==0&&c==0){
            for(int i = 1;i<=3;i++){
            System.out.println("船"+i+"：生きてる");
            }
        }
        if(a==1&&b==2&&c==3){
            for(int i = 1;i<=3;i++){
                System.out.println("船"+i+"：死んでる");
            }
        }
        if(a==1&&b==2&&c==0){
            System.out.println("船1：死んでる");
            System.out.println("船2：死んでる");
            System.out.println("船3：生きてる");
        }
        if(a==1&&b==0&&c==3){
            System.out.println("船1：死んでる");
            System.out.println("船2：生きてる");
            System.out.println("船3：死んでる");
        }
        if(a==1&&b==0&&c==0){
            System.out.println("船1：死んでる");
            System.out.println("船2：生きてる");
            System.out.println("船3：生きてる");
        }
        if(a==0&&b==2&&c==0){
            System.out.println("船1：生きてる");
            System.out.println("船2：死んでる");
            System.out.println("船3：生きてる");
        }
        if(a==0&&b==2&&c==3){
            System.out.println("船1：生きてる");
            System.out.println("船2：死んでる");
            System.out.println("船3：死んでる");
        }
        if(a==0&&b==0&&c==3){
            System.out.println("船1：生きてる");
            System.out.println("船2：生きてる");
            System.out.println("船3：死んでる");
        }
    }
}
