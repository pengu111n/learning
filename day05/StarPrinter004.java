package day0308;

import java.util.Scanner;

public class StarPrinter004 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("별수 : ");
        int input = sc.nextInt();
        

        for(int i = 1; i <= input; i++) {
            // i 번째 줄에 출력될 내용을 저장할 String 변수
            String stars = "";
            
            // 공백의 갯수
            int spaceWidth = i - 1;
            
            // 공백을 담당하는 j for문
            for(int j = 1; j<=spaceWidth; j++) {
                stars += " ";
            }
            // 별의 갯수
            int starWidth = input - spaceWidth;
                
            // 별을 담당하는 j for문
            for(int j = 1; j<= starWidth; j++) {
                stars += "*";
            }
            
            
            System.out.println(stars);
        }
    }

}
