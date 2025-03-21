package a0321.Account1;

public class WebtoonTest {
    public static void main(String[] args) {
        Webtoon levelupup = new Webtoon("나 혼자만 레벨업", "판타지", "추공님");
        Webtoon sweethouse = new Webtoon("스위트 집", "스릴러", "칸비님");
        Webtoon itaewonclassic = new Webtoon("이태원 클래식", "드라마", "광진님");

        Webtoon[] webtoons = { levelupup, sweethouse, itaewonclassic }; // 객체 배열 가능
        for (int i = 0; i < webtoons.length; i++) {
            System.out.println(webtoons[i].toStr());
        }
        System.out.printf("웹툰 객체의 수: %d", Webtoon.getCount());
    }
}

class Webtoon {
    private String title;
    private String genre;
    private String author;
    private static int count = 0;

    Webtoon(String t, String g, String a) {
        count++;
        title = t;
        genre = g;
        author = a;
    }

    public static int getCount() {
        return count;
    }

    String toStr() {
        return String.format("Webtoon{title: %s, genre: %s, author: %s}", title, genre, author);
    }

}