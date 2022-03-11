package day0310;

import java.util.Scanner;

public class StarPritner0010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("************************************");
        System.out.println("\t\t별찍기 10번");
        System.out.println("************************************");

        System.out.print("출력할 줄 수를 입력해주세요 : ");
        int input = sc.nextInt();
        
        for(int i = 1; i <= input; i++) {
            for(int j = i; j <= input; j++) {
                System.out.print("*");
            }
            // 공백
            for(int k =1; k < i-1; k++) {
                System.out.print("");
            }
            
            for(int l = i; l >= input-1; l++) {
                System.out.print("*");
            }
            System.out.println();
        }   
            
            
        
        
        
        
        
        
        

    }

}
