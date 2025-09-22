package test.test03.test0324;
//상근이 카드 몇개가지고있는지
/*
10
6 3 2 10 10 10 -10 -10 7 3
8
10 9 -5 2 3 4 5 -10
*/
//중복검사가안됨
import java.io.*;
import java.util.*;
public class Main10816 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//map에서 중복제거해서 하나밖에 안나온다
		Map<Integer, Integer> map = new HashMap<>();
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());	
		for(int i = 0; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());
			map.put(num, i);
		}
		
		int M = Integer.parseInt(br.readLine());
		int[] result = new int[M];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < M; i++) {
			int num1 = Integer.parseInt(st.nextToken());
			if(map.containsKey(num1)) {
				result[i]++;
			}
		}
		
		for(int i = 0; i < M; i++) {
			bw.write(result[i]+" ");
		}
		br.close();
		bw.flush();
		bw.close();
	}

}
