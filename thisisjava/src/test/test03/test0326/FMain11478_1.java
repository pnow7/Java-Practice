package test.test03.test0326;

import java.io.*;
import java.util.*;
public class FMain11478_1 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Map<String, Integer> map = new HashMap<>();
		
		String s = br.readLine();
		
		for(int i = 0; i < s.length(); i++) {
			for(int j = i+1; j <= s.length(); j++) {
				String s1 = s.substring(i,j);
				map.put(s1, 1);
			}
		}
		
		bw.write(map.size()+"");
		
		br.close();
		bw.flush();
		bw.close();
	}

}
