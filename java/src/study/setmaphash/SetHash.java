package study.setmaphash;
import java.util.*;
public class SetHash {

	public static void main(String[] args) {
		Random rand = new Random();
        Set<Integer> lotto = new HashSet<>();

        while (lotto.size() < 6) {
            int num = rand.nextInt(45) + 1; // 1~45
            lotto.add(num); // 중복은 Set이 자동으로 걸러줌
        }

        // 출력
        List<Integer> result = new ArrayList<>(lotto);
        Collections.sort(result); // 보기 좋게 정렬
        System.out.println("로또 번호: " + result);
        
        
        System.out.print("로또 번호 : ");
        for(int result1 : lotto) {
        	System.out.print(result1 + " ") ;       
        }
	}

}

/* import java.util.*;
 * 
 *
 * Random rand = new Random();
 * Set<Integer> lotto = new HashSet<>();
 * List<Integer> result = new ArrayList<>(lotto);
 * lotto.add(변수)
 * 
 * Set : 중복 없는 데이터 저장 인터페이스 
 * HashSet : Set을 해시 테이블 방식으로 구현한 클래스 
 * add() :  Set에 값을 추가하는 메소드 
 * size() : 저장된 요소 개수 확인 
 * contains() : 특정 값이 있는지 확인
 */