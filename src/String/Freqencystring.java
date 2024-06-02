package String;

public class Freqencystring {
    public static void main(String[] args) {
        String str= "you r parries without yes for me";
        int[] arr=new int[128];

        for(int i=0;i<str.length();i++){
            arr[str.charAt(i)]++;

        }
        for(int i=0;i<arr.length;i++){
            if (arr[i]!=0){
                System.out.println("frequency of charcter "+(char)i+" is :"+arr[i]);
            }
        }

    }
}
