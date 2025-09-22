package practice.sec07;

import java.util.Scanner;
public class Practice1 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int[] result = new int[3];
      
      String a = sc.nextLine();
      int num1 = Integer.parseInt(a);
      String b = sc.nextLine();
      int num2 = Integer.parseInt(b);
      String c = sc.nextLine();
      int num3 = Integer.parseInt(c);
      
      if(num1 < num2 && num1 < num3) { //첫번재 수가 젤 작은경우 
         result[0] = num1;
         if(num2 < num3) {  
            result[1] = num2;
            result[2] = num3;
         }
         else { // 50 70 60
            result[1] = num3;
            result[2] = num2;
         }
      }
      else if(num2 < num1 && num2 < num3) { //두번재 수가 젤 작은경우
         result[0] = num2; 
         if(num1 < num3) {  
            result[1] = num1;
            result[2] = num3;
         }
         else {
            result[1] = num3;
            result[2] = num1;
         }
      }
      else if(num3 < num2 && num3 < num1){ //세번째 수가 젤 큰경우
         result[0] = num3;
         if(num1 < num2) {
            result[1] = num1;
            result[2] = num2;
         }
         else {
            result[1] = num2;
            result[2] = num1;
         }
      }

      
      for(int i = 0; i < result.length; i++) {
         System.out.print(result[i]+" ");
      }
   }

}
