package practice.sec01;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "hello";
		String str2 = "World";
		System.out.println(str1); //hello
		System.out.println(str1+"world"); //helloWorld
		System.out.println(str1+str2); //helloWorld
		
		str1 = "new Word";
		
		String str3 = str1 + str2; 
		System.out.println(str3); //new WordWorld

	}

}
