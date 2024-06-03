package Paterns;

public class Starpattern {
    public static void main(String[] args) {
char ch='a';
        for (int j=1 ;j<=4;j++){
            for (int i=1 ;i<=4;i++){

                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
