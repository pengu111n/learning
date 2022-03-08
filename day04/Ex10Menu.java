package day0307;

import java.util.Scanner;

// 무한반복문을 사용하여
// 메뉴를 무한하게 출력하는 프로그램을 만들어보자
public class Ex10Menu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("1. 입력 2. 출력 3.종료 : ");
			int choice = sc.nextInt();
			
			if(choice == 1) {
				//입력 코드 구현
				
			} else if (choice == 2) {
				//출력 코드 구현
				
			} else if (choice == 3) {
				System.out.println("사용해주셔서 갑사합니다");
				//break 키워드는 해당 반복문 혹은 switch 조건문을 종료시킨다
				break;
			}	
		}
		
	}

	
	
}
