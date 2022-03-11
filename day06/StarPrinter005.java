package day0310;

import java.util.Scanner;

public class StarPrinter005 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("별의 개수 : ");
        int input = sc.nextInt();
        
        for(int i = 1; i <= input; i++) {
            //공백
            for(int j = 1; j <= input-i; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= i*2-1; k++) {
                System.out.print("*");
            }System.out.println();
        }
        
        
    }

}
