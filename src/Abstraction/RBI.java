package Abstraction;

public abstract class  RBI {
    RBI(){
        System.out.println("in");
    }
    public abstract void Withdrawal();
    public abstract void Deposite();
    public final void DeleteAcc(){
        System.out.println(" As per RBI rule");
    }


}
class Bob extends RBI{


    @Override
    public void Withdrawal() {

    }

    @Override
    public void Deposite() {

    }

    public static void main(String[] args) {

    }
}
