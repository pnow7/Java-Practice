package practice.sec11;

public class Tree2 {
    // 인스턴스 변수
	String name;
    int hour;
    int star;
    int current;
    int price;

    // 생성자
    Tree2(String name, int hour, int star, int current, int price) {
        this.name = name;
        this.hour = hour;
        this.star = star;
        this.current = current;
        this.price = price;
    }

    // 정보 출력 메서드
    void info() {
        System.out.println("Tree : " + name);
        System.out.println("Grow Time : " + hour + "hours");
        System.out.println("Star : " + star);
        System.out.println("Current : " + current);
        System.out.println("Price : " + price + "$");
        System.out.println();
    }
}
