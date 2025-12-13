package ct.ct3.p_super;

public class Animal {

    // 상속 받는 자식이 접근 가능하도록 protected로 선언
    protected String name;

    // 부모 클래스의 생성자: name 필드 초기화
    public Animal(String name) {
        this.name = name;
        System.out.println(name = " (부모) 객체가 생성되었습니다.");
    }

    public String getName() {
        return name;
    }

}