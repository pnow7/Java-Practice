package F;
//단어 정렬
import java.io.*;
import java.util.*;
public class FMain1181 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		String[] str = new String[N];
		
		for(int i = 0; i < N; i++) {
			str[i] = br.readLine();
		}
		

		Arrays.sort(str, (s1,s2) ->{
			if(s1.length() == s2.length()) {
				return s1.compareTo(s2); 
			}
			else {
				return s1.length()-s2.length(); //s1과 s2를 오름차순 정렬 (비교대상은 s1과 s2의 단어길이)
			}
		});

//		Arrays.sort(str, new Comparator<String>() {
//			public int compare(String s1, String s2) {
//				if(s1.length() == s2.length()) {
//					return s1.compareTo(s2); //사전순
//				}
//				else {
//					return s1.length() - s2.length(); //길이가 짧은거부터 긴쪽으로 오름차순
//				}
//			}
//		});
		bw.write(str[0]+"\n");
		
		for(int i = 1; i < N; i++) {
			//똑같은건 제거
			if(!str[i].equals(str[i-1])) {
				bw.write(str[i] + "\n");
			}
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
//13
//but
//i
//wont
//hesitate
//no
//more
//no
//more
//it
//cannot
//wait
//im
//yours


//i
//im
//it
//no
//but
//more
//wait
//wont
//yours
//cannot
//hesitate