package F;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class FMain1316 {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException{
		
		int sum = 0;
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			if(check() == true) {
				sum++;
			}
		}
		System.out.println(sum);
	}
	
	public static boolean check() throws IOException{
			
		boolean[] check = new boolean[26];
		int prev = 0; //prev 변수 : 앞선 문자와 연속되는지 아닌지 판별하기 위함
		String s = br.readLine();
		
		for(int i = 0; i < s.length(); i++) {
			int now = s.charAt(i); //i번째 문자를 now에 저장 a이면 97 now에 97저장
		
			if(prev != now) { //앞의 문자가 입력받은 i번째 문자와 같지 않으면
				
				if(check[now-'a'] == false) { // ex) check[0] == false 
					//해당문자가 처음 나오는 경우(false인 경우)
					check[now-'a'] = true; // ex) check[0] = true;
					prev = now; //다음턴을 위해 prev에 now 저장 
				}
				else { //해당 문자가 이미 나온 적이 있는 경우
					return false; //함수 종료
				}
			}
			else { //앞의 문자가 입력받은 i번째 문자와 같으면 함수 종료
				continue;
			}
			
		} //for문 끝
		
		return true;
	}
	
}


