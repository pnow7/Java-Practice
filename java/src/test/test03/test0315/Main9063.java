package test.test03.test0315;

//땅 넓이 구하기
import java.io.*;
import java.util.*;
public class Main9063 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int[] x = new int[N];
		int[] y = new int[N];
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			x[i] = Integer.parseInt(st.nextToken());
			y[i] = Integer.parseInt(st.nextToken());
		}
		
		int maxX = x[0];
		int maxY = y[0];
		int minX = x[0];
		int minY = y[0];

		
		for(int i = 0; i < N; i++) {
			if(x[i] > maxX) {
				maxX = x[i];
			}
			if(y[i] > maxY) {
				maxY = y[i];
			}
		}
		
		for(int i = 0; i < N; i++) {
			if(x[i] < minX) {
				minX = x[i];
			}
			if(y[i] < minY) {
				minY = y[i];
			}
		}
		
		System.out.println((maxX-minX)*(maxY-minY));
		br.close();
		
	}

}
