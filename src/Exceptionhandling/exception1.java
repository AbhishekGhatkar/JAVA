package Exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exception1 {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int y = 10 / 0;

            br.readLine();
        }  catch (ArithmeticException ex){
               System.out.println("handle");
           }

        catch (IOException ex){
            System.out.println("ar handle");
        }
    }
}
