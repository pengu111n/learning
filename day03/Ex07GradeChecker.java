package day0304;

import java.util.Scanner;

// 사용자로부터 점수를 입력받아서
// 90점이상 A
// 80점이상 B
// 70점이상 C
// 60점이상 D
// 그외 F
// 가 촐력되는 프로그램을 작성해보시오
public class Ex07GradeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력하시오 : ");
        int score = sc.nextInt();
        
        if(score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
        
        
    }
}
