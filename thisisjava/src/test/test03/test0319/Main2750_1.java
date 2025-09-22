package test.test03.test0319;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.io.*;
import java.util.*;

public class Main2750_1 {
//List<Integer> 변수 = new ArrayList<>();
//size(), add, contains(), indexOf(), sort()
//Collections.sort()
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		//List<Integer> 변수 = new ArrayList<>();
		
		List<Integer> num = new ArrayList<>();

		for(int i = 0; i < N; i++) {
			int number = Integer.parseInt(br.readLine());
			num.add(number);
		}
		
		//오름차순
		Collections.sort(num);
		
		for(int i = 0; i < N; i ++) {
			//변수.get();
			System.out.println(num.get(i));
		}
		
		br.close();

	}

}
