package F;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.HashSet; //
//HashSet 함수
//중복되는 원소를 넣을 경우 하나만 저장(중복원소 허용 x)
//HashSet은 순서 개념이 없다
public class F_Main3052 { 

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		HashSet<Integer> hash = new HashSet<Integer>();
		
		for(int i = 0; i < 10; i++) {
			hash.add(Integer.parseInt(br.readLine())%42); //hash.add()
		}
		bw.write(hash.size()+""); //hash.size()
		br.close();
		bw.flush();
		bw.close();

	}

}
