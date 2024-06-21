package Constructor;

public class Constructor2 {
    void m1(){
        System.out.println("In m1");

    }
    void m2(){
        System.out.println(this);
        System.out.println(this.x);
        m1();
        System.out.println(x);
    }
    int x=10;
    int y=20;
    Constructor2(){
        System.out.println("in constructor");
    }
    Constructor2(int a,int y){
        System.out.println("parameterized Constructor.Constructor");
        System.out.println(a);
        System.out.println(y);

    }

    public static void main(String[] args) {
        Constructor2 obj=new Constructor2();
        System.out.println(obj);
        obj.m2();
        Constructor2 obj1=new Constructor2(60,50);

        obj1.m2();
        obj1.m1();
        System.out.println(obj1.x);
        System.out.println(obj1.y);
    }

}
