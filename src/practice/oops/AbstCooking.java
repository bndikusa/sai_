package practice.oops;

public class AbstCooking {
    public static void main(String[] args) {
Bhavani Maggie= new Sai();
Maggie.groceries();
Maggie.dishwashing();
Maggie.chopping();
Maggie.cooking();
    }
}
abstract class  Bhavani{
    public void cooking()
    {
        System.out.println(" Cooking");
    }
    public abstract void chopping();
    public abstract void groceries();
    public abstract void dishwashing();
}
abstract class Bablu extends Bhavani {
    public void chopping()
    {
        System.out.println(" chopping vegetables");
    }
}
class Sai extends Bablu {
    public void groceries(){
        System.out.println(" Bring groceries");
    }
    public void dishwashing(){
        System.out.println("Wahsing Dishes");
    }
}
