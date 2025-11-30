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

public class Clock {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String word = br.readLine();
		
		int totalTime = 0;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			
			totalTime += getTime(ch);
		}
		 
		System.out.println(totalTime);
		br.close();
	}
	
	private static int getTime(char alpha) {
		int time = 0;
		
		switch(alpha) {
			case 'A': case 'B': case 'C':
				time = 3;
				break;
			case 'D': case 'E': case 'F':
				time = 4;
				break;
			case 'G': case 'H': case 'I':
                time = 5;
                break;
            case 'J': case 'K': case 'L':
                time = 6;
                break;
            case 'M': case 'N': case 'O':
                time = 7;
                break;
            case 'P': case 'Q': case 'R': case 'S':
                time = 8;
                break;
            case 'T': case 'U': case 'V':
                time = 9;
                break;
            case 'W': case 'X': case 'Y': case 'Z':
                time = 10;
                break;
            default:
                time = 0; 
                break;
        }
		
		return time;
	}
	
}
