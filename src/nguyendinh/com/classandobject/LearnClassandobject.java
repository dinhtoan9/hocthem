package nguyendinh.com.classandobject;

public class LearnClassandobject {
    String name="Dinh";
    int age=18;

    public String getName() {
        return name;

    }

    public int getAge() {
        return age;

    }

    public void Cong2so(int a, int b){
        System.out.println("cộng 2 số: " + a + b);
    }
    public static void main(String[] args) {
        LearnClassandobject dinh = new LearnClassandobject();
        dinh.getName();
        dinh.Cong2so(1, 2);

        LearnClassandobject nam = new LearnClassandobject();
        nam.getAge();
        nam.Cong2so(4, 8);

        //gọi thành phần của lớp thông qua tên lớp
        //bắt buộc những thành phần trong lớp phải có trạng thái static
        //ví dụ gọi từ lớp sinh viên


        //System.out.println(sinhvien.getName());

        //gọi thành phần của 1 lớp theo kiểu Annonymous
        new LearnClassandobject().getAge();


    }
}
