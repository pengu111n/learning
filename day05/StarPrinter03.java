package day0308;

import java.util.Scanner;

public class StarPrinter03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("별 개수 : ");
        int star = sc.nextInt();
        
        int iMin = 1;
        int IMax = star;
        
        for(int i = iMin; i <= IMax; i++) {
           // i번째 줄에 출력될 내용을 저장할 String 변수
            String space = "";
           //  공백의 갯수를 저장하는 int 변수
            int spaceWidth = star - i ;
            
            //공백을 담당하는 j for문
            for(int j =1; j <=spaceWidth; j++) {
                space += " ";
            }
            
            // 별의 개수를 저장하는 int변수
            int starWidth = i;
            
            //별을 담당하는 j for문
            for(int j = 1; j <= starWidth; j++) {
                space += "*";
            }
            System.out.println(space);
        }
    }
}
