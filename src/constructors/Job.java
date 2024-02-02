package constructors;

public class Job {
    public static void main(String[] args) {
        Sai parttime= new Sai();
        String a =parttime.Gas(13);
        System.out.println(a);
        Bablu multiple= new Bablu();
        String b = multiple.liqour(13);
        System.out.println(b);
        String c = multiple.motel(10);
        System.out.println(c);
    }
}
class Sai {
   public String Gas(int pay)
   {
       return "Owner is zakaria and pay is: "+ pay;
   }
}
class Bablu {
    public String liqour(int pay)
    {
        return "Owner is vipul and pay is :"+ pay;
    }
    public String motel(int pay)
    {
        return "Owner is yogesh and pay is :"+ pay;
    }
}
