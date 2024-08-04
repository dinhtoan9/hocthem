package nguyendinh.com.tinhdonggoi;

public class Student {

    //biến thể hiện giá trị thông tin của sinh vieen

    private String mssv;
    private String name;
    private int age;

    private String gender;
    private String email;
    private String password;
    private String phone;
    private String address;
    private final String schoolName = "Hoc vien tài chinh";


    //get values


    public String getSchoolName() {
        return schoolName;
    }

    public String getMssv() {
        return mssv;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password){
        if(password.length() < 6 ) {
            System.out.println("lỗi password nên từ 6 ký tự trở lên");

        } else if(password.length() > 16) {
            System.out.println("lỗi password nên nhỏ hơn 16 ký tự");
        }else {
                    this.password = password;
                }
            }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }


    //set values
    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 100) {
            System.out.println("tuoi khong duoc qua 100");

        } else {
            this.age = age;
        }
    }


    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
