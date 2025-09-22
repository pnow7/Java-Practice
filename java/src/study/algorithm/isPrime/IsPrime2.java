package study.algorithm.isPrime;

//골드바흐의 추측
/*
[입력]
5
6
8
10
12
100

[출력]
1
1
2
1
6
 */
import java.io.*;
public class IsPrime2 {

	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        //에라토스 테네스의 체
        //순차적으로 소수의 배수 지우기
        //소수가 false
        
        //0~1000000까지 false
        //0,1 true
        //2부터 !false -> 2씩 증가하면서 2의 모든 배수 true로...
        //3부터 !false -> 3씩 증가하면서 3의 모든 배수 true로...
        boolean[] num = new boolean[1000001];
        num[0] = num[1] = true;
        //i*i
        for(int i = 2; i * i < num.length; i++) {
        	if(!num[i]) {
        		for(int j = i + i; j <= 1000000; j += i) {
        			num[j] = true;
        		}
        	}
        }
       
        int N = Integer.parseInt(br.readLine());
        
        //신기한 방식
        while(N-- > 0) {
        	int number = Integer.parseInt(br.readLine());
        	int count = 0;
        	//입력한 숫자가 5이면
        	//2부터 2까지 (중복 방지)
        	//num[2] = false, num[3] = false -> count++ 
        	
        	//number = 10이면
        	//2,3,5,7에서
        	//i = 2일때 num[2] = false, num[8] = true
        	//i = 3일때 num[3] = false, num[7] = false -> count++
        	//i = 4일때 num[4] = true -> 바로 아웃
        	//i = 5일때 num[5] = false, num[5] = false
        	for(int i = 2; i <= number/2; i++) {
        		if(!num[i] && !num[number-i]) {
        			count++;
        		}
        	}
        	bw.write(count+"\n");
        }
        
        br.close();
        bw.flush();
        bw.close();
    }

}
		

	
