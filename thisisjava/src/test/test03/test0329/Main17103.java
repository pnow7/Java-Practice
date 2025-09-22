package test.test03.test0329;

/*
골드바흐의 추측\
2보다 큰 짝수는 두 소수의 합으로 나타낼 수 있다.

[입력]
5
6
8
10
12
100

[출력]
1
1
2
1
6

 */
import java.io.*;
import java.util.*;
public class Main17103 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		//소수를 리스트에 다 쳐집은 다음에
		//두개를 뽑은 두개의 합이 입력한 값이랑 같으면 count+한다
		
		int N = Integer.parseInt(br.readLine());
		int[] num = new int[N];
		
		for(int i = 0; i < N; i++) {
			num[i] = Integer.parseInt(br.readLine());
			
			List<Integer> list = new ArrayList<>();
			//2보다 크고 입력한 숫자보다 작거나 같은 소수 구하기
			for(int j = 2; j <= num[i]; j++) {
				if(isPrime(j)) {
					list.add(j);
				}
			}
			
			int count = 0;
			for(int k = 0; k < list.size(); k++) {
				for(int l = k+1; l < list.size(); l++) {
					//list.get(k) < list.get(l) : 중복방지
					if(list.get(k) + list.get(l) == num[i]) {
						count++;
					}
				}
			}
			sb.append(count).append("\n");
		}
		
		bw.write(sb.toString());
		
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
