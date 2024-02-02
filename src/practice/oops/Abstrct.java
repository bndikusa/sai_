package practice.oops;

public class Abstrct {
    public static void main(String[] args) {
MaheshPhone obj = new SureshPhone(); // Abstact class cannot be instantiated
        obj.call();
        obj.cook();
        obj.dance();
        obj.move();
    }
}
abstract class MaheshPhone {  //ABSTRACT CLASS
public void call()
{
    System.out.println(" calling....");
}
public abstract void move(); //Abstact method
public abstract void dance();
public abstract void cook();

}
abstract class RameshPhone extends MaheshPhone {
    public void move()
    {
        System.out.println("moving....");
    }
}
class SureshPhone extends RameshPhone  //CONCRETE CLASS
{
    public void dance(){
        System.out.println("dancing");
    }
    public void cook(){
        System.out.println("cooking");
    }
}


