package day0310;

import java.util.Scanner;

public class StarPrinter007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("입력 : ");
        int input = sc.nextInt();
        
        for(int i = 1; i <= input; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }System.out.println();
            
        }
        
        for(int i = 1; i <= input; i++) {
            for(int j = input-1; j >= i; j--) {
                System.out.print("*");
            }System.out.println();
        }
        
    }
}
