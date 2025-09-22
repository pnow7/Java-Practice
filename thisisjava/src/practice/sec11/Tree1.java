package practice.sec11;
public class Tree1 {
    static String name;
    static int hour;
    static int star;
    static int current;
    static int price;

    
    static void tree1(){
    	name = "Mango";
    	hour = 4;
    	star = 4;
    	current = 7;
    	price = 200;
    }
    
    static void tree2(){
    	name = "Papaya";
    	hour = 6;
    	star = 6;
    	current = 6;
    	price = 375;
    }
    
    static void tree3(){
    	name = "Banana Palm";
    	hour = 5;
    	star = 5;
    	current = 7;
    	price = 500;
    }
    
    static void tree4(){
    	name = "Lemon";
    	hour = 8;
    	star = 8;
    	current = 1;
    	price = 750;
    }
      
    static void info() {
    	System.out.println("Tree : " + name);
    	System.out.println("Grow Time : " + hour + "hours");
    	System.out.println("Star : " + star );
    	System.out.println("Current : " + current);
    	System.out.println("Price : " + price + "$");
    	System.out.println();
    }
    
    public static void main(String[] args) {
    	tree1();
    	info();
    	
    	tree2();
    	info();
    	
    	tree3();
    	info();
    	
    	tree4();
    	info();
    }
}

 