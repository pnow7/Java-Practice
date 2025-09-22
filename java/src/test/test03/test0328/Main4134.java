package test.test03.test0328;
/*
다음소수
[입력]
3
6
20
100

[출력]
7
23
101
*/
import java.io.*;
import java.util.*;
public class Main4134 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		List<Long> list = new ArrayList<>();
		
		int N = Integer.parseInt(br.readLine());
		Long[] num = new Long[N];
		
		for(int i = 0; i < N; i++) {
			num[i] = Long.parseLong(br.readLine());
			
			//입력한 값이 2보다 작을때
			//ex) 1이나 0일때
			if(num[i] < 2) {
				list.add((long)2);
			}
			//2보다 클때
			//소수판별하기
			else {
				for(Long j = num[i]; j < num[i]*2; j++) {
					//6에서 쭉 올라감 12까지
					//그 중 소수가 있으면 list에 추가g하고 종료
					if(isPrime(j)) {
						list.add(j);
						break;
					}
				}
			}
		}
	
		for(Long k : list) {
			bw.write(k+"\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
		
	}
	//소수판별
	public static boolean isPrime(Long num) {
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
