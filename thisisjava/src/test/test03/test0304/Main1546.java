package test.test03.test0304;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
public class Main1546 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		
		double[] score = new double[N];
		double sum = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine()); //입력한줄(공백포함)
		
		for(int i = 0; i<N; i++) {
			score[i] = Double.parseDouble(st.nextToken());
		}	
		double max = score[0];
		for(int j = 0; j < N; j++) {
			if(score[j] > max) {
				max = score[j];
			}
		}
		for(int k = 0; k < N; k++) {
			sum = sum + (score[k]/max)*100;
		}
		bw.write(sum/N +"");

		br.close();
		bw.flush();
		bw.close();
		
	}

}
