package study.algorithm.compare;

/*
- 보석 도둑

보석점에는 보석이 총 N개 있다.
각 보석의 무게 M와 가격 V를 가지고 있다. 
상덕이는 가방을 K개 가지고 있고,
각 가방에 담을 수 있는 최대 무게는 C이다.
가방에는 최대 한 개의 보석만 넣을 수 있다.

상덕이가 훔칠 수 있는 보석의 최대 가격을 구하는 프로그램을 작성하시오.

[입력]
2 1
5 10
100 100
11

[출력]
10

*/

import java.io.*;
import java.util.*;

class Jewel implements Comparable<Jewel> {
	int weight;
	int value;
	
	public Jewel(int weight, int value) {
		this.weight = weight;
		this.value = value;
	}
	
	@Override
	public int compareTo(Jewel other) {
		if (this.weight == other.weight) {
			return other.value - this.value;
		}
		
		return this.weight - other.weight;
	}
}

public class JjewelThief_compareTo {
			
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		Jewel[] jewels = new Jewel[N];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int M = Integer.parseInt(st.nextToken());
			int V = Integer.parseInt(st.nextToken());
			jewels[i] = new Jewel(M, V);
		}
		
		Arrays.sort(jewels);
		
		int[] bags = new int[K];
		for (int i = 0; i < K; i++) {
			bags[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(bags);
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		long totalValue = 0;
		int jewelIndex = 0;
		
		for (int bagCapacity : bags) {
			while (jewelIndex < N && jewels[jewelIndex].weight <= bagCapacity) {
				pq.add(jewels[jewelIndex].value);
				jewelIndex++;
			}
			
			if (!pq.isEmpty()) {
				totalValue += pq.poll();
			}
		}
		
		System.out.println(totalValue);
		br.close();
	}
	
}
