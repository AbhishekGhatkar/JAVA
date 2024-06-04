package Examples;

public class Student {

    String a="Akshay";
    String b="Bhushan";
    String c="Abhishek";

}
class Teacher extends Student{
    String Teacher ="Manik Sir";

}
class Class {
    public static void main(String[] args) {
        Teacher c=new Teacher();
        System.out.println(c.c);
    }
}

