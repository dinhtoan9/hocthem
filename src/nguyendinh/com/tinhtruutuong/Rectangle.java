package nguyendinh.com.tinhtruutuong;

public class Rectangle extends Shape implements Person, School {

    public double area() {
        return 10;
    }

    public String getName() {
        return null;
    }

            public String getAddress() {
                return null;
            }
    public String getCity(){
        return null;
    }

    @Override
    public String getState() {
        return null;
    }

    @Override
    public int getAge() {
        return 0;
    }

    @Override
    public int getYear() {
        return 0;
    }

}
