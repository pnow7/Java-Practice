package practice.sec10;

public class TelevisionExample {

	public static void main(String[] args) {
		Television Lgtv = new Television();
		int tv = 7;
		Lgtv.channel = tv;

		int tv1 = 9;
		Lgtv.volume = tv1;

		boolean tv2 = Lgtv.powerOnOff;
		System.out.println("LG TV채널: " + tv + " | " + "LG TV볼륨: " + tv1 + " | " + " 상태: " + tv2);

		
		Tv Samtv = new Tv();
	 
		int tv3 = Samtv.channel(9); 
		int tv4 = Samtv.volume(10); 
		boolean tv5 =Samtv.powerOn(); 
		System.out.println("Samsung TV채널: "+tv3 + " | "+"Samsung TV볼륨: "+tv4 + " | " + " 상태: "+tv5);
		 

	}

}
