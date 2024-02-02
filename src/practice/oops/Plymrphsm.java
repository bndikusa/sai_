package practice.oops;

public class Plymrphsm {
    public static void main(String[] args) {
 B obj = new B();
//         obj.show();
         obj.abc();
    }
}
class A //Super Class
{
    int i = 5;
    public void abc()
    {
        System.out.println("A  abc");
    }
}
class B extends A  //Sub Class
{
//    int i=4;
//
//    public void show()
//    {
//        System.out.println(super.i);
//    }
    public void abc()
    {
        System.out.println("B abc");
    }
}