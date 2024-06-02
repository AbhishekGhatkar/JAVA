package String;

public class String1 {
    public static void main(String[] args) {

        String str="Manik Tambulkar Will Be The Most Successful Person by Year 2024";
        char[] arr=str.toCharArray();
        int finalcount=0;
        char c=arr[0];
        for(int i=0;i< arr.length;i++){
            int count=0;
            for(int j=i;j<arr.length;j++){
                if(arr[i]==arr[j]&&arr[i]!=' '){
                    count++;
                }
            }
            if(count>=finalcount){
                finalcount=count;
                c=arr[i];
            }
        }
        System.out.println("the highest frequency for character "+c+" is "+finalcount);
    }
}
