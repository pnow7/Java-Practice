package test.test03.test0322;

//좌표압축
//입력한 좌표보다 작은 값이 몇개 있는지 확인
import java.io.*;
import java.util.*;
public class FMain18870 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int[] number = new int[N];
		int[] chk = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			//number[i] : 원본 보관
			//chk[i] : 우리가 이용 할 배열
			number[i] = chk[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(chk);
		
		//Map<Integer, Integer> map = new HashMap<>();
		
		//중복 제거하고 index 부여(좌표 압축)
		Map<Integer, Integer> map = new HashMap<>();
		int idx = 0;
		for(int i = 0; i < N; i++) {
			//중복되지 않으면 chk[i]에 idx++ 한값 부여
			//똑같은 키가 확인 되면 idx++ 부여하지 않고 바로 넘어간다
			//ex) 50, 50, 100 , 1500 이면
			//50에 idx = 1 
			//다음 50은 map.containsKey(chk[i])에 걸린다 
			//50은 idx = 1이니까 결국은 같은 거니까 if문 실행하지 않고 넘어간다
			//100 idx = 2
			//1500 idx = 3
			//key값들은 50(idx = 1), 100(idx = 2), 1500(idx = 3) 이런식으로
			if(!map.containsKey(chk[i])) {
				map.put(chk[i], idx++);
			}
		}

		for(int i = 0; i < N; i++) {
			bw.write(map.get(number[i]) + " ");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
//map.put(10, 3);  // key = 10, value = 3 저장
//map.put(4, 1);   // key = 4, value = 1 저장
//map.get(10); // 👉 3 반환


//map.put(key, value)	key에 value 저장
//map.get(key)	        key에 저장된 value 반환
//map.containsKey(key)	key가 존재하는지 확인
//map.size()	        저장된 key의 개수 반환
//map.remove(key)	    해당 key 삭제

