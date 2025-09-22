package test.test09.test0917;

/*

[입력]
55-50+40

10+20+30+40

00009-00009

[출력]
-35

100

0

*/

import java.io.*;

public class Main1541 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String exp = br.readLine();
		
		int sum = 0;
		
		String[] subExp = exp.split("-");
		
		String[] firstGroup = subExp[0].split("\\+");
		for (String s : firstGroup) {
			sum += Integer.parseInt(s);
		}
		
		for (int i = 1; i < subExp.length; i++) {
			String[] secondGroup = subExp[i].split("\\+");
			for (String s : secondGroup) {
				sum -= Integer.parseInt(s);
			}
		}
			
		System.out.println(sum);
		br.close();
	}
	
}