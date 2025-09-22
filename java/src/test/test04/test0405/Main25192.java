package test.test04.test0405;
/*
-인사성 밝은 곰곰이
새로운 분들이 입장을 할 때마다 곰곰티콘을 사용해 인사를 한다. 
곰곰티콘이 사용된 횟수를 구해 보기로 했다.

ENTER는 새로운 사람이 채팅방에 입장했음을 나타낸다. 그 외는 채팅을 입력한 유저의 닉네임을 나타낸다. 
닉네임은 숫자 또는 영문 대소문자로 구성되어 있다.

새로운 사람이 입장한 이후 처음 채팅을 입력하는 사람은 반드시 곰곰티콘으로 인사를 한다. 


Enter 들어오면 리셋

Enter 하고 같은 이름 있으면 중복제거

[입력]
7
ENTER
pjshwa
chansol
chogahui05
ENTER
pjshwa
chansol

[출력]
5
*/

import java.io.*;
import java.util.*;
public class Main25192 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Set<String> set = new HashSet<>();
		
		int N = Integer.parseInt(br.readLine());
		int count = 0;
		for(int i = 0; i < N; i++) {
			String s = br.readLine();
			if(s.equals("ENTER")) {
				count += set.size();
				set.clear();
			}
			else {
				set.add(s);
			}
		}
		count += set.size();
		bw.write(count+"");
		br.close();
		bw.flush();
		bw.close();

	}

}
