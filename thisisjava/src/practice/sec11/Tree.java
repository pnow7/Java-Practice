package practice.sec11;
public class Tree {
	//인스턴스 변수 : 트리 객체가 고유하게 갖는 정보
    String name;
    int hour;
    int star;
    int current;

    int price;

    //생성자 : 트리객체가 생성될때  호출, 객체의 초기 값을 설정하는 역할
    Tree(String name, int hour, int star, int current, int price){
    	this.name = name;
    	this.hour = hour;
    	this.star = star;
    	this.current = current;
    	this.price = price;
    }
    
    //Tree tree5 = new Tree("name"); -> 이면  tree5.getName()가 name을 출력한다 
    String getName() {
    	return name;
    }
    
    int getHour() {
    	return hour;
    }
    
    int getStar() {
    	return star;
    }
    
    int getCurrent() {
    	return current;
    }
     
    int getPrice() {
    	return price;
    }
    
    //값 변경할때 쓰는 메소드 : Main에서 변수.setCurrent(값)을 했을때 current값이 바뀐다(안전하게) 
    void setCurrent(int current) {
    	this.current = current;
    }
    
    void info() {
    	System.out.println("Tree : " + name);
    	System.out.println("Grow Time : " + hour + "hours");
    	System.out.println("Star : " + star );
    	System.out.println("Current : " + current);
    	System.out.println("Price : " + price + "$");
    }
}

 