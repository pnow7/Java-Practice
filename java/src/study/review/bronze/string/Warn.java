package study.review.bronze.string;

/*
- 경고

첫째 주에 현재 시간이 hh:mm:ss 형식으로 주어진다. 
(시, 분, 초) hh는 0보다 크거나 같고,
23보다 작거나 같으며, 분과 초는 0보다 크거나 같고, 59보다 작거나 같다.

정인이가 기다려야 하는 시간을 출력한다.

[입력]
20:00:00
04:00:00

12:34:56
14:36:22

[출력]
08:00:00

02:01:26

*/

import java.io.*;

public class Warn {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] currentTime = br.readLine().split(":");  
		String[] targetTime = br.readLine().split(":");
		
		int currentSec = Integer.parseInt(currentTime[0]) * 3600 + Integer.parseInt(currentTime[1]) * 60 + Integer.parseInt(currentTime[2]);
		int targetSec = Integer.parseInt(targetTime[0]) * 3600 + Integer.parseInt(targetTime[1]) * 60 + Integer.parseInt(targetTime[2]);
		int waitSec = 0;
		
		if (targetSec > currentSec) {
			waitSec = targetSec - currentSec;
		} else {
			waitSec = (targetSec + 86400) - currentSec;
		}
		
		int hour = waitSec / 3600;
		int min = (waitSec % 3600) / 60;
		int sec = waitSec % 60;
		
		System.out.printf("%02d:%02d:%02d", hour, min, sec);
		br.close();
	}

}
