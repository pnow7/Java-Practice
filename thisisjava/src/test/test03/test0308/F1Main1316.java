package test.test03.test0308;

import java.io.*;
public class F1Main1316 {

	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int repeatCount = Integer.parseInt(br.readLine()); // 단어 개수 입력
        int count = 0; // 그룹 단어 개수
        
        for (int i = 0; i < repeatCount; i++) {
            String input = br.readLine();
            int[] visit = new int[26]; // 알파벳 방문 여부 초기화
            boolean group = true; // 그룹 단어 여부
            
            for (int j = 0; j < input.length(); j++) {
                char ch = input.charAt(j);
                int idx = ch - 'a'; // 알파벳 인덱스 계산
                
                // 이전 문자와 다르고, 이미 방문한 문자라면 그룹 단어 아님
                if (j > 0 && (input.charAt(j - 1) != ch) && (visit[idx] == 1)) {
                	//ex) new 이면
                	//j가 1일때
                	//intpust.charAt(j-1)은 n
                	//ch은 e
                	//idx은 e - 'a' = 4
                	//visit[4]는 = 0이다 
                	//e는 방문하지 않았으니까 visit[0]은 4
                    group = false;
                    break;
                }
                else {
                visit[idx] = 1; // 현재 문자 방문 처리
                }
            }
            
            if (group) {
                count++; // 그룹 단어인 경우 카운트 증가
            }
        }
        
        System.out.println(count); // 결과 출력

	}

}
