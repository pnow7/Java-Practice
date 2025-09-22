package test.test06.test0606;

/*
N개의 수로 이루어진 수열 A1, A2, ..., AN이 주어진다. 
또, 수와 수 사이에 끼워넣을 수 있는 N-1개의 연산자가 주어진다. 
연산자는 덧셈(+), 뺄셈(-), 곱셈(×), 나눗셈(÷)으로만 이루어져 있다.

우리는 수와 수 사이에 연산자를 하나씩 넣어서, 수식을 하나 만들 수 있다. 이때, 주어진 수의 순서를 바꾸면 안 된다.

예를 들어, 6개의 수로 이루어진 수열이 1, 2, 3, 4, 5, 6이고, 
주어진 연산자가 덧셈(+) 2개, 뺄셈(-) 1개, 곱셈(×) 1개, 나눗셈(÷) 1개인 경우에는 
총 60가지의 식을 만들 수 있다. 

예를 들어, 아래와 같은 식을 만들 수 있다.

1+2+3-4×5÷6
1÷2+3+4-5×6
1+2÷3×4-5+6
1÷2×3-4+5+6
식의 계산은 연산자 우선 순위를 무시하고 앞에서부터 진행해야 한다. 
또, 나눗셈은 정수 나눗셈으로 몫만 취한다. 음수를 양수로 나눌 때는 C++14의 기준을 따른다. 
즉, 양수로 바꾼 뒤 몫을 취하고, 그 몫을 음수로 바꾼 것과 같다. 
이에 따라서, 위의 식 4개의 결과를 계산해보면 아래와 같다.

1+2+3-4×5÷6 = 1
1÷2+3+4-5×6 = 12
1+2÷3×4-5+6 = 5
1÷2×3-4+5+6 = 7
N개의 수와 N-1개의 연산자가 주어졌을 때, 만들 수 있는 식의 결과가 최대인 것과 최소인 것을 구하는 프로그램을 작성하시오.

첫째 줄에 수의 개수 N(2 ≤ N ≤ 11)가 주어진다. 
둘째 줄에는 A1, A2, ..., AN이 주어진다. 
(1 ≤ Ai ≤ 100) 셋째 줄에는 합이 N-1인 4개의 정수가 주어지는데, 
차례대로 덧셈(+)의 개수, 뺄셈(-)의 개수, 곱셈(×)의 개수, 나눗셈(÷)의 개수이다.

첫째 줄에 만들 수 있는 식의 결과의 최댓값을, 둘째 줄에는 최솟값을 출력한다.

[입력]
2
5 6
0 0 1 0

[출력]
30
30

[입력]
3
3 4 5
1 0 1 0

[출력]
35
17

[입력]
6
1 2 3 4 5 6
2 1 1 1

[출력]
54
-24

*/

import java.io.*;
import java.util.*;

public class FMain14888 {
	
	static int MAX = Integer.MIN_VALUE;
	static int MIN = Integer.MAX_VALUE;
	static int N;
	static int[] number;
	static int[] operator = new int[4];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		
		number = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			number[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 4; i++) {
			operator[i] = Integer.parseInt(st.nextToken());
		}
		
		br.close();
		//1부터 시작(첫 번째 숫자는 연산하지 않기 때문에)
		dfs(number[0], 1);
		
		System.out.println(MAX);
		System.out.println(MIN);
		
		
	}
	//num: 현재까지 계산된 값
	//idx: 현재 연산할 숫자의 인덱스
	public static void dfs(int num, int idx) {
		if(idx == N) {
			MAX = Math.max(MAX, num);
			MIN = Math.min(MIN, num);
			return;
		}
		
		for(int i = 0; i < 4; i++) {
			if(operator[i] > 0) {
				
				operator[i]--;
				
				switch(i) {
				case 0: dfs(num + number[idx], idx + 1); break;
				case 1: dfs(num - number[idx], idx + 1); break;
				case 2: dfs(num * number[idx], idx + 1); break;
				case 3: dfs(num / number[idx], idx + 1); break;
				
				}
				
				operator[i]++;
			}
		}
		
	}

}
