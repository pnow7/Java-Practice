package practice.sec10;

class Box {
	
	int width; 
	int length; 
	int height;

	double cal(int width, int length, int height) {
	
		return width*length*height;
	}
}

public class BoxExample{
	public static void main(String[] args) {
		Box box1 = new Box();
		
		box1.width = 20;
		box1.length = 20;
		box1.height = 30;
		System.out.println("상자의 가로, 세로, 높이는 "+box1.width+","+box1.length+","+box1.height+"입니다");
		System.out.println("상자의 부피는 "+box1.cal(box1.width, box1.length, box1.height));
	}
}	

