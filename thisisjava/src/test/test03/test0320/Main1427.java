package test.test03.test0320;

import java.io.*;
import java.util.*;
public class Main1427 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String number = br.readLine();
		int[] arr = new int[number.length()];
		List<Integer> result = new ArrayList<>();
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = number.charAt(i);
			result.add(arr[i]); 
		}
		
		Collections.sort(result, Collections.reverseOrder());
		
		for(int i = 0; i < number.length(); i++) {
			bw.write(result.get(i));
		}
		
		br.close();
		bw.flush();
		bw.close();
	}	

}
