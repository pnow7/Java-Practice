package test.test12.test1203;

/*
- 피로도
하루에 한 시간 단위로 일을 하거나 일을 쉬어도 된다.
하루에 한 시간 일하면 피로도는 A만큼 쌓이고 일은 B만큼 처리할 수 있다.

만약에 한 시간을 쉰다면 피로도는 C만큼 줄어든다. 단 피로도가 음수로 내려가면 0으로 바뀐다.
당연히 일을 하지 않고 쉬었기 때문에 처리한 일은 없다.

피로도를 최대한 M을 넘지 않게 일을 하려고 한다.
M을 넘기면 일하는데 번아웃이 와서 이미 했던 일들도 다 던져버리고 일을 그만두게 된다.

번아웃이 되지 않도록 일을 할때 최대 얼마나 일을 할 수 있는지 구해보자.
하루는 24시간이다.

첫 번째 줄에 네 정수 A, B, C, M 입력으로 들어옴
맨처음 피로도는 0

하루에 번아웃이 되지 않도록 일을 할 때 최대 얼마나 많은 일을 할 수 있는지 출력

=> A: 1시간당 피로도, B: 1시간당 일처리, C: 1시간당 피로도 감소, M: 피로도 제한

[입력]
5 3 2 10

10 5 1 10

11 5 1 10

[출력]
24

15

0

*/

import java.io.*;
import java.util.*;

public class Main22864 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		if (a > m) {
			System.out.println(0);
			return;
		}
		
		int fatigue = 0;
		int work = 0;
		
		for (int i = 1; i <= 24; i++) {
			if (fatigue + a <= m) {
				fatigue += a;
				work += b;
			} else {
				fatigue -= c;
				if (fatigue < 0) fatigue = 0;
			}
		}
		
		System.out.println(work);
		br.close();
	}
	
}
