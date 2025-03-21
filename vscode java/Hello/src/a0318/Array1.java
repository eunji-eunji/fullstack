package a0318;

public class Array1 {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };
        System.out.println(sumArray(numbers));
    }

    public static int sumArray(int[] arr) {
        int sum = 0;
        // for (int i = 0; i < arr.length; i++) {
        //     sum = sum + arr[i];
        // }

        for(int num:arr)    //향상된 for문. 위와 같은 뜻. 각각 원소를 출력하거나 추출할 때 사용. 각 원소를 수정할 수 없음.
            sum += num;

        return sum;
    }

}
