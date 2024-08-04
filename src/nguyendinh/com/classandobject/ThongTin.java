package nguyendinh.com.classandobject;

import nguyendinh.com.classandobject.NhanVien;

public class ThongTin {
    public static void main(String[] args) {
        NhanVien nv = new NhanVien();
        nv.getAddress();

       // nv.setName("Name");
        System.out.println(new NhanVien().getName());
    }

}
