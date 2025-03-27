package a0327.접근제어자;

class DefaultClass{
    void display(){ //void 앞에 아무것도 없으면 default가 생략된 형태임
        System.out.println("같은 패키지 내부에서만 접근 가능");
    }
}
public class Default {
    public static void main(String[] args) {
        DefaultClass obj=new DefaultClass();
        obj.display();  //정상 실행. (같은 패키지라서)
    }
}
