package day0307;

import java.util.Scanner;

// 사용자로부터 점수를 입력받아서
// A,B,C,D,F 를 출력하는 프로그램
//  단, 사용자가 -1을 입력하면
// 사용해주셔서 감사합니다. 라고 출력이되고
// 만약 그외의 잘못된 점수를 입력하면
// 다시 입력하게 만드세요
// 35분까지
public class Ex11GradeChecker02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			// 사용자로부터 점수를 입력받는다
			System.out.print("점수를 입력하시거나 종료하실려면 -1 을 입력해주세요 : ");
			int score = sc.nextInt();
			
			while(!(score >= -1 && score <= 100)) {
			    System.out.println("다시입력해주십시요 : ");
			    score = sc.nextInt();
			}
			if(score == -1) {
			    System.out.println("사용해주셔서 감사합니다");
			    break;
			} else {
			    if (score >= 90) {
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
		
		
	}
}
