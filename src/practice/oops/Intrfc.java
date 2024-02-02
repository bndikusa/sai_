package practice.oops;

interface Abc
{
    void show();
}
class AbcImpl implements Abc
{
    public void show()
    {
        System.out.println("Hello");
    }
}

public class Intrfc {
    public static void main(String[] args) {
Abc obj = new AbcImpl();
obj.show();
    }

}
//Abc obj = new Abc() { //Anonymous classes
////    @Override
////    public void show() {
////        System.out.println(" Inside show");
////    }
////};
////        obj.show();
//        Abc obj = () -> System.out.println(" in show") ; // LAMBDA Expression
//                obj.show();

////Three types of Interfaces
//1. Marker Interfac - Without any methods
//2. SAM - Single Abstract Method - Functional nethodd- only one interface
//3. Normal Interface

//class to  class = Extends
//interface to class =  Impliments
//Interface to interface = Extends