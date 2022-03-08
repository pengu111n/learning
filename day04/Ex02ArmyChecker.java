package day0307;

import java.util.Scanner;

// 사용자로부터 성별, 나이, 신체등급 순으로 입력받아서
// 현역, 공익, 면제중 하나를 출력하는 프로그램.
// 단, 성별의 경우 int 값으로 입력을 받아서
// 1이면 남자 2면 여자로 판단
// 만약 여자일경우, 추가적인 입력 없이
// "여성에게는 국방의 의무가 부여되지 않습니다" 만 출력이 됩니다
// 또한, 남자이지만 19세 미만의 미성년자 일경우
// " 아직 미성년자에게는 신체등급이 존재하지 않습니다" 가 출력이 됩니다
// 남자 성인일경우
// 1~3 : 현역
// 4 : 공익
// 그외 : 면제

// 4시 20분까지
public class Ex02ArmyChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("성별을 입력해주세요 (1은남자 2는여자) : ");
		int gender = sc.nextInt();
		
		if(gender == 1) {
			// 사용자가 남자이므로 
			//나이를 입력받는다
			
			System.out.print("나이 : ");
			int age = sc.nextInt();
			
			if(age >= 19) {
				// 남자 성인이므로, 신체등급을 입력받는다.
				System.out.print("신체등급 : ");
				int grade = sc.nextInt();
				
				if(grade < 4) {
					System.out.println("현역");
				} else if (grade == 4) {
					System.out.println("공익");
				} else {
					System.out.println("면제");
				}
 			} else {
				System.out.println("미성년자에게는 아직 신체등급이 존재하지 않습니다.");
			}			
		} else {
			System.out.println("여성에게는 국방의 의무가 부여되지 않습니다.");
		}
		
		
		
		
	
    }
}
