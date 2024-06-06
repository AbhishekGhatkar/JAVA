package Methods;

import java.util.Scanner;


public class Methodsd1 {


    int sumOfTwo(int num1, int num2){                       // int sumOfTwo(11,21)

        num1 = 100;
        int ans = num1+num2;
        return ans;


    }

    void printNumber(int num){

        System.out.println(num);


    }

    static void m1(){
        System.out.println("In m1");
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        char c ;
        do{
            System.out.println("Addition of Two Number Program :");
            System.out.println("Enter the first number :");
            int num1 = sc.nextInt();                            //11

            System.out.println("Enter the second number :");
            int num2 = sc.nextInt();                            //21

            Methodsd1 obj = new Methodsd1();
            int ans1 = obj.sumOfTwo(num1, num2);                 //11, 21
            obj.printNumber(11);
            System.out.println("num1 " + num1);
            obj.m1();

            System.out.println("Addition of two numbers are : "+ans1);

            System.out.println("Do you want to continue ? :");
            c = sc.next().charAt(0);
        }while(c == 'Y' || c == 'y');
    }
}
