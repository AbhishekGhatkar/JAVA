package String;

public class StringClass {
    public static void main(String[] args) {
        //StringBuffer
        StringBuffer str=new StringBuffer("xyz");
        str=str.append("xyz");
        System.out.println(str);

        //Strin Builder
        StringBuilder str1=new StringBuilder("xyz");
        str1.append("xfdfZZZ>>");
        System.out.println(str1);
        System.out.println(str1.toString());
    }
}
