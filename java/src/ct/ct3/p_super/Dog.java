package ct.ct3.p_super;

public class Dog extends Animal {
    
    private String bread;

    public Dog(String name, String bread) {
        // 첫 줄에서 반드시 super() 호출
        // 부모 클래스의 public Animal(String name) { ~~ } 호출
        super(name);
        
        // 부모 생성자 호출이 끝난 후, 자식 클래스 고유의 필드 초기화
        this.bread = bread;
        System.out.println(name + " (자식/Dog) 객체 생성 완료. 품종: " + bread);
    }

    public String getBread() {
        return bread;
    }

}