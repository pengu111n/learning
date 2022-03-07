package day0304;

import java.util.Scanner;

// 사용자로부터 나이를 입력받아서
// 5세미만 : 영아
// 5세~13세 : 어린이
// 14~ 18세 : 청소년
// 그외 : 성인
// 이 출력되는 프로그램을 작성하시오
public class Ex06AgeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("나이를 입력하시오 : ");
        int age = sc.nextInt();
        
        if(age < 5) {
            System.out.println("영아");
        } else if(age <= 13) {
            System.out.println("어린이");
        } else if(age <= 18) {
            System.out.println("청소년");
        } else {
            System.out.println("성인");
        }
        
        
        
        
    }
}
