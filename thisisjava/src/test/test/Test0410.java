package test.test;

/*
기기아이디, 지점명, 총합포인트, 성공횟수, 실패횟수, 잔여 시도 회수, 매출액

1. 게임기기는 생성시에 아이디와 지점명을 가지고 생성
2. 생성시 필요데이터(아이디와 지점명)를 제외하고는 0으로 초기화
3. 룰렛은 6칸이 있으며, 4칸은 1~4점 나머지는 실패(1회 시행마다 Random으로 수행됨) 룰렛의 범위 : 1~6, 성공&점수 : 1~4, 실패 : 5~6
4. 금액을 충전하면 충전 금액만큼 매출액이 증가하고
금액에 맞게 잔여 시도회수가 충전됨(시도횟수 충전할수 있다)
ex)1000원에 2회, 5000원 10회(매출액 : 1000+5000 = 6000)
5. 한게임이 끝나면 매출액을 제외한 데이터 초기화 필요
6. 충전 후 게임을 시작하면 잔여회수가 0이 될때까지 반복수행하며 1회마다
결과 값을 표시한다. 잔여횟수가 0이되면 성공, 실패 횟수와 함께 총합점수를 보여준다
7.최종마감을 하게되면 그날의 매출액을 보여줍니다
8 1.충전, 2.게임시작, 3.마감에 해당하는 것은 사용자가 선택
9. 제한사항 충전시 금액을 넣는 것으로 횟수(X) 충전시 얼마를 넣을 것인지 금액을 받음(1000원 단위로만 입력가능, 500원 단위 X)
충전된 횟수가 없으면 게임시작 불가
충전된 횟수가 있으면 마감 불가
충전된 횟수가 있으면 추가 충전 불가
 */

import java.io.*;
import java.util.*;

public class Test0410 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> list = new ArrayList<>();
		
		String gameId = "randomgame"; //기기아이디
		String storeName = "human"; //지점명
		
		int totalPoint = 0; //총합포인트
		int success = 0; //성공횟수
		int fail = 0; //실패횟수
		int remainTry = 0;//잔여시도횟수
		int total = 0; //매출액
		int result = 0;
		
		for(int i = 1; i <= 6; i++) {
			list.add(i);
		}
		
		boolean isCharged = true;
		
		while(true) {
			//잔여시도횟수
			System.out.println("1.충전 | 2.게임시작 | 3.마감");
			int inputNum = Integer.parseInt(br.readLine());

			//충전
			if(inputNum == 1) {
				//충전횟수 저장
				//충전된 횟수가 있으면 추가 충전 불가
				if(!isCharged) {
					System.out.println("충전된 횟수가 있으므로 추가 충전 불가");
				}
				else {
					System.out.println("충전할 금액을 입력하세요");
					int sum = Integer.parseInt(br.readLine());
					remainTry = 0;
					if(sum%1000 == 0) {
						//매출액과 시도횟수 충전
						total = 0;
						total += sum;
						result += total;
						remainTry += sum/500;
						System.out.println("현재금액 : " + total + " 시도횟수 : " + remainTry);
					}
					else {
						System.out.println("1000원 단위로 입력하세요");
					}
					isCharged = false;
				}
			}
			//게임시작
			if(inputNum == 2) {
				success = 0;
				fail = 0;
				totalPoint = 0;

				//충전된 횟수가 없으면 게임시작불가
				if(remainTry == 0) {
					System.out.println("게임시작불가 충전하세요");
				}
				else {
					//잔여횟수가 0이되면 종료
					while(remainTry-- > 0) {
						int score = (int)(Math.random()*6+1);
						
						if(list.contains(score)) {
							if(score >=1 && score <=4) {
								System.out.println("룰렛성공! 점수 : " + score);
								totalPoint += score;
								success++;
							}
							else {
								System.out.println("룰렛실패! ");
								totalPoint += 0;
								fail++;
							}
						}
					}
					
					System.out.println("성공 횟수 : " + success + " 실패 횟수 : " + fail + " 총합점수 : " +totalPoint + " 충전횟수 : " + (remainTry+1));
				}
				isCharged = true;
				
			}
			
			//마감
			if(inputNum == 3) {
				//충전된 횟수가 있으면 마감불가
				if(remainTry > 0) {
					System.out.println("충전된 횟수가 있음. 충전횟수 : " + remainTry + " 마감불가");
				}
				else {
					if(total == 0) {
						System.out.println("마감 금액 없음. 게임시작 하세요");
					}
					else {
						System.out.println("마감금액 : " + result);	
						break;
					}
					
				}
				isCharged = true;
			}
			
			if(inputNum == 0 || inputNum >= 4) {
				System.out.println("1번, 2번, 3번 중 하나를 골라주세요");
				isCharged = true;
			}
		}
		
	}
	
}
