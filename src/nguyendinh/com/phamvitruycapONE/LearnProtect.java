package nguyendinh.com.phamvitruycapONE;

import nguyendinh.com.phamvitruycapONE.package_child.ClassC;

public class LearnProtect extends ClassC{

    public static void main(String[] args) {
        ClassB classB = new ClassB();

        classB.msg();
        System.out.println(classB.data);

        //ví dụ gọi hàm protected ngoài package  - thông qua kế thừa classC
        LearnProtect learnProtect = new LearnProtect();
        learnProtect.showInfo();




        









    }
}
