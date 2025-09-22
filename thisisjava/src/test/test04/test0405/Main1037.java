package test.test04.test0405;
/*
약수(1과 자기자신 제외한 약수를 입력했을 때 자기자신 값은 무엇일까?)

[입력]
2
4 2

[출력]
8

[입력]
6
3 4 2 12 6 8

[출력]
24
*/
import java.io.*;
import java.util.*;
public class Main1037 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		List<Integer> list = new ArrayList<>();

		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < T; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		Collections.sort(list);
		
		bw.write(list.get(0)*list.get(list.size()-1)+"");
		br.close();
		bw.flush();
		bw.close();
		
	}
}
