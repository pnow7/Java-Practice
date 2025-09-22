package study.setmaphash;

import java.util.*;
import java.util.Map.Entry;

public class KeySetentrySetIterator {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("유영근", 85);
		map.put("윤서하", 90);
		map.put("오동욱", 80);
		map.put("김영신", 95);
		System.out.println("총 Entry 수 : " + map.size());
		System.out.println();
		
		String key = "김영신";
		int value = map.get(key);
		//김영신의 key값 95
		System.out.println(key + " : " + value);
		System.out.println();
		
		//키 Seet 컬렉션을 얻고, 반복해서 값 얻기
		Set<String> keySet = map.keySet();
		//iterator(반복자) : 반복자는 객체 지향적 프로그래밍에서 배열이나 
		//그와 유사한 자료구조의 내부요소를 순회하는 객체다
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String k = keyIterator.next();
			Integer v = map.get(k);
			System.out.println(k + " : " + v);
		}
		System.out.println();
		
		//엔트리 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Entry<String, Integer> entry = entryIterator.next();
			String k = entry.getKey();
			Integer v = entry.getValue();
			System.out.println(k + " : " + v);
		}
		System.out.println();
		
		System.out.println("총 Entry 수 : " + entrySet.size());
		System.out.println();
	}

}
