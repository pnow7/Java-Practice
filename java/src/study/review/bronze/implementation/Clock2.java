package study.review.bronze.implementation;

/*
- 시계

전화를 걸고 싶은 번호가 있다면, 
숫자를 하나를 누른 다음에 금속 핀이 있는 곳 까지 시계방향으로 돌려야 한다. 
숫자를 하나 누르면 다이얼이 처음 위치로 돌아가고, 다음 숫자를 누르려면 다이얼을 처음 위치에서 다시 돌려야 한다.

숫자 1을 걸려면 총 2초가 필요하다. 
1보다 큰 수를 거는데 걸리는 시간은 이보다 더 걸리며, 한 칸 옆에 있는 숫자를 걸기 위해선 1초씩 더 걸린다.

[입력]
WA

UNUCIC

[출력]
13

36

*/

import java.io.*;

public class Clock2 {

	private static final String[] dial = {"ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String word = br.readLine();
		
		int totalTime = 0;
		
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			
			for (int j = 0; j < dial.length; j++) {
				if (dial[j].contains(String.valueOf(ch))) {
					// 해당 알파벳 까지 2초 +, 배열이라서 + 1 => j + 3
					totalTime += (j + 3);
					break;
				}
			}
		}
		
		System.out.println(totalTime);
		br.close();
	}
	
}
