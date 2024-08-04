package nguyendinh.com.tinhdonggoi;

public class LearnTinhDongGoi {

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.getSchoolName());
        System.out.println(student.getSchoolName());

        //set thoong tin vafo cho calss Student
        student.setMssv("SV0010");
        student.setName("nguyendinh");
        student.setAge(23);

        student.setPassword("SeleniumJavaAnhTester");


        //lay ra thong tin cua sinh vien
        System.out.println(student.getMssv());
        System.out.println(student.getName());
        System.out.println(student.getAge());

        System.out.println(student.getPassword());



    }

}
