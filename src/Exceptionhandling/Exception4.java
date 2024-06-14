package Exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception4 extends Exception {
    Exception4(String msg) {
        super(msg);
    }

}

class Demo{
    private  long Count;

    void lectures(long count,Demo d){

    }
}

class main{

    public static void main(String[] args)throws Exception4 {
        System.out.println("start : ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Examples.count : ");

        try {
            long count =Long.parseLong(br.readLine());
        }catch (IOException ex){
            
        }
    }
}
