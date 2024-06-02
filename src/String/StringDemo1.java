package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringDemo1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the row of array: ");
        int row =Integer.parseInt(br.readLine());
        int[] arr1=new int[row];
        System.out.println("Enter The Array.Array Element");
        for (int i=0;i<row;i++){
                int varInArray = Integer.parseInt(br.readLine());

        }
        System.out.println("The Array.Array is :");
        for (int i=0;i<arr1.length-1;i++){
                int num=arr1[i]+1;
                if(arr1[i+1]!=num){
                    System.out.print(num+" ");

                }
            System.out.print(arr1[i]+" ");
        }

            System.out.println();


        }

    }

