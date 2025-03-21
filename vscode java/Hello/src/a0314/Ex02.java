package a0314;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        double rating;
      
        Scanner scan=new Scanner(System.in);
        System.out.print("rating: ");
        rating=scan.nextDouble();

        if(rating<=9){
            System.out.println("'어바웃타임'을 추천합니다.");
        }
        if(rating<=8){
            System.out.println("'토이 스토리'를 추천합니다.");
        }
        if(rating<=7){
            System.out.println("'고질라'를 추천합니다.");
        }

           scan.close();
    }
}
