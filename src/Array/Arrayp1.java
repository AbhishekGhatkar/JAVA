package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arrayp1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the lenght of array: ");
        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[num];

        System.out.println("Enter Number of Array.Array");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        System.out.println("Enter Element Array.Array: ");
        for (int i = 0; i < arr.length; i++) {
            int varInArray = Integer.parseInt(br.readLine());
            arr[i] = varInArray;

        }



        }






    }

