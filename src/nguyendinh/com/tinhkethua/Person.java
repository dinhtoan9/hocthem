package nguyendinh.com.tinhkethua;

public class Person extends School {


        public String name;
        public int age;
        public float height;
        public String address;

        //hàm xây dựng
        //nhận giá trị từ khóa super ở lớp con
        public Person(String name, int age, float height) {
            this.name = name;
            this.age = age;
            this.height = height;
        }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.height = height;

    }

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.address = address;

    }

        public Person(String name, int age, float height, String address) {
            this.name = name;
            this.age = age;
            this.height = height;
            this.address = address;

        }

        public void getInfo() {
            System.out.println("Name:" + this.name);
            System.out.println("Age:" + this.age);
            System.out.println("Height:" + this.height);
           // System.out.println("Address:" + this.address);

                    }

        public static void main(String[] args){
            Person person = new Person("Dinh", 23, 50, "ND");
            person.getInfo();

          //  Person person2 = new Person("Dinh", 23, 50);
          //  person.getInfo();
        }
}
