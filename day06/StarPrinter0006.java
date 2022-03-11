package day0310;

import java.util.Scanner;

public class StarPrinter0006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("별의 갯수 입력 : ");
        int input = sc.nextInt();
        
        for(int i = 1; i <= input; i++) {
            //공백
            for(int j = 1; j <= i-1 ; j++) {
                System.out.print(" ");
            }
            //별
            for(int k = input*2-i; k >= i; k--) {
                System.out.print("*");
            }System.out.println();
            
            
        }
        
        

    }

}
