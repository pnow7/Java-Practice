package test.test03.test0321;
//3
//21 Junkyu
//21 Dohyun
//20 Sunyoung
//나이순 정렬
import java.io.*;
import java.util.*;
public class Main10814 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		String[][] name = new String[N][2];
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			name[i][0] = st.nextToken(); //나이
			name[i][1] = st.nextToken(); //이름
		}
		
		Arrays.sort(name, (e1, e2) -> {
				return Integer.parseInt(e1[0]) - Integer.parseInt(e2[0]);
		});
		
		
		for(int i = 0; i < N; i++) {
			bw.write(name[i][0] + " " + name[i][1] + "\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}


