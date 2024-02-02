package constructors;

public class ConstrcutorExample {

    void apple(){
        System.out.println("print apple");
    }

    public static void main(String[] args) {
        ConstrcutorExample  referenceConstructor=new ConstrcutorExample();

        referenceConstructor.apple();

        ThirdConstructor thirdconstructor= new ThirdConstructor();
        thirdconstructor.grape();

        SecondConstructor secondConstructor=new SecondConstructor();
        secondConstructor.mango();

    }
}


class SecondConstructor {

    public void mango() {
        System.out.println("print mango");
    }
}

class ThirdConstructor{
        public void grape(){
            System.out.println("print grapes");
        }
}

