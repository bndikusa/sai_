package constructors;

public class Greetings {
    public static void main(String[] args) {

        Wishes hour = new Wishes();

        String name = hour.name("Sai");
        int saiage = hour.age();
        System.out.println(name);
        System.out.println(saiage);
        Chair paper= new Chair();
        String brush=paper.brown("laptop");
        System.out.println(brush);

    }
}
class Wishes{
    public String name( String value)
    {
        return "Hello Good Morning "  + value ;
    }

    public int age(){
        return 25;
    }
}

class Chair{
    public String brown(String plastic)
        {
            return "sit down " + plastic;
        }
}