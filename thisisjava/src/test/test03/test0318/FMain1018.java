package test.test03.test0318;

/* 8 x 8 체스판

입력
8 8
WBWBWBWB
BWBWBWBW
WBWBWBWB
BWBBBWBW 
WBWBWBWB
BWBWBWBW
WBWBWBWB
BWBWBWBW

출력
1

입력
10 13
BBBBBBBBWBWBW 
BBBBBBBBBWBWB 
BBBBBBBBWBWBW
BBBBBBBBBWBWB
BBBBBBBBWBWBW
BBBBBBBBBWBWB
BBBBBBBBWBWBW
BBBBBBBBBWBWB
WWWWWWWWWWBWB
WWWWWWWWWWBWB

12
*/


import java.io.*;
import java.util.*;
public class FMain1018 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine());
	        
	    int N = Integer.parseInt(st.nextToken());
	    int M = Integer.parseInt(st.nextToken());
	        
	    String[][] chess = new String[N][M];
	    int result = Integer.MAX_VALUE;
	        
	    for(int i = 0; i < N; i++) {
	    	String str = br.readLine();
	        for(int j = 0; j < M; j++) {
	        	chess[i][j] = String.valueOf(str.charAt(j));
	        }
	    }

        for(int i = 0; i <= N - 8; i++) {
            for(int j = 0; j <= M - 8; j++) {
                int wStart = 0;
                int bStart = 0;
                
                for(int x = i; x < i + 8; x++) {
                    for(int y = j; y < j + 8; y++) {
                        if((x + y) % 2 == 0) {
                            if(!chess[x][y].equals("W")) wStart++;
                            if(!chess[x][y].equals("B")) bStart++;
                        } else {
                            if(!chess[x][y].equals("B")) wStart++;
                            if(!chess[x][y].equals("W")) bStart++;
                        }
                    }
                }
                result = Math.min(result, Math.min(wStart, bStart));
            }
        }
        br.close();
        System.out.println(result);
    
	}
	
}
