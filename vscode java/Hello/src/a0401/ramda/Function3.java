package a0401.ramda;

interface Calculator2 {
    int sum1(int a, int b);
}

public class Function3 {
    public static void main(String[] args) {
        Calculator2 mc = Integer::sum;  //숫자형의 각 요소들을 합산(sum)해라.

        int result = mc.sum1(3, 4);
        System.out.println(result);
    }
}
