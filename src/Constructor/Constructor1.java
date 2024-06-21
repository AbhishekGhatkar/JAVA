package Constructor;

public class Constructor1 {
    void Demo(){
        System.out.println("in demo");

    }
    void mi(){
        System.out.println("abc");
    }
    Constructor1(){
        System.out.println("In const");
        new Constructor1();

    }
    int x=10;
    public static void main(String[] args) {
        System.out.println("in function");

        Constructor1 obj=new Constructor1();
        obj.Demo();
        obj.mi();

        System.out.println(obj.x);
    }
}
