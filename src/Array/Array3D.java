package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array3D {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the row of array: ");
        int row =Integer.parseInt(br.readLine());
        System.out.println("Enter the col of array: ");
        int col =Integer.parseInt(br.readLine());
        int[][] arr = new int[row][col];
        System.out.println("Enter the Array.Array element");
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                int varInArray = Integer.parseInt(br.readLine());
                arr[i] [j]= varInArray;
            }
        }
        System.out.println("the Array.Array is");
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
