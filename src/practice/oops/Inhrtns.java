package practice.oops;

public class Inhrtns {
    public static void main(String[] args) {
        //Operations only on Add() class
//        Add obj = new Add();
//        //System.out.println(obj.result); //result is instance variable:so gives 0
//        obj.num1=1;
//        obj.num2=2;
//        obj.sum();
//        System.out.println(obj.result);
        //Operations on Add and AddSub
//        AddSub obj = new AddSub();
//        obj.num1=1;
//        obj.num2=2;
//        obj.sub();//-1 // sub is not overriden by sum if both Add and AddSub are seperate classes (because variables are re declared)
//        obj.sum();// 3  // sub is overridden by sum if both Add and AddSub are seperate classes
//        System.out.println(obj.result);
        //Operations on Add and AddSub and AddSubMul
        AddSubMul obj =  new AddSubMul();

        obj.num1=1;
        obj.num2=2;
//        obj.mult();
//        ; // Why 0 ?
        System.out.println(obj.sum(obj.num1,obj.num2));
//        Calc calc=new Calc();
//        calc.sub();
    }
}
class Add //Parent/Super/Base Class
{
    int num1,num2,result ;
    public int sum(int num1,int num2)
    {

       result = num1+num2;
       return result;
    }
}
//class AddSub
//{
//    int num1,num2,result ;
//    public void sum()
//    {
//        result = num1+num2;
//    }
//    public void sub()
//    {
//        result = num1-num2;
//    }
//}


//This is Child/Sub/Derived Class
class AddSub extends Add  //Example for Single level Extension
{
    int num1,num2,result ;
    public void sub()
    {
        result = num1-num2;
    }
}
class AddSubMul extends AddSub
{
    int num1=25;
    public void mult()
    {
        result = num1*num2;
    }
}
class Calc extends AddSubMul
{

    int num1=20;
    public void div()
    {

        int num11 = super.num1;
        result = num1/num2;  // We cannot extend two classes // Why we cannot have multiple inheritances in Java
    }
}