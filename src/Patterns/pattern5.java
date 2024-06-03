package Paterns;

public class pattern5 {
     public static void main(String[] args) {
        for (int i = 1; i<=4;i++){
            for( int j=1;j<=4;j++){
                for (int k=2;k<=60;k++){
                    int count=0;
                    for(int l=2 ; l<=k;l++){
                        if(k%l==0){
                            count++;
                        }
                    }
                    if(count ==1){
                        System.out.print(k+" ");
                    }

                }
                System.out.println();
            }
        }

    }
}
