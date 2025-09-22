package practice.sec07;

public class Practice5 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 1000; i++) {
			String num = String.valueOf(i); //int i를 string으로 변환
			int count = 0; //짝 카운트
			boolean bs = (i%10 == 0); //10의 배수 확인
			
			for(int j = 0; j < num.length(); j++) {
				char ch = num.charAt(j);
				if(ch == '3' || ch == '6' || ch == '9') {
					count++;
				}
			}
			
			if(count > 0 || bs) { //3이 하나 이상 들어가있고 10의 배수이면, 3의 배수가 없을 수도 있음
				String result = ""; //초기화
				for(int k = 0; k < count; k++) { //0부터 카운트까지 짝 더하기
					result += "짝";
				}
				if(bs) { // 10의 배수
					result += "뽀숑";
				}
				System.out.print(result);
			}
			else {
				System.out.print(i);
			}
			
		}
		
	}

}
