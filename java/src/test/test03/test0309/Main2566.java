package test.test03.test0309;

import java.io.*;
import java.util.*;
public class Main2566 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int[][] board = new int[9][9];
		int max = 0;
		int i1 = 0; 
		int j1 = 0;
		
		for(int i = 0; i < 9; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 9; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
				if(board[i][j] >= max) {
					max = board[i][j];
					i1 = i+1;
					j1 = j+1;
				}
			}
		}
		br.close();
		System.out.println(max);
		System.out.print(i1+" "+j1);
		
	}

}
