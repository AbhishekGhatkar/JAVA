package Array;

import java.io.IOException;

public class JaggadArray {
    public static void main(String[] args) throws IOException {
       int [] []arr = new int [3][];
       arr[0]=new  int[]{10,20,30,40};
       arr[1]=new int[]{10,20};
       arr[2]=new int[]{30};
       for (int i=0;i<arr.length;i++){
           for(int j=0;j<arr[i].length;j++){
               System.out.print(arr[i][j]+" ");
           }
           System.out.println();
        }

    }
}
