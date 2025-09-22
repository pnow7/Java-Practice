package practice.sec06;

public class Practice1 {

	public static void main(String[] args) {
		int[] a = {1, 2, 3};
		for(int i = 0; i < a.length; i++) {
			a[i] += 2;
			System.out.println("a["+i+"] : " + a[i]);
		}
		System.out.println("");
		
		int[] b = new int[10];
		for(int i = 0; i < b.length; i++) {
			b[i] = (i+1);
			b[i] *= 3;
			System.out.print(b[i]+" ");
		}
		System.out.println("\n"); 
		
		int[] c = new int[100]; 
		for(int i = 0; i < c.length; i++) {
			c[i] = (i+1); 
			if(i%2 == 0) {
				System.out.print(c[i]+" ");
			}
		}
		System.out.println("\n");
		
		int[] d = {12,1,5,3,6,8,5,3};
		int sum = 0;
		for(int i = 0; i < d.length; i++) {
			sum += d[i];
		}
		System.out.println("배열 d 인덱스값의 총합 : "+ sum);
		
	}

}
