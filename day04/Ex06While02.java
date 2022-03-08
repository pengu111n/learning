package day0307;

import java.util.Scanner;

// 사용자로부터 두자리 양의 정수를 입력받는 프로그램.
// 단, 두자리 양의 정수가 아닌 숫자를 입력하면
// 두자리 양의 정수를 입력할때 까지 다시 입력을 받는다.
public class Ex06While02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두자리 양의 정수를 입력하시오 : ");
		int num = sc.nextInt();
		
		// 만약 사용자가 입력한 수가 두자리 양의 정수가 아니면
		// 다시 입력을 받는다
		while(num <10 || num >= 100) {
			System.out.println("잘못입력하셨습니다");
			System.out.println("두자리 양의 정수를 입력해주세요");
			num = sc.nextInt();
		}
		
		// 사용자가 입력한 수를 출력한다
		System.out.printf("사용자가 입력한 수 : [%d]\n", num);
		
	
		
	}
}
