package object_oriented_practice.ch12.practice11;

import java.util.*;

public class StringTokenizerExample {

	public static void main(String[] args) {
		String str = "아이디,이름,패스워드";	
		StringTokenizer st = new StringTokenizer(str,",");
		
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
		
	}
	
}

//StringTokenizer st = new StringTokenizer(str,",");
//
//while(st.hasMoreToken()) {
//	String token = st.nextToken();
//	System.out.println(token);
//}


