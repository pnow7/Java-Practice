package test.test03.test0324;
/*
10
6 3 2 10 10 10 -10 -10 7 3
8
10 9 -5 2 3 4 5 -10
*/

import java.io.*;
import java.util.*;
public class FMain10816_1 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		Map<Integer, Integer> map = new HashMap<>();
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());
			//getOrDefault(key, DefaultValue)
			//DefaultValue : 지정된 키로 매핑된 값이 없는 경우 반환되어야 하는 기본값
			
			/*
			 * alphabet 배열에 원소에 갯수를 카운트 하기 위해서 +1을 해줍니다. 
			 * 예를 들어 첫번째 A 가 입력되었을 경우에는
			 * hm.put("A", 0+1) 
			 * 두번째 A 가 입력되었을 경우에는 
			 * hm.put("A", 1+1) 
			 * 세번째 A 가 입력되었을 경우에는
			 * hm.put("A", 2+1) 가 됩니다. 
			 * 즉 A는 배열에 3개가 존재 합니다.
			 */
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < M; i++) {
			int num = Integer.parseInt(st.nextToken());
			
			sb.append(map.getOrDefault(num,0)).append(' ');
		}
		
		bw.write(sb+"");
		
		br.close();
		bw.flush();
		bw.close();
	}

}



