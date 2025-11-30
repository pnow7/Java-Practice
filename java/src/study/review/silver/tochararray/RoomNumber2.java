package study.review.silver.tochararray;

/*
- 방 번호

다솜이는 은진이의 옆집에 새로 이사옴
다솜이는 자기 방 번호를 예쁜 플라스틱 숫자로 문에 붙이려고함.
다솜이의 옆집에서는 플라스틱 숫자를 한 세트로 판다.
한 세트에는 0번부터 9번까지 들어있음.

다솜이의 방 번호가 주어졌을 때, 필요한 세트의 개수의 최솟값을 출력

[입력]
9999

122

[2]
2

2

*/

import java.io.*;
import java.util.*;

public class RoomNumber2 {

	private static int[] count = new int[10];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String num = br.readLine();
		
		for (char c : num.toCharArray()) {
			int digit = c - '0';
			
			if (digit == 6 || digit == 9) {
				count[6]++;
			} else {
				count[digit]++;
			}
		}
		
		int max = 0;
		for (int i = 0; i < 10; i++) {
			if (i == 6 || i == 9) {
				continue;
			}
			
			max = Math.max(max, count[i]);
		}
		
		int sixNine = (count[6] + 1) / 2;
		
		System.out.println(Math.max(max, sixNine));
		br.close();
		
		
		System.out.println();
		br.close();
	}
	
}
 