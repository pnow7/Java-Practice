package test.test03.test0306;

//검정색 피스는 모두 있었으나, 흰색 피스는 개수가 올바르지 않았다.

//체스는 총 16개의 피스를 사용하며, 
//킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로 구성되어 있다.

//동혁이가 발견한 흰색 피스의 개수가 주어졌을 때, 
//몇 개를 더하거나 빼야 올바른 세트가 되는지 구하는 프로그램을 작성하시오.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Main3003 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] chess = {1, 1, 2, 2, 2, 8};
		int[] a = new int[chess.length];
		int[] result = new int[chess.length];
		for(int i = 0; i < chess.length; i++) {
			a[i] = Integer.parseInt(st.nextToken());
			result[i] = chess[i] - a[i];
		}
		for(int j = 0; j < chess.length; j++) {
			System.out.print(result[j]+" ");
		}
		

	}

}
