package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoD1 {
    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the row of array: ");
        int row =Integer.parseInt(br.readLine());
        int[] arr = new int[row];
        System.out.println("Enter the Array.Array element: ");
        for (int i=0;i<row;i++){
                int varInArray = Integer.parseInt(br.readLine());
                arr[i] = varInArray;
        }

        System.out.println("Enter the starting Index: ");
        int si=Integer.parseInt(br.readLine());
        System.out.println("Enter the Ending Index: ");
        int ei= Integer.parseInt(br.readLine());
        while(si<=ei){
            int  temp=arr[si];
            arr[si]=arr[ei];
            arr[ei]=temp;
            si++;
            ei--;
        }
        System.out.println("the Array.Array is: ");
         for (int i=0;i<row;i++){
            System.out.print(arr[i]+" ");

         }

            System.out.println();
    }
}



