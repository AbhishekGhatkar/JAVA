package Examples;

public class AnagramString {
    public static void main(String[] args) {

        String str1 = "Inheritance.Abc";
        String str2 = "bAA";

        boolean flag = true;
        if(str1.length() != str2.length()){
            System.out.println("Not anagram String.string");
        } else {
            int[] arr1 = new int[128];
            int[] arr2 = new int[128];

            int i = 0;
            while (i < str1.length()) {
                arr1[str1.charAt(i)]++;
                arr2[str2.charAt(i)]++;
                i++;
            }

            for (int j = 0; j < 128; j++) {
                if (arr1[j] != arr2[j]) {
                    flag = false;
                    System.out.println("Not Anagram");
                    break;
                }
            }
        }if(flag){
            System.out.println("It is anagram String");
        }
    }
}
