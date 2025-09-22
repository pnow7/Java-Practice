package F;

/*
가로수가 (1, 3, 7, 13)의 위치에 있다면 
(5, 9, 11)의 위치에 가로수를 더 심으면 모든 가로수들의 간격이 같게 된다. 
또한, 가로수가 (2, 6, 12, 18)에 있다면 
(4, 8, 10, 14, 16)에 가로수를 더 심어야 한다.

모든 가로수가 같은 간격이 되도록 새로 심어야 하는 
가로수의 최소수를 구하는 프로그램을 작성하라. 
단, 추가되는 나무는 기존의 나무들 사이에만 심을 수 있다.

[입력]
4
1
3
7
13

[출력]
3

4 2 6 12 18

   4 8 10 14 16
[입력]
4
2
6
12
18

[출력]
5

*/

import java.io.*;
import java.util.*;
public class FMain2485 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		List<Integer> list = new ArrayList<>();
		
		int count = 0;
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		Collections.sort(list);

		int interval = list.get(1) - list.get(0);
		
		for(int i = 0; i < list.size() - 1; i++) {
			int start = list.get(i);
			int end = list.get(i+1);
			int diff = end - start;
			
			if(diff % interval != 0) {
				interval = gcd(interval, diff);
			}
		}
		
		for(int i = 0; i < list.size() - 1; i++) {
			int start = list.get(i);
			int end = list.get(i+1);
			for(int num = start + interval; num < end; num += interval) {
				count++;
			}
		}
		bw.write(count+"");
		
		br.close();
		bw.flush();
		bw.close();
	}
	//최대공약수
	public static int gcd(int a, int b) {
		while(b != 0) {
			int r = a%b;
			a = b;
			b = r;
		}
		return a;
	}
	//최소공배수
	public static int lcm(int a, int b) {
		return a*b/gcd(a, b);
	}
	//선언된 숫자들의 lcm계산
	public static int findLcmOfList(List<Integer> list) {
		int result = list.get(0);
		for(int i = 1; i < list.size(); i++) {
			result = lcm(result, list.get(i));
		}
		return result;
	}
}
