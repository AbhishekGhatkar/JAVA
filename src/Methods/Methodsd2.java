package Methods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Methodsd2 {


    int[] sortArray(int[] fromUser) {

        for (int i = 0; i < fromUser.length; i++) {
            for (int j =i; j < fromUser.length; j++) {
                if (fromUser[i] > fromUser[j]) {
                    int temp =fromUser[i];
                    fromUser[i]=fromUser[j];
                    fromUser[j]=temp;
                }
            }
        }
        return fromUser;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Length of array: ");
        int row = Integer.parseInt(br.readLine());
        int[] arr = new int[row];
        System.out.println("Enter the Array.Array element");
        for (int i = 0; i < row; i++) {
            int varInArray = Integer.parseInt(br.readLine());
            arr[i] = varInArray;

        }
        Methodsd2 obj = new Methodsd2();
        obj.sortArray(arr);
        int[] ans=obj.sortArray(arr);
        System.out.print(ans);
    }
}