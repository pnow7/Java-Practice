package practice.sec03;

public class practice65_69 {

	public static void main(String[] args) {
		//65
		int Sum;
		Sum = 3*6;
		Sum = 5 + Sum;
		System.out.println(Sum); //5와 3*6=18값을 더하여 23을 출력
		
		//66
		int a = (5+3)*6;
		System.out.println(a); //괄호안 먼저 계산 8과 6을 곱하여 48출력
		
		//67
		int b = 5%6+(3+3*2);
		System.out.println(b); //괄호안 먼저 곱셈나눗셈부터 계산 3*2=6 -> 3+6 = 9 -> 5%6에서 나머지를 반환하므로 5 -> 5와 9를 더하여 14를 출력
		
		//68
		int c = 2%6+3+(2+5)+3/2;
		System.out.println(c); //괄호안 값은 7 -> 2%6은 2 -> 2와 3을 더하고 7을 더해 12 -> 3/2는 1.5지만 int형이기때문 1로 반환 -> 12에서 1을 더해 13을 출력

	}

}
