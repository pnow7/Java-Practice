package test.test04.test0406;
/*
-붙임성 좋은 총총이
사람들이 만난 기록이 시간 순서대로 N개 주어진다. 

무지개 댄스를 추지 않고 있던 사람이 
무지개 댄스를 추고 있던 사람을 만나게 된다면, 
만난 시점 이후로 무지개 댄스를 추게 된다.

기록이 시작되기 이전 무지개 댄스를 추고 있는 사람은 총총이 뿐이라고 할 때, 
마지막 기록 이후 무지개 댄스를 추는 사람이 몇 명인지 구해보자

[입력]
12
bnb2011 chansol
chansol chogahui05
chogahui05 jthis
jthis ChongChong
jthis jyheo98
jyheo98 lms0806
lms0806 pichulia
pichulia pjshwa
pjshwa r4pidstart
r4pidstart swoon
swoon tony9402
tony9402 bnb2011

[출력]
10
*/

import java.io.*;
import java.util.*;
public class Main26069 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Set<String> set = new HashSet<>();
		
		int N = Integer.parseInt(br.readLine());
		
		set.add("ChongChong");
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String name1 = st.nextToken();
			String name2 = st.nextToken();
			if(name1.equals("ChongChong") || name2.equals("ChongChong")) {
				set.add(name1);
				set.add(name2);
			}
			else {
				if(set.contains(name1) || set.contains(name2)) {
					set.add(name1);
					set.add(name2);
				}
			}
		}
		bw.write(set.size()+"");
		br.close();
		bw.flush();
		bw.close();

	}

}

//for(int i=0;i<N;i++){
//    String[] pair=br.readLine().split(" ");
//    if(hs.contains(pair[0]) || hs.contains(pair[1])){
//        hs.add(pair[0]);
//        hs.add(pair[1]);
//    }
//}
