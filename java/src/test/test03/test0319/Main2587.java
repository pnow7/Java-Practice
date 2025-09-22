package test.test03.test0319;

import java.io.*;
import java.util.*;
public class Main2587 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		List<Integer> num = new ArrayList<>();
		int sum = 0;
		
		for(int i = 0; i < 5; i++) {
			int N = Integer.parseInt(br.readLine());
			num.add(N);
		}
		Collections.sort(num);
		
		for(int i = 0; i < 5; i++) {
			sum += num.get(i);
		}
		
		int result = sum/5;
		
		System.out.println(result);
		System.out.println(num.get(2));
		br.close();

	}

}
