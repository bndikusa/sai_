package practice;

public class Cntobjs {
    public static void main(String[] args) {
int a=10;
        Objs obj1 = new Objs();
        Objs obj2 = new Objs();
        Objs obj3 = new Objs();
        obj1.counter();
        obj2.counter();
        obj3.counter();
        Objs obj4 = new Objs(24);
    }
}


class Objs
{
    static int i ;
    public Objs()
    {
        i++;
    }
    public  Objs(int age )
    {
        System.out.println("your age" +age);
    }
    public void counter()
    {
        System.out.println(i);
    }
}

