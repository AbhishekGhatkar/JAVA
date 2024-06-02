package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;


public class RemoveDuplicates {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter String 1st: ");
        String str1= br.readLine();
        System.out.println("Enter String 2nd: ");
        String str2= br.readLine();

        String combined = str1 + str2;
        HashSet<Character> set = new HashSet<>();
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < combined.length(); i++) {
            char c = combined.charAt(i);
            if (!set.contains(c)) {
                set.add(c);
                output.append(c);
            }
        }

        System.out.println("The unique characters from both strings are:");
        System.out.println(output.toString());
    }
}
