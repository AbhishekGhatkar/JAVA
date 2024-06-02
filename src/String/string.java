package String;

public class string {
    public static void main(String[] args) {
        String str1 ="abc";
        String str2 ="abc";
        String str3 ="xyz";
        String str4 =new String("abc");
        String str5 =new String("abc");
        String str6="manik";
        String str7="manik tambulkar";
        String str8=str6+"tambulkar";
        String str9= "jai shree ram";
        String str10 =new String("jai shree ram");
        String str11= new String("madam");
        char[] arr=str11.toCharArray();
        System.out.println(str1==str2);
        System.out.println(str1==str4);
        System.out.println(str4==str5);
        System.out.println(str8==str7);
        System.out.println(str9.equals(str10));


       int start=0;
       int end =arr.length-1;
       boolean flag;
       while (start<=end){
           if(arr[start]!=arr[end]){
               
               break;

           }
           start++;
           end--;
       }
    }
}
