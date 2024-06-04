package Examples;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Armstrongnumber {
    public static void main(String[] args) throws IOException {

        int num ,num2 =0;
        int ans = 0;
        int rem=0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a number: ");
        num = Integer.parseInt(br.readLine());
        num2 = num;

        while (num != 0) {
            rem = num % 10;
            ans = rem * rem * rem;
            num = num / 10;
        }

        if (num == ans) {
            System.out.println("The given number is an Armstrong Number");
        } else {
            System.out.println("The given number is Not an Armstrong Number");
        }
    }
}