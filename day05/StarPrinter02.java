package day0308;

import java.util.Scanner;

public class StarPrinter02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("별갯수 입력 : ");        
        int starNum = sc.nextInt();
        
        // i는 세로줄수 
        // 최소값
        int iMin = 1;
        // 최대값
        int iMax = starNum;
        
        for(int i = iMin; i <= iMax; i++) {
           
            
            for(int j = starNum; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
