package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sumofplane {
        public static void main (String[]args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the plain of array: ");
            int plain = Integer.parseInt(br.readLine());
            System.out.println("Enter the row of array: ");
            int row = Integer.parseInt(br.readLine());
            System.out.println("Enter the col of array: ");
            int col = Integer.parseInt(br.readLine());
            int[][][] arr = new int[plain][row][col];
            System.out.println("Enter the Array.Array element");
            for (int i = 0; i < plain; i++) {
                for (int j = 0; j < row; j++) {
                    for (int k = 0; k < col; k++) {
                        int varInArray = Integer.parseInt(br.readLine());
                        arr[i][j][k] = varInArray;
                    }
                }
            }

            for (int i = 0; i < plain; i++) {
                System.out.println("this is" + i);
                for (int j = 0; j < row; j++) {
                    for (int k = 0; k < col; k++) {
                        System.out.print(arr[i][j][k] + " ");
                    }
                    System.out.println();
                }
                System.out.println();
            }

            for (int i=0;i<plain;i++){
                int ans=0;
                for (int j=0;j<row;j++){
                    for(int k=0;k<col;k++){
                        ans= ans+arr[i][j][k];

                    }
                }
                System.out.println("Add of "+i+" th plane is "+ans);
            }
        }
    }
