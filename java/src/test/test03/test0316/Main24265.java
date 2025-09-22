package test.test03.test0316;

/*
MenOfPassion(A[], n) {
    sum <- 0;
    for i <- 1 to n - 1
        for j <- i + 1 to n
            sum <- sum + A[i] × A[j]; # 코드1
    return sum;
}
 */
import java.io.*;
public class Main24265 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Long n = Long.parseLong(br.readLine());
		
		System.out.println(n*(n-1)/2);
		System.out.println(2);
		

	}

}
