package practice.sec04;

public class practice2 {

	public static void main(String[] args) {
		int score = 85;
		String result = (!(score>90))? "가" : "나";
		System.out.println(result); //result는 score가 90보다 크지 않으면 "가"저장, 90보다 크면 "나"저장, result는 85는 90보다 크지 않아서 "가" 저장 후 result 출력시 "가" 출력

	}

}
