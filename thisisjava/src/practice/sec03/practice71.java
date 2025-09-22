package practice.sec03;

public class practice71 {
	public static void main(String[] args) {
		//잘못된 부분 수정하기
		boolean b = true;
		int i = 1;
		short s = 2;
		char c = 'a';
		float f = 1.234f;
		
		int s2 = c + s;
		int s3 = s + s;
		int c2 = c + s;
		int i2 = c + s;
		
		int i3 = ("true".indexOf(""+b) + i); //bool값을 int형으로 변환하여 인트형끼리 더하기 - 잘몰라서 찾아봤습니다 
		
		
	}

}
