package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stringdemop {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter String 1st: ");
        String str1= br.readLine();
        System.out.println("Length of String str1 "+str1.length());
        System.out.println("Enter String 2nd: ");
        String str2= br.readLine();
        System.out.println("Length of String str2 "+str1.length());

        StringBuffer ans= new StringBuffer();

        int maxLength=str1.length()+str2.length();
        System.out.println("Max Length "+maxLength);

        for (int i=0;i<maxLength;i++){
            if(i<str1.length()){
                ans.append(str1.charAt(i));
            }
            if(i<str2.length()){
                ans.append(str2.charAt(i));
            }
        }
        System.out.println("ans is: "+ans.toString());
    }
}
