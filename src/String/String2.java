package String;

public class String2 {
    public static void main(String[] args) {
          String str1= "sanika";
          String str2="akshay";
          String str3="Abhishek";
          String str4="Harshada";
          String str5=new String("akshay");
          String str6=str5.intern();
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str5));
        System.out.println(str2==str6);
    }
}
