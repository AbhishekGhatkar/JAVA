package Examples;

public class oddeven {
    public static void main(String[] args) {
       int sumofEven=0;
       int sumofOdd=0;
        for(int i=1; i<= 10 ; i++){
            if(i%2==0){
                System.out.println("Examples.even");
                sumofEven= sumofEven+i;

            }
            else{
                System.out.println("odd");
                sumofOdd= sumofOdd+i;

            }
        }
        System.out.println(sumofEven);
        System.out.println(sumofOdd);
    }
}
