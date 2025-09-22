package study.algorithm.search;

public class BruteForce {

	public static void main(String[] args) {
		int[] arr = {1, 3, 5, 7, 9};
        int target = 10;

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("찾은 쌍: " + arr[i] + " + " + arr[j] + " = " + target);
                }
            }
        }
	}

}
