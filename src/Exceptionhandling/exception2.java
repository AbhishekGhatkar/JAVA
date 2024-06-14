package Exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exception2 {
    public static void main(String[] args) {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        try {
            int num = 10 / 0;

            try {
                br.readLine();

            } catch (ArithmeticException ex) {
                System.out.println("Handle ");
            }} catch (IOException ex) {
                System.out.println("exception handle");

            }



    }
}
