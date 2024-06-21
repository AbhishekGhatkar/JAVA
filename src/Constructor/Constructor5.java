package Constructor;

public class Constructor5 {


        int  x=100;
    static int y=20;

    public void main(String[] args) {
        Constructor5 obj=new Constructor5();
        this.x=10;
        this.y=30;
        Constructor5 obj1=new Constructor5();
        System.out.println(obj1.x);
        System.out.println(obj1.y);
    }
}
