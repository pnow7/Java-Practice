package test.test03.test0308;

import java.io.*;
public class Main1316 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int sum = 0;
		
		for(int i = 0; i < n; i++) {
			String s = br.readLine();
			int[] visit = new int[26];
			boolean group = true;
			
			for(int j = 0; j < s.length(); j++) {
				char ch = s.charAt(j);
				int index = ch - 'a';
				
				//전에 문자와 다르고 이전문자가 있으면
				if(j > 0 && (ch != s.charAt(j-1)) && (visit[index] == 1)) {
					group = false;
					break;
				}
				else {
					visit[index] = 1;
				}
			}
			if(group) {
				sum++;
			}
			
		}
		System.out.println(sum);

	}

}
