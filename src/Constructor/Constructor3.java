package Constructor;

public class Constructor3 {
    int x=10;
    int y=20;
    Constructor3(int x,int y){
        System.out.println("in const ");
    }
    void m1(int x,int y){
        this.x=x;
        this.y=y;
        System.out.println(this.x);
        System.out.println(this.y);

    }
    void m2(){
        System.out.println(this.x);
        System.out.println(this.y);
    }
    public static void main(String[] args) {
        Constructor3 obj=new Constructor3(10,20);
        obj.m1(1000,2000);
        obj.m2();
        Constructor3 obj1=new Constructor3(10,20);
        obj1.m2();
    }
}
