package day0310;

import java.util.Scanner;

public class Starprinter0007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("************************************");
        System.out.println("\t\t별찍기 6번");
        System.out.println("************************************");

        System.out.print("출력할 줄 수를 입력해주세요 : ");
        int input = sc.nextInt();
        
        for(int i = 1; i <= input; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }System.out.println();
            
        }
        
        for(int i = 1; i<= input; i++) {
            for(int j = input-1; j >= i; j--) {
                System.out.print("*");
            }System.out.println();
        }
        
        
        

    }

}
