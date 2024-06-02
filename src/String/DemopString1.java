package String;

import static java.lang.String.valueOf;

public class DemopString1 {

    int max = 0;
    int curr = 0;

    void append(String str, char[] carr) {
        int strLen = str.length();

        for (int i = 0; i < strLen; i++) {
            carr[curr++] = str.charAt(i);
        }
    }

    public static void main(String[] args) {
        String str1 = "Google";
        String str2 = "MicroSoft";
        String str3 = "Apple";

        DemopString1 obj = new DemopString1();

        obj.max = str1.length() + str2.length() + str3.length();
        char[] carr = new char[obj.max];

        obj.append(str1,carr);
        obj.append(str2, carr);
        obj.append(str3, carr);

        System.out.printf(valueOf(carr));
    }
}
