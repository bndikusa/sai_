package practice.oops;

public class Encap { // Changing value of i without using any method
    public static void main(String[] args) {
        Enncapp obj = new Enncapp();
        obj.setI(5);
    }
}
class Enncapp {
    private int i ;
    public void setI(int j)   // Camil casing rule / i is value / setting the value
    {
        i=j;
    }
    public int getI() //  Getting the value
    {
        return i;
    }
// no.of Getters and Setters = number of variables
}
