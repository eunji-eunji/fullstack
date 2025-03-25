package a0325.product;

import java.util.Scanner;

public class CURDExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ProductManager manager = new ProductManager();
        boolean run = true;

        // 새로운 제품 직접 추가
        manager.addProduct("speaker", 10);

        while (run) {
            System.out.println("\n📌 제품 관리 시스템");
            System.out.println("1. 제품 추가");
            System.out.println("2. 제품 목록 보기");
            System.out.println("3. 제품 수정");
            System.out.println("4. 제품 삭제");
            System.out.println("5. 종료");
            System.out.print("선택 > ");
            int choice = scan.nextInt();
            scan.nextLine(); // 개행 문자 제거
            switch (choice) {
                case 1:
                    System.out.print("제품명 입력: ");
                    String name = scan.nextLine();
                    System.out.print("가격입력: ");
                    double price = scan.nextDouble();
                    manager.addProduct(name, price);
                    break;
                case 2:
                    manager.listProduct();
                    break;
                case 3:
                    System.out.print("수정할 제품 ID: ");
                    int idUpdate = scan.nextInt();
                    scan.nextLine();
                    System.out.print("새로운 제품명: ");
                    String newName = scan.nextLine();
                    System.out.print("새로운 가격: ");
                    double newprice = scan.nextDouble();

                    manager.updateProduct(idUpdate, newName, newprice);
                    break;
                case 4:
                    System.out.print("삭제할 제품 ID: ");
                    int delete = scan.nextInt();
                    if(manager.delProduct(delete)){
                        System.out.println("제품이 삭제되었습니다.");
                    }else{
                        System.out.println("해당 제품이 없습니다.");
                    }
                    break;
                case 5:
                    System.out.println("종료");
                    run = false;
                    break;
                default:
                    break;
            }
        }

    }
}
