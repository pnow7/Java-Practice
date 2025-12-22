package study.data_structure.set_map;

/*
- 파일 정리

"바탕화면의 파일들에는 값진 보물에 대한 정보가 들어 있어. 
하나라도 지우게 된다면 보물은 물론이고 다시는 노트북을 쓸 수 없게 될 거야. 
파일들을 잘 분석해서 보물의 주인공이 될 수 있길 바랄게. 힌트는 “확장자”야."

파일을 확장자 별로 정리해서 몇 개씩 있는지 알려줘
보기 편하게 확장자들을 사전 순으로 정렬해 줘

첫째 줄에 바탕화면에 있는 파일의 개수 
N이 주어진다. (1 <= N <= 50000)

둘째 줄부터 N개 줄에 바탕화면에 있는 파일의 이름이 주어진다. 
파일의 이름은 알파벳 소문자와 점(.)으로만 구성되어 있다. 
점은 정확히 한 번 등장하며, 파일 이름의 첫 글자 또는 마지막 글자로 오지 않는다.

확장자가 여러 개 있는 경우 확장자 이름의 사전순으로 출력한다.

[입력]
8
sbrus.txt
spc.spc
acm.icpc
korea.icpc
sample.txt
hello.world
sogang.spc
example.txt

[출력]
icpc 2
spc 2
txt 3
world 1

*/

import java.io.*;
import java.util.*;

public class MapOrganizeFiles {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<String, Integer> map = new HashMap<>();
		int N = Integer.parseInt(br.readLine());
		
		while (N-- >0) {
			String[] fileName = br.readLine().split("\\.");
			int fileType = fileName.length - 1;
			
			map.put(fileName[fileType], map.getOrDefault(fileName[fileType], 0) + 1);
		}
		
		List<String> list = new ArrayList<>(map.keySet());
		
		Collections.sort(list, (o1, o2) -> {
			return o1.compareTo(o2); 
		});
		
		for (String key : list) {
			Integer value = map.get(key);
			
			System.out.println(key + " " + value);
		}
		br.close();
	}

}

/*

- Java 8 Stream API
map.forEach((key, value) -> {
	System.out.println("Key: " + key + ", Value: " + value);
});

- 향상된 for 루프
for (Map.Entry<String, Integer> entry : map.entrySet()) {
    String key = entry.getKey();       	// Key (String) 값 가져오기
    Integer value = entry.getValue(); 	// Value (Integer) 값 가져오기
    
    System.out.println("Key: " + key + ", Value: " + value);
}

*/
