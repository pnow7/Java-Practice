package test.test03.test0300;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main8__ {
	public static void main(String[] args) throws Exception {
		 	
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
	 
        int N = Integer.parseInt(br.readLine());
        int[] num = new int[N];
        st = new StringTokenizer(br.readLine()); //배열
	        
        int result;
        int sum = 0;
	        
        for (int i = 1; i <= N; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }
        result = Integer.parseInt(br.readLine());
        for(int j = 0; j<N; j++) {
        	if(result == num[j]) {
        		sum = sum + 1;
        	}
        }
        System.out.println(sum);
    }
}

