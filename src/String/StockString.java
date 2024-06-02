package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StockString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the row of array: ");
        int row =Integer.parseInt(br.readLine());
        int[] arr=new int[row];
        System.out.println("Enter The Array.Array Element");

        for (int i=0;i<arr.length;i++){
            int varInArray = Integer.parseInt(br.readLine());
            arr[i] = varInArray;
        }
        int profit =0;
        int BuyAmount=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int num=arr[j]-arr[i];
                if(num>=profit){
                    profit=num;
                    BuyAmount=arr[i];

                }
            }
        }
        System.out.println("profit is: "+profit);
        System.out.println("BuyAmount is: "+BuyAmount);
    }
}
