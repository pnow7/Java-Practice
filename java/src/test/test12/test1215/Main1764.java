package test.test12.test1215;

/*
- 듣보잡

듣도 못한 사람과 명단, 보도 못한 사람의 명단이 주어질 때,
듣도 보도 못한 사람의 명단을 구하라

첫째 줄에 듣도 못한 사람의 수 N,
보도 못한 사람의 수 M

이어서 둘째 줄부터 N개의 줄에 걸쳐 듣도 못한 사람의 이름과,
N + 2째 줄부터 보도 못한 사람의 이름이 순서대로 주어짐.
이름은 알파벳 소문자로만 이루어짐

듣도 못한 사람의 명단과 보도 못한 사람의 명단에는 중복되는 이름이 없음

=> N줄의 이름과 M줄의 이름이 같은 사람 수와 이름 출력

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

public class Main1764 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Set<String> set = new HashSet<>();
		List<String> list = new ArrayList<>();
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		for (int i = 0; i < N; i++) {
			String name = br.readLine();
			set.add(name);
		}
		
		for (int i = 0; i < M; i++) {
			String name = br.readLine();
			
			if (set.contains(name)) {
				list.add(name);
			}
		}
		
		Collections.sort(list);
		
		System.out.println(list.size());
		for (String s : list) {
			System.out.println(s);
		}
		br.close();
	}
	
}