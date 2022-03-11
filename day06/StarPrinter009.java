package day0310;

import java.util.Scanner;

public class StarPrinter009 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("************************************");
        System.out.println("\t\t별찍기 9번");
        System.out.println("************************************");

        System.out.print("출력할 줄 수를 입력해주세요 : ");
        int input = sc.nextInt();
        
        for(int i = 1; i <= input; i++) {
            // 공백
            for(int j = input-1; j >= i; j--) {
                System.out.print(" ");
            }
            // 별
            for(int k = 1; k <= i*2-1; k++) {
                System.out.print("*");
            }System.out.println();
        }
        
        for(int i = 1; i <= input; i++) {
            // 공백
            for(int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            // 별
            for(int k =(input-1)*2-i; k >= i; k--) {
                System.out.print("*");
            }System.out.println();
        }
        
        
        
        
    }

}
