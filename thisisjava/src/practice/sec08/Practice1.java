package practice.sec08;

public class Practice1 {

	public static void main(String[] args) {
		int[] score = {79, 88, 91, 33, 100, 55, 95};
		
		int max = score[0];
		for(int i = 0; i < score.length; i++) {
			if(score[i] > max) {
				max = score[i];
			}
		}
		System.out.println(max);
		
		int min = score[0];
		for(int i = 0; i < score.length; i++) {
			if(score[i] < min) {
				min = score[i];
			}
		}
		System.out.println(min);
		
		int[][] array = {{95, 86},{83, 92, 96},{78, 83, 93, 87, 88}};
		int sum = 0;
		
		int count = 0;
		int avg = 0;
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
				count++;
			}
		}
		avg = sum/count;
		System.out.println(sum);
		System.out.println(avg);
	}

}
