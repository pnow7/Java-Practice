package test.test04.test0419;

/*

재귀의 귀재
팰린드롬이면 1, 아니면 0을 반환

문자열 
S를 isPalindrome 함수의 인자로 전달하여 팰린드롬 여부를 반환값으로 알아낼 것이다. 
더불어 판별하는 과정에서 recursion 함수를 몇 번 호출하는지 셀 것이다.


public class Main{
    public static int recursion(String s, int l, int r){
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }
    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }
    public static void main(String[] args){
        System.out.println("ABBA: " + isPalindrome("ABBA"));
        System.out.println("ABC: " + isPalindrome("ABC"));
    }
}

*/

import java.io.*;
public class Main25501 {
	static int count;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++) {
			String s = br.readLine();
			sb.append(isPalindrome(s)+" "+count+"\n");
		}
		System.out.print(sb);
		br.close();
	}
	
	public static int recursion(String s, int l, int r) {
		count++;
		if(l >= r) return 1;
		else if(s.charAt(l) != s.charAt(r)) return 0;
		else return recursion(s, l+1, r-1);
	}
	
	public static int isPalindrome(String s) {
		count = 0;
		return recursion(s, 0, s.length()-1);
	}
	
	
}
