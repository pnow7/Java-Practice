package study.review.bronze.string;

/*
- 이 구역의 승자는 누구야?

알파벳 대문자로만 이루어진 문자열이 주어진다. 
문자열이 주어지면 각 문자의 획수로 문자를 변환한다. 
획수들을 갖고 앞에서부터 두 개씩 더해가는데 만약 짝이 지어지지 않는다면 
그대로 다음 단계로 내려간다. 

다음 단계부터는 이전 단계에서 
두 개씩 더해가며 생성된 숫자들을 가지고 같은 과정을 반복한다. 
과정을 반복하다가 결국 마지막 한 개의 수가 남았을 때 
그 수가 홀수라면 이기는 것이고 짝수라면 지는 게임이다

예를 들어 "ABCDE"라는 문자열이 주어지면 
‘A’, ‘B’, ‘C’, ‘D’, ‘E’ 각 문자의 획수인 
3, 2, 1, 2, 3으로 바꾸어 아래의 그림처럼 과정을 진행한다. 

단, 계산할 때, 더한 값이 10을 넘는다면 
10으로 나눈 나머지로 바꿔준다.

‘E’의 경우는 짝을 지을 수 없으므로 3이 바로 내려오게 된다. 
결국, 마지막 남은 수가 1인 홀수이므로 이 게임은 이기게 되는 것이다.

A	B	C	D	E	F	G	H	I	J	K	L	M	N	O	P	Q	R	S	T	U	V	W	X	Y	Z
3	2	1	2	3	3	3	3	1	1   3	1	3	3	1   2	2	2	1	2   1	1	2	2	2	1

[입력]
ABCDE

AECF

[출력]
I'm a winner!

You're the winner?

*/

import java.io.*;

public class SumOfChar {

	private static int[] alphabetValues = {
			3, 2, 1, 2, 	3, 3, 3, 3, 	1, 1,
			3, 1, 3, 3, 	1, 2, 2, 2, 	1, 2,
			1, 1, 2, 2, 2, 1
	};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String word = br.readLine();
		int n = word.length();
		int totalSum = 0;
		
		for (int i = 0; i < n; i++) {
			int index = word.charAt(i) - 'A';
			totalSum += alphabetValues[index];
		}
		
		System.out.println(totalSum % 2 != 0 ? "I'm a winner!" : "You're the winner?");
		br.close();
	}

}
