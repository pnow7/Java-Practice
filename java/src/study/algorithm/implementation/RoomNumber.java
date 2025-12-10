package study.algorithm.implementation;

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

class RoomNumberCheck {
	
	private int[] count = new int[10];
	
	public RoomNumberCheck(String number) {
		for (char c : number.toCharArray()) {
			int dist = c - '0';
			
			if (dist == 6 || dist == 9) {
				count[6]++;
			} else {
				count[dist]++;
			}
		}
	}
	
	private int getRequiredSets() {
		int max = 0;
		
		for (int i = 0; i < 10; i++) {
			if (i == 6 || i == 9) {
				continue;
			}
			
			max = Math.max(max, count[i]);
		}
		
		int sixNine = (count[6] + 1) / 2;
		return Math.max(max, sixNine);
	}
	
	public void result() {
		System.out.println(getRequiredSets());
	}
	
}

public class RoomNumber {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
		
		new RoomNumberCheck(n).result();
		br.close();
	}
	
}
 