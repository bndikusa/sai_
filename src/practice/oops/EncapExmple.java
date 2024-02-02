package practice.oops;

public class EncapExmple {
    public static void main(String[] args) {
        Mem m1 = new Mem();
        m1.setMemId(1);
        m1.setMemName("sai");
        Mem m2 = new Mem();
        m2.setMemId(2);
        m2.setMemName("Bablu");

        System.out.println(m1.getMemId());
        System.out.println(m1.getMemName());
        System.out.println(m2.getMemId());
        System.out.println(m2.getMemName());
    }


}
class Mem
{
    private int MemId;
    private String MemName;

    public int getMemId() {
        return MemId;
    }

    public void setMemId(int memId) {
        MemId = memId;
    }

    public String getMemName() {
        return MemName;
    }

    public void setMemName(String memName) {
        MemName = memName;
    }
}
