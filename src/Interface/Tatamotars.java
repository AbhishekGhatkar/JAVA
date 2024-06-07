package Interface;

public class Tatamotars implements TATA {

    @Override
    public void EmployyeData(EmployyeData data) {
        System.out.println(data.getName());
        System.out.println(data.getPhnum());
    }


}
class Tcs implements TATA{

    @Override
    public void EmployyeData(EmployyeData data) {
        System.out.println(data.getName());
        System.out.println(data.getPhnum());
    }
}
class main {
    public static void main(String[] args) {
     EmployyeData obj= new EmployyeData();
     obj.setName("Abcdeg");
     obj.setPhnum("8902345674");



    }
}