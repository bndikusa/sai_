package constructors;

public class Calculator {
    public static void main(String[] args) {
        Additiion adn = new Additiion();
        double d = adn.add(3,4.6);
        //  String d = adn.add();//
        System.out.println(d);
        Subtraction  sbn = new Subtraction();
        double s = sbn.sub(6,4);
        System.out.println(s);
    }
}
    class Additiion{
        public int add(int num1, int num2)
        {
            return num1 + num2;
        }
        public String add()
        {
            return "This is addition";
        }
        public double add(double num1, double num2)
        {
            return num1 + num2;
        }

    }


