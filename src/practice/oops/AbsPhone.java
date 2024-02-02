package practice.oops;

public class AbsPhone {
    public static void main(String[] args) {
 Samsung obj1 = new Samsung();
 Iphone obj2 = new Iphone();
// obj1.showOS();
// obj2.showOS();
        show(obj2);
    }
    public static void show(Phone apple)
    {
        apple.showOS();
    }

}
abstract class Phone { //Abstract class
    public abstract void showOS(); //Abstract method
}
class Samsung extends Phone{
    public void showOS(){
        System.out.println("Android");
    }
}
class Iphone extends Phone {
    public void showOS(){
        System.out.println("IOS");
    }
}