package F.bronze;

/*
- 상수

상수는 수를 다른 사람과 다르게 거꾸로 읽는다. 
예를 들어, 734와 893을 칠판에 적었다면, 상수는 이 수를 437과 398로 읽는다. 
따라서, 상수는 두 수중 큰 수인 437을 큰 수라고 말할 것이다.

[입력]
734 893

839 237

[출력]
437

938

*/

import java.io.*;
import java.util.*;

public class Constant {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		int b = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		
		System.out.println((a > b) ? a : b);
		br.close();
	}
	
}

/*
 * int a = Integer.parseInt(st.nextToken());
 * int b = Integer.parseInt(st.nextToken());

 * int constA = (a / 100) + (a % 10) * 100 + ((a - (a / 100) * 100) / 10) * 10;
 * int constB = (b / 100) + (b % 10) * 100 + ((b - (b / 100) * 100) / 10) * 10;
 */