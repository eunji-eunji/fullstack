package a0325.product;

import java.util.ArrayList;

public class ProductManager {
    private ArrayList<Product> products = new ArrayList<>();
    private int nextId = 1; // 제품 id 자동 증가

    // 생성자에서 더미데이터 추가
    public ProductManager(){
        products.add(new Product(nextId++, "Laptop", 12000));
        products.add(new Product(nextId++, "Mout", 50));
        products.add(new Product(nextId++, "Keyboard", 80));
    }

    public void addProduct(String name, double price) {
        products.add(new Product(nextId++, name, price)); // 1부터 시작
        System.out.println("제품이 추가되었습니다.");
    }

    public void listProduct() {
        if (products.isEmpty()) {
            System.out.println("제품이 없습니다.");
        } else {
            for (Product p : products) {
                System.out.println(p.toString());
            }
        }
    }

    public boolean updateProduct(int idUpdate, String newName, double newprice) {
        for(Product a:products){
            if(a.getId()==idUpdate){
                a.setName(newName);
                a.setPrice(newprice);
                System.out.println("제품이 수정되었습니다.");
                return true;
            }
        }
        System.out.println("제품 아이디가 없습니다.");
        return false;
    }

    public boolean delProduct(int delete) {
        for(Product a:products){
            if(a.getId()==delete){
                products.remove(a);
                return true;
            }
        }
        return false;
        // return products.removeIf(a -> a.getId() == delete);
        // 위와 같은 표현. 람다식.
        // a의 id가 delete랑 같으면 true.
    }

}
