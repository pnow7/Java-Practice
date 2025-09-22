package F;

import java.io.*;
import java.util.*;
public class FMain_18870 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());  // 입력 크기
        int[] number = new int[N];  // 원본 좌표 배열
        Set<Integer> set1 = new HashSet<>();  // 중복 제거용 Set

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            number[i] = Integer.parseInt(st.nextToken());
            set1.add(number[i]);  // 중복 제거
        }

        // Set을 이용해 중복 제거 후 오름차순 정렬
        List<Integer> sortedList = new ArrayList<>(set1);
        Collections.sort(sortedList);

        // 값 → 압축된 인덱스를 매핑할 Map 생성
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < sortedList.size(); i++) {
            map.put(sortedList.get(i), i);  // 인덱스 값으로 압축
        }

        // 원본 배열에 대해 압축된 좌표 출력
        for (int i = 0; i < N; i++) {
            bw.write(map.get(number[i]) + " ");  // 압축된 인덱스 출력
        }

        br.close();
        bw.flush();
        bw.close();

	}

}
