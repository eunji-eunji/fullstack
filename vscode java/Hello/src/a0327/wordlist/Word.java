package a0327.wordlist;

import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Brain book = new Brain();
        while(true){
            book.menu();
            Scanner scan=new Scanner(System.in);

            System.out.print("메뉴 입력: ");
            String select=scan.nextLine();
            if(select.equals("1")){
                book.addWord();
            }else if(select.equals("2")){
                book.wordSearch();
            }else if(select.equals("3")){
                book.deleteWord();
            }else if(select.equals("4")){
                book.test();
            }else if(select.equals("5")){
                book.wordList();
            }else if(select.equals("6")){
                book.exit();
                break;
            }else{
                System.out.println("1~6까지의 숫자를 입력하세요.");
            }
        }
    }
}
