package Paterns;

public class pattern6 {
    public static void main(String[] args) {

//        char ch= 'A';
//        for (int i = 1; i<=4;i++){
//            for( int j=1;j<=i;j++){
//                System.out.print(ch+" ");
//
//            }
//            ch++;
//            System.out.println();
//        }
//        for (int i = 1; i<=4;i++){
//            for( int j=1;j<=i;j++){
//                System.out.print(ch+" ");
//                ch++;
//            }
//           ch='A';
//            System.out.println();
//        }
        int temp =65;
        for (int i = 1; i<=4;i++){
            for( int j=1;j<=i;j++){
                if ( temp % 2 == 0 ){
                    System.out.print(temp + " ");
                }else{
                    System.out.print((char)temp+" ");
                }
                temp++;
            }

            System.out.println();
        }
    }
}

