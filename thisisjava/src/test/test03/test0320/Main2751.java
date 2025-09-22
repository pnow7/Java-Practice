package test.test03.test0320;

import java.io.*;
import java.util.*;
public class Main2751 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		
		List<Integer> num = new ArrayList<>();
		
		for(int i = 0; i < N; i++) {
			int number = Integer.parseInt(br.readLine());
			num.add(number);
		}
		
		Collections.sort(num);
		
		for(int i = 0; i < N; i++) {
			bw.write(num.get(i)+"\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
		
	}

}
