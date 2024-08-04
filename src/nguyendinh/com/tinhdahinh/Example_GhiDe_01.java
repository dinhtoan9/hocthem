package nguyendinh.com.tinhdahinh;

class Vehicle {
    void run() {
        System.out.print("Vehicle is running");
    }
}

public class Example_GhiDe_01 extends Vehicle {

    void run() {
        System.out.print("Bike is running safely");

    }

    public static void main(String[] args) {
        Example_GhiDe_01 obj = new Example_GhiDe_01();
        obj.run();

        Vehicle vh = new Vehicle();
        vh.run();
        

    }
}
