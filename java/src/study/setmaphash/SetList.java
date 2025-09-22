package study.setmaphash;

import java.util.*;
public class SetList {

	public static void main(String[] args) {
		Random rand = new Random();
		Set<Integer> numChk = new HashSet<>();
		
		while(numChk.size() < 6) {
			int lotto = rand.nextInt(45)+1;
			numChk.add(lotto);
		}
		
		for(int result1 : numChk) {
			System.out.print(result1 +" ");
		}
		System.out.println("");
		
		//리스트로 만들기
		List<Integer> result1 = new ArrayList<>(numChk);
		System.out.println(result1);
		
		//[] 지우기
		String s = result1.toString().replace("[", "").replace("]", "");
		System.out.println(s);
		
		//오름차순 정렬
		Collections.sort(result1);
		System.out.println(result1);
		
		//내림차순 정렬
		Collections.sort(result1, Collections.reverseOrder());
		System.out.println(result1);
		

	}

}
