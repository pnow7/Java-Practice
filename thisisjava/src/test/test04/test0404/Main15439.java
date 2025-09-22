package test.test04.test0404;

/*
-베라의 패션
베라는 상의 N 벌과 하의 N 벌이 있다. 
i 번째 상의와 i 번째 하의는 모두 색상 i를 가진다. N 개의 색상은 모두 서로 다르다.

상의와 하의가 서로 다른 색상인 조합은 총 몇 가지일까?

1
0

2
2

5
20

*/

import java.io.*;
public class Main15439 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		bw.write(N*(N-1)+"");
		br.close();
		bw.flush();
		bw.close();
	}
}
