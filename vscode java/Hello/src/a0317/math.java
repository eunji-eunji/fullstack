public class math {
    public static void main(String[] args) {
       // 1~6까지 랜덤 숫자 2개 불러와서 합이 5면 멈춤
        while (true) {
            int random1 = (int) (Math.random() * 6) + 1;
            int random2 = (int) (Math.random() * 6) + 1;
            System.out.printf("(%d, %d)\n", random1, random2);

            if (random1 + random2 == 5)
                break;

        }

    }
}
