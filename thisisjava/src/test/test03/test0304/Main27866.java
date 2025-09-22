package test.test03.test0304;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
public class Main27866 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String st = br.readLine();
		int N = Integer.parseInt(br.readLine());
		
		bw.write(st.charAt(N-1));
		br.close();
		bw.flush();
		bw.close();
	}

}
