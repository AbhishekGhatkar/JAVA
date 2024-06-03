package Paterns;

public class pattern4 {
    public static void main(String[] args) {
        int curr = 1;
        int prev=1;
        int ans=0;
        for(int i=1;i<=3;i++){

            for(int j=1;j<=3;j++){
                ans=curr+prev;

                if(i==1 &&j==1 || i==1&&j==2){
                    System.out.print(curr+" ");
                }else{
                    System.out.print(ans+" ");
                    curr = prev;
                    prev = ans;
                }
            }
            System.out.println();
        }
    }
}
