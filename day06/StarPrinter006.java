package day0310;

import java.util.Scanner;

public class StarPrinter006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("입력 : ");
        int input = sc.nextInt();
        
        for(int i = 1; i <= input; i++) {
            //공백
            for(int k = 1; k <= i-1; k++) {
                System.out.print(" ");
            }
            //별표
            for(int j = input*2-i; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        
    }
}
