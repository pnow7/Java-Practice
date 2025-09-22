package test.test03.test0329;
/*
-창문 닫기
현재 N개의 창문이 있고 또 N명의 사람이 있다.

1번째 사람은 1의 배수 번째 창문을 열려 있으면 닫고 닫혀 있으면 연다.  
2번째 사람은 2의 배수 번째 창문을 열려 있으면 닫고 닫혀 있으면 연다. 

이러한 행동을 N번째 사람까지 진행한 후 열려 있는 창문의 개수를 구하라. 
단, 처음에 모든 창문은 닫혀 있다.
*/


/*
이 문제는 소수를 찾는 문제가 아니라 창문이 몇 개 열려 있는지를 찾는 문제입니다.

창문을 열고 닫는 규칙을 보면 어떤 창문은 홀수 번만 열리고 닫힙니다.
👉 약수의 개수가 홀수인 창문만 마지막에 열려 있음

🔍 약수의 개수가 홀수인 숫자는?
모든 수는 약수의 개수가 짝수입니다.
**예외적으로 약수 개수가 홀수인 경우는 "완전제곱수"**입니다.

예를 들어 16을 생각해 보면:
1 × 16
2 × 8
4 × 4  <- 중복
************1하고 16, 2하고 8만 하면 약수개수는 짝수개다 근데 완전제곱수같은경우 같은수 4*4가 있으니까 홀수개가 됨************


일반적인 수는 약수들이 쌍을 이루지만,

**완전제곱수(1, 4, 9, 16, 25, ...)**는 한 개의 약수가 중복됨

따라서 약수 개수가 홀수가 되어 마지막에 문이 열려 있음!
*/
import java.io.*;

public class FMain13909 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		bw.write((int)(Math.sqrt(N))+"");
		
		br.close();
		bw.flush();
		bw.close();
	}

}
