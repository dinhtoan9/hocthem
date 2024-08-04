package nguyendinh.com.phamvitruycapONE;

public class ClassA {
    private int data  = 40;

    protected void msg() {
        System.out.println("Hello java");
    }


    public static void main(String[] args) {
        ClassA classA = new ClassA();
        classA.msg();
    }
}
