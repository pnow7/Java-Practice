package test.test03.test0320;
//좌표정렬

import java.io.*;
import java.util.*;

public class FMain11650 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		int[][] xy = new int[N][2];

		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			xy[i][0] = Integer.parseInt(st.nextToken());
			xy[i][1] = Integer.parseInt(st.nextToken());			
		}
		
		//x좌표 같으면 y좌표 오름차순
		//x좌표 같지않으면 x좌표 오름차순
		Arrays.sort(xy, (e1, e2) -> {
			if(e1[0] == e2[0]) {
				return e1[1] - e2[1];
			}
			else {
				return e1[0] - e2[0];
			}
		});
		
		for(int i = 0; i < N; i++) {
			bw.write(xy[i][0] + " " + xy[i][1]+"\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}

}
//Arrays.sort(arr, new Comparator<int[]>() {		
//	public int compare(int[] e1, int[] e2) {
//		if(e1[0] == e2[0]) {		// 첫번째 원소가 같다면 두 번째 원소끼리 비교
//			return e1[1] - e2[1];
//		}
//		else {
//			return e1[0] - e2[0];
//		}
//	}
//});
