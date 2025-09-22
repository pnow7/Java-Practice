package F;
/*
듣보잡

[입력]
3 4
ohhenrie
charlie
baesangwook
obama
baesangwook
ohhenrie
clinton

[출력]
2
baesangwook
ohhenrie
*/
import java.io.*;
import java.util.*;
public class FMain1764_1 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		Set<String> set = new HashSet<>();
		List<String> list = new ArrayList<>();
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < N; i++) {
			set.add(br.readLine());
		}
		
		for(int i = 0; i < M; i++) {
			String name = br.readLine();
			if(set.contains(name)) {
				list.add(name);
			}
		}
		
		Collections.sort(list);
		
		bw.write(list.size()+"\n");
		
		for(String s : list) {
			bw.write(s+"\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}

}
