package object_oriented_practice.ch06_star.test;

public class MemberService {
	//15

	boolean logIn(String id, String pwd) {
		if(id.equals("홍길동") && pwd.equals("1234")) {
			return true;
		} else {
			return false;
		}
	}
	
	void logOut(String id) {
		System.out.println(id + "님이 로그아웃 되었습니다");
	}
	
	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		boolean result = memberService.logIn("홍길동", "12341");
		
		if(result) {
			System.out.println("로그인 되었습니다.");
			memberService.logOut("홍길동");
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
		
	}
}	
