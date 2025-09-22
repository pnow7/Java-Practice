package test.test03.test0326;

/*
문자열 S가 주어졌을 때, S의 서로 다른 부분 문자열의 개수를 구하는 프로그램을 작성하시오.

부분 문자열은 S에서 연속된 일부분을 말하며, 길이가 1보다 크거나 같아야 한다.

예를 들어, 
ababc의 부분 문자열은 
a, b, a, b, c, ab, ba, ab, bc, aba, bab, abc, abab, babc, ababc가 있고, 

a b a b
ab 
서로 다른것의 개수는 12개이다.
*/
import java.io.*;
import java.util.*;
public class FMain11478 {
//중복만 제거
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		Set<String> set = new HashSet<>();
		
		String s = br.readLine();
		
		for(int i = 0; i < s.length(); i++) {
			for(int j = i+1; j <= s.length(); j++) {
				String s1 = s.substring(i,j);
				set.add(s1);
			}
		}
		bw.write(set.size()+"");
		
		br.close();
		bw.flush();
		bw.close();
	}

}
