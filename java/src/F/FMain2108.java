package F;
/*
단, N은 홀수라고 가정하자.

산술평균 : N개의 수들의 합을 N으로 나눈 값
중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
최빈값 : N개의 수들 중 가장 많이 나타나는 값
범위 : N개의 수들 중 최댓값과 최솟값의 차이
N개의 수가 주어졌을 때, 네 가지 기본 통계값을 구하는 프로그램을 작성하시오.

첫째 줄에는 산술평균을 출력한다. 소수점 이하 첫째 자리에서 반올림한 값을 출력한다.

둘째 줄에는 중앙값을 출력한다.

셋째 줄에는 최빈값을 출력한다. 여러 개 있을 때에는 최빈값 중 두 번째로 작은 값을 출력한다.

넷째 줄에는 범위를 출력한다.
 */
import java.io.*;
import java.util.*;

public class FMain2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Integer> numbers = new ArrayList<>();
        Map<Integer, Integer> freqMap = new HashMap<>();
        int sum = 0;

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            numbers.add(num);
            sum += num;

            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);

            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        // 정렬
        Collections.sort(numbers);

        // 산술 평균
        int avg = (int) Math.round((double) sum / N);

        // 중앙값
        int median = numbers.get(N / 2);

        // 최빈값 찾기
        int maxFreq = Collections.max(freqMap.values());

        List<Integer> modes = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() == maxFreq) {
                modes.add(entry.getKey());
            }
        }

        Collections.sort(modes); // 최빈값 여러 개일 때 작은 순 정렬
        int mode = (modes.size() > 1) ? modes.get(1) : modes.get(0);

        // 범위
        int range = max - min;

        // 결과 출력
        System.out.println(avg);
        System.out.println(median);
        System.out.println(mode);
        System.out.println(range);
    }
}
