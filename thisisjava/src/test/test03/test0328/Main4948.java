package test.test03.test0328;


/*
베르트랑 공준

자연수 n에 대하여 
n보다 크고 2n보다 작거나 같은 소수는
적어도 하나 존재한다

[입력]
1
10
13
100
1000
10000
100000
0

[출력]
1
4
3
21
135
1033
8392
*/

import java.io.*;
public class Main4948 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		String s = "";
		while((s = br.readLine()) != null) {
			//int num = Integer.parseInt(br.readLine())이 아니라
			//br.readLine()을 s로 바꿔준다
			int num = Integer.parseInt(s);
			//0값 되면 바로 종료
			if(num == 0) {
				break;
			}
			
			int count = 0;
			for(int i = num+1; i <= 2*num; i++) {
				if(isPrime(i)) {
					count++;
				}
			}
			//sb.append(count+"\n")
			//이렇게 해버리면 int인 count가 문자형태로 바뀌어버림
			sb.append(count).append("\n");
	
		}
		bw.write(sb+"");
		br.close();
		bw.flush();
		bw.close();
	}
	public static boolean isPrime(int num) {
		if(num < 2) {
			return false;
		}
		
		for(int i = 2; i <= Math.sqrt(num); i++) {
			if(num%i == 0) {
				return false;
			}
		}
		
		return true;
	}

}
