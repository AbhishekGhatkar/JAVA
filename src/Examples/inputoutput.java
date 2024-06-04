package Examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class inputoutput {
    public static void main(String[] args) throws IOException {
        //connection
//        InputStreamReader isr = new InputStreamReader(System.in);
//        BufferedReader br = new BufferedReader(isr);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        System.out.println("Input String is " + str);


        System.out.println("Enter Your number");
        String num = br.readLine();
        String num1 = br.readLine();
        String num2 = br.readLine();

        int ans = Integer.parseInt(num);
        System.out.println("Your Number Is :" + ans);

        float ans1 = Float.parseFloat(num1);
        System.out.println("Your Number Is :" + ans1);

        double ans2 = Double.parseDouble (num2);
        System.out.println("Your Number Is :" + ans2);

        char c = (char)br.read();
        System.out.println(c);



        //connection close
//        br.close();
//        String str2 = br.readLine();
//        System.out.println(str2);

    }

}