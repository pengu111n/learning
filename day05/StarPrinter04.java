package day0308;

import java.util.Scanner;

public class StarPrinter04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("입력 : ");
        int input = sc.nextInt();
        
        for(int i = 1; i <= input; i++) {
           for(int j = 0; j <= i; j++) {//공백 for
               System.out.print(" ");   
           }
           for(int k =0; k <= input-i; k++) {// 별표 for
               System.out.print("*");
           }
           System.out.println();
       }
        
        
    }

}
