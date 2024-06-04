package Examples;

public class n {
   int m1(){
       System.out.println("in m1");
        return 100;
   }
   float m1(float a){
       System.out.println("in m1 float");
       return 20.3f;
   }

    public static void main(String[] args) {
        n c=new n();
        c.m1();
        c.m1(20.3f);
    }
}
