package test.test03.test0300;

import java.util.Scanner;
public class Main1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int price = 0;
        sc.close();
       
        if(A == B && A == C && B == C) {
            price = 10000+(A*1000); 
            System.out.println(price);
        }
        else if(A == B || A == C) {
            price = 1000+(A*100);
            System.out.println(price);
        }
        else if(B == C) {
            price = 1000+(B*100);
            System.out.println(price);
        }    
        else {
            if(A < B) {
                A = B;
                if(A < C){
                    A = C;
                    price = A*100;
                    System.out.println(price);
                    }
                else {
                	price = A*100;
                    System.out.println(price);
                	}
                }
            else {
            	if(A < C) {
            		A = C;
            		price = A*100;
                    System.out.println(price);
            	}
            	else {
            		price = A*100;
            		System.out.println(price);
            	}
                
            }
        }
    }
       
 }
