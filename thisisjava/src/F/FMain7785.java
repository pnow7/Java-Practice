package F;
//출퇴근 여부 
//회사내에 사람 출력
import java.io.*;
import java.util.*;
public class FMain7785 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		Map<String, String> map = new HashMap<>();
		
		int N = Integer.parseInt(br.readLine());

		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			String log = st.nextToken();
			
			if(map.containsKey(name)) {
				map.remove(name); //같은이름 나오면 삭제
			}
			else {
				map.put(name, log);
			}
		}
		
		List<String> list = new ArrayList<>(map.keySet());
		//사전순의 역순
		Collections.sort(list, Collections.reverseOrder());
		
		for(String result : list) {
			bw.write(result+"\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
