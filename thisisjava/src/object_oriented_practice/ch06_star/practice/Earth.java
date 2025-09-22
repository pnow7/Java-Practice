package object_oriented_practice.ch06_star.practice;

public class Earth {
	
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;
	
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS;
	}
	
	public static void main(String[] args) {
		System.out.println("지구의 반지름 : " + Earth.EARTH_RADIUS + "km");
		System.out.println("지구의 표면적 : " + Earth.EARTH_SURFACE_AREA + "km^2");
	}
	
}
