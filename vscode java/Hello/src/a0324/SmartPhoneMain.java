package a0324;

public class SmartPhoneMain {
    public static void main(String[] args) {
        Phone ph = new Phone();
        ph.name = "전화기";
        ph.company = "현대";
        ph.color = "화이트";
        System.out.println("Phone 출력");
        System.out.println(ph.name);
        System.out.println(ph.company);
        System.out.println(ph.color);
        ph.call();
        ph.receive();
        // ph.installApp();     안됨
        System.out.println();

        SmartPhone sp = new SmartPhone();
        sp.name = "갤럭시";
        sp.company = "삼성";
        sp.color = "블랙";
        System.out.println("SmartPhone 출력");
        System.out.println(sp.name);
        System.out.println(sp.company);
        System.out.println(sp.color);
        sp.call();
        sp.receive();
        sp.installApp();

    }
}
