import java.util.Arrays;

public class OutTest {

    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] += i;
        }

        System.out.println(Arrays.toString(arr));
    }
}