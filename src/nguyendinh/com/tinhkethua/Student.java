package nguyendinh.com.tinhkethua;

public class Student  extends Person {

    String universityName;

    public Student(String name2, int age2, float height2, String universityName) {

        super(name2, age2, height2);//nó truyền ngược về class cha
        this.universityName = universityName;

    }

    public void getInfoChild () {   //getInfo của cha
        super.getInfo();  //của person thông qua từ khóa super
        System.out.println("universityName: " + this.universityName);
    }

    public static void main(String[] args) {
        Student student = new Student("Nhung", 40, 160, "Hoc vien tai chinh");
        student.getInfoChild();
        student.getSchoolName();




    }
}




