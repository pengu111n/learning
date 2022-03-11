package day0310;

import java.util.Scanner;

public class qweqwe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("************************************");
        System.out.println("\t\t별찍기 10번");
        System.out.println("************************************");

        System.out.print("출력할 줄 수를 입력해주세요 : ");
        int input = sc.nextInt();
        
        for(int i = 1; i<= input; i++) {
            //왼쪽별
            for(int j = input; j >= i; j--) {
                System.out.print("*");
            }
            //공백
            for(int k = i-1; k <= i*2-1; k++) {
                System.out.print(" ");
            }
            //오른쪽별
            for(int l = input; l >= i; l--) {
                System.out.print("*");
            }System.out.println();
        }
        
    }
}
