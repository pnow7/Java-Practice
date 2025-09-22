package test.test04.test0427;
/*
칸토어 집합은 0과 1사이의 실수로 이루어진 집합으로, 
구간 [0, 1]에서 시작해서 각 구간을 3등분하여 가운데 구간을 반복적으로 제외하는 방식으로 만든다.

전체 집합이 유한이라고 가정하고, 다음과 같은 과정을 통해서 칸토어 집합의 근사를 만들어보자.
1. '-'가 3^N개 있는 문자열에서 시작한다.
2. 문자열을 3등분 한 뒤, 가운데 문자열을 공백으로 바꾼다. 이렇게 하면, 선(문자열) 2개가 남는다.
3. 이제 각 선(문자열)을 3등분 하고, 가운데 문자열을 공백으로 바꾼다. 이 과정은 모든 선의 길이가 1일때 까지 계속 한다.

예를 들어, N=3인 경우, 길이가 27인 문자열로 시작한다.
---------------------------

여기서 가운데 문자열을 공백으로 바꾼다.
---------         ---------

남은 두 선의 가운데 문자열을 공백으로 바꾼다.
---   ---         ---   ---

한번 더
- -   - -         - -   - -

*/
import java.io.*;
public class FMain4779_1 {
	
	static int N;
	static StringBuilder sb;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str;
		while((str = br.readLine()) != null) {
			N = Integer.parseInt(str);
			sb = new StringBuilder();
			int length = (int)Math.pow(3, N);
			
			for(int i = 0; i < length; i++) {
				sb.append("-");
			}
			
			func(0, length);
			System.out.println(sb);
		}
	
	}
	static void func(int start, int size) {
		if(size == 1) return; 
		
		int third = size/3;
		//start+newSize : 중간 등분 시작
		//start+2*newSize : 마지막 등분 시작
		for(int i = start+third; i < start+2*third; i++) {
			//setCharAt(int index, String s): index 위치의 문자를 s로 변경(' '로)
			//공백처리
			sb.setCharAt(i, ' '); 
		}
		
		//왼쪽 (0부터 시작해서 사이즈 9까지니까 0부터 9까지)
		func(start, third);
		
		//오른쪽(18부터 시작해서 사이즈 9까지니까 18부터 27까지)
		func(start+2*third, third);
	}

}
