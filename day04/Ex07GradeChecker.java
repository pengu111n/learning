package day0307;
// 사용자로부터 점수를 입력받아서
// A,B,C,D,E,를 출력하는 프로그램
// 단 사용자가 잘못된 점수를 입력하면 올바른 점수를 입력할때 까지 다시 입력을받으세요

import java.util.Scanner;

public class Ex07GradeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 점수를 입력받는다.
        System.out.print("점수를 입력해주세요 : ");
        int score = sc.nextInt();
        // 잘못된 범위일경우 다시입력 받기
        while(score > 100 || score < 0) {
        	System.out.println("올바른 점수가 아닙니다");
        	System.out.println("다시 입력해주십시요 : ");
        	score = sc.nextInt();
        }
        // 올바른 범위일경우
        if (score >= 90) {
            // 2-1. 입력한 점수가 90 이상이므로 A를 출력한다.
            System.out.println("A");
        } else if (score >= 80) {
            // 2-2. 입력한 점수가 80대이므로 B를 출력한다.
            System.out.println("B");
        } else if (score >= 70) {
            // 2-3. 입력한 점수가 70대이므로 C를 출력한다.
            System.out.println("C");
        } else if (score >= 60) {
            // 2-4. 입력한 점수가 60대이므로 D를 출력한다.
            System.out.println("D");
        } else {
            // 2-5. 그외는 F를 출력한다.
            System.out.println("F");
        }
        
        
    }
}
