package Exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Exception3 extends Exception {
    Exception3(String msg) {
        super(msg);
    }
}
class Bikeshowroom {
    int biketotal = 0;
    int soldbike = 0;

    public void main(String[] args)throws Exception3 {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Bikeshowroom b = new Bikeshowroom();
        int ans = 0;
        try {
            System.out.println("Enter TotalBikes: ");
            b.biketotal = Integer.parseInt(br.readLine());
            System.out.println("Enter SoldBikes: ");
            b.soldbike = Integer.parseInt(br.readLine());
           if(b.biketotal < b.soldbike)
               System.out.println("Insufficient Stock! ");
            ans = b.biketotal - b.soldbike;
            System.out.println("Total Bikes Remaining :"+ans+".");
        } catch (IOException ex) {
            System.out.println("Exception Handle...");
        }finally {
            try{
               int i= 10/0;
            }catch (ArithmeticException ex){
                System.out.println("exception handle");
            }
        }

    }

}






