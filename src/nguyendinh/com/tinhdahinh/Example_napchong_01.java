package nguyendinh.com.tinhdahinh;

public class Example_napchong_01 {
    public void tinhtong1(int a, int b) {
        System.out.println(a + b);

    }

    public void tinhtong2(int a, int b, int c){//thay đổi số lượng tham soo sẽ không bị lỗi
        System.out.println(a + b + c);
    }

    public void login(String username, String password) {
        System.out.println("Set Text: " + username);
        System.out.println("Set Text: " + password);
        System.out.println("Click Login button");
    }

    public void login (String username, String password, String validateMessage){
        System.out.println("Set Text: " + username);
        System.out.println("Set Text: " + password);
        System.out.println("Click Login button");
        System.out.println("Verify message:" + validateMessage);

    }

    public static void main(String[] args) {
        Example_napchong_01 nc = new Example_napchong_01();

        nc.tinhtong1(1, 9);

        nc.login("admin 1233456", "123456", "Invalid login credentials");

    }


}
