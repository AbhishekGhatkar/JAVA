package Constructor;

public class Constructor4 {
    static int x=10;
    static {
        System.out.println("hello,world !");
    }

    public static void main(String[] args) {
    String str="winning is not a prize";

        String[] words = str.split(" ");
        StringBuffer sb = new StringBuffer();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]).append(" ");
        }
        System.out.println(str+"  ||  ||  "+sb.toString());

    }
}
