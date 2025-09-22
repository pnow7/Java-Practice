package test.test04.test0416;

/*
자주 나오는 단어일수록 앞에 배치한다.


해당 단어의 길이가 길수록 앞에 배치한다.
알파벳 사전 순으로 앞에 있는 단어일수록 앞에 배치한다

첫째 줄에는 영어 지문에 나오는 단어의 개수 
N과 외울 단어의 길이 기준이 되는 
M이 공백으로 구분되어 주어진다. 

둘째 줄부터 
N+1번째 줄까지 외울 단어를 입력받는다. 
이때의 입력은 알파벳 소문자로만 주어지며 단어의 길이는 10을 넘지 않는다.

단어장에 단어가 반드시 1개 이상 존재하는 입력만 주어진다.


빈도수 내림차순

길이 내림차순

사전 순 오름차순


[입력]
7 4
apple
ant
sand
apple
append
sand
sand

[출력]
sand
apple
append

[입력]
12 5
appearance
append
attendance
swim
swift
swift
swift
mouse
wallet
mouse
ice
age

[출력]
swift
mouse
appearance
attendance
append
wallet


*/

import java.io.*;
import java.util.*;

public class FMain20920 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Map<String, Integer> map = new HashMap<>();

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < N; i++) {
			String s = br.readLine();
			//단어의 길이가 M 미만인 단어는 제외
			if(s.length() < M) continue;
			map.put(s, map.getOrDefault(s, 0)+1);
		}
		
		//map의 keySet(단어목록)을 리스트로 변환
		List<String> list = new ArrayList<>(map.keySet());
		
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				//내림차순
				if(Integer.compare(map.get(s1), map.get(s2)) != 0) {
					return Integer.compare(map.get(s2), map.get(s1));
				}
				//내림차순
				if(s1.length() != s2.length()) {
					return s2.length() - s1.length();
				}
				//오름차순
				return s1.compareTo(s2);
			}
		});
		
		/*
		Collections.sort(list, (o1, o2) -> {
			//내림차순
			if(Integer.compare(map.get(o2), map.get(o1)) != 0) {
				return Integer.compare(map.get(o2), map.get(o1));
			}
			
			//내림차순
			if(Integer.compare(o2.length(), o1.length()) != 0) {
				return Integer.compare(o2.length(), o1.length());
			}
			
			//오름차순
			return o1.compareTo(o2);
		});
		*/
		for(String result : list) {
			bw.write(result+"\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
