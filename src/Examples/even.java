package Examples;

public class even {
    public static void main(String[] args) {
        int num =0;
        for (int i = 1; i<=4;i++){
            for( int j=0;j<4;j++){
                System.out.print(num+2 +" ");
                num+=2;
            }
            System.out.println();
        }
    }
}
