package cs;

/*

Q3. Java의 오버로딩과 오버라이딩의 차이점

*/

class Parent {

    public void showMessage() {
        System.out.println("부모");
    }

}

class Child extends Parent {

    @Override
    public void showMessage() {
        System.out.println("자식");
    }

}


public class Q3 {

    static int num;

    public int overLoading(){ return num; }
    
    public boolean overLoading(int num) { return true; }
    
    public static void main(String[] args) {
        // 오버라이딩(올라 타다) -> 클래스 2개(자식이 부모 상속)
        Parent p = new Parent();
        Parent c = new Child();
        
        p.showMessage();
        c.showMessage();

        // 오버로딩
        num = 0;
        Q3 obj = new Q3();
        System.out.println(obj.overLoading());
        System.out.println(obj.overLoading(num));

    }
}
