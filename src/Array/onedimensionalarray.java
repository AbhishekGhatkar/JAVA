package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class onedimensionalarray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter The Array.Array ");
        int num = Integer.parseInt(br.readLine());

        //array decleared
        int []arr=new int[num];


        //access element
        System.out.println("Array.Array element: ");
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);

        }
        //user input array
        System.out.println("Enter Element Array.Array: ");
        for(int i=0;i<arr.length;i++){
            int varInArray=Integer.parseInt(br.readLine());
            arr[i]=varInArray;

        }
        System.out.println("Array.Array Element by user: ");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }

        System.out.println();
    }
}
