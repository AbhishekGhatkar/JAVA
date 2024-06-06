package Methods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Methodsd3 {
    void lengthString(String[] strArr, String stringSearch) {
        boolean flag=false;
        for(int i=0; i<strArr.length; i++){
            if(strArr[i].equals(stringSearch)){
                flag=true;
                int[] arr = new int[128];

                for(int j=0; j<stringSearch.length(); j++){
                    arr[stringSearch.charAt(j)] ++;
                }

                for(int k=0; k<arr.length; k++){
                    if(arr[k] != 0){
                        System.out.println("frequency of character "+ (char)k + " is "+ arr[k]);
                    }
                }


            }
        }if(!flag){
            System.out.println("Not found");
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of strings: ");
        String str1 = br.readLine();
        String[] arr = new String[Integer.parseInt(str1)];

        System.out.println("Enter Elements in String");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter String.string " + (i + 1) + ":");
            arr[i] = br.readLine();
        }

        System.out.println("enter searchString");
        String searchString = br.readLine();

        Methodsd3 obj = new Methodsd3();
        obj.lengthString(arr, searchString);


    }
}
