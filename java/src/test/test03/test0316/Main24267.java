package test.test03.test0316;
/*
MenOfPassion(A[], n) {
    sum <- 0;
    for i <- 1 to n - 2
        for j <- i + 1 to n - 1
            for k <- j + 1 to n
                sum <- sum + A[i] × A[j] × A[k]; # 코드1
    return sum;
}
 */
import java.io.*;
public class Main24267 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Long n = Long.parseLong(br.readLine());
		
//		int sum = 0;
//		int count = 0;
//		
//		for(int i = 1; i <= n-2; i++) {
//			for(int j = i+1; j <= n-1; j++) {
//				for(int k = j+1; k <= n; k++) {
//					sum = sum + i*j*k;
//					count++;
//				}
//			}
//		}
		
		System.out.println(((n)*(n-1)*(n-2))/6);
		System.out.println(3);
		br.close();
	}

}
