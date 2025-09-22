package practice.sec11;

public class TreeExample {
    public static void main(String[] args) {
        // 트리 객체 생성
        Tree tree1 = new Tree("Mango", 4, 4, 3, 200);
        Tree tree2 = new Tree("Papaya", 6, 6, 2, 375);
        Tree tree3 = new Tree("Banana Palm", 5, 5, 2, 500);
        Tree tree4 = new Tree("Lemon", 8, 3, 8, 750);
        
        // 트리 객체 정보 출력
        tree1.info();  // Oak 트리 정보 출력
        System.out.println("");
        tree2.info();  // Pine 트리 정보 출력
        System.out.println("");
        
        //tree3의 current값은 2인데 5로 바꾸기 가능
        tree3.setCurrent(5);
        
        tree3.info();
        System.out.println("");
        tree4.info();
    }
}
