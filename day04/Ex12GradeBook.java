package day0307;

import java.util.Scanner;

// 사용자로부터
// 번호, 이름, 국어, 영어, 수학 순으로 입력 받아서
// 다음과 같이 출력되는 프로그램을 작성하시오


// 번호: 0##번 이름 : ###
// 국어: 0##점 영어 : 0##점 수학: 0##점
// 총점: 0##점 평균 : 0##.##점

// 단, 입력과 출력을 분리해서
// 사용자가 입력을 누를때에만 입력이 되고
// 출력을 누르면 출력이 되게 코드를 작성하시고
// 사용자가 종료를 선택하기 전까지는
// 해당기능이 무한하게 반복되게 코드를 작성해보시오

// 힌트) 변수의 선언위치

//심화과정 : 만약 사용자가 입력한적 없이
// 출력을 선택하면
// "아직 입력된 정보가 없습니다" 만 출력되게 작성하시오
public class Ex12GradeBook {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 사용자로부터 입력받은 값을 저장할 변수
		int num = 0;
		String name = "";
		int kor = 0;
		int eng = 0;
		int math = 0;
		
		// 사용자가 입력했는지 안했는지를 저장할 boolean변수
		boolean inputswitch = false;
		
		while(true) {
			System.out.print("1. 입력 2. 출력 3.종료 : ");
			int choice = sc.nextInt();
			
			if(choice == 1) {
				// 번호 입력 
				System.out.print("번호 : ");
				num = sc.nextInt();
				
				// 이름
				System.out.print("이름 : ");
				sc.nextLine();
				name = sc.nextLine();
				
				//국어
				System.out.print("국어 : ");
				kor = sc.nextInt();
				
				while(kor < 0  || kor > 100) {
					System.out.println("잘못입력하셨습니다");
					System.out.print("점수를 입력해주세요 : ");
					kor = sc.nextInt();
				}
				
				//영어
				System.out.print("영어 : ");
				eng = sc.nextInt();
				
				while(eng < 0  || eng > 100) {
					System.out.println("잘못입력하셨습니다");
					System.out.print("점수를 입력해주세요 : ");
					eng = sc.nextInt();
				}
				
				//수학
				System.out.print("수학 : ");
				math = sc.nextInt();
				
				while(math < 0  || math > 100) {
					System.out.println("잘못입력하셨습니다");
					System.out.print("점수를 입력해주세요 : ");
					math = sc.nextInt();
				}
				
				// inputSwitch에 true를 저장
				inputswitch = true;
				
			} else if (choice == 2) {
				//출력 코드 구현
				if(inputswitch == true) {
			    System.out.printf("번호 : %3d번 이름: %s\n", num, name);
				System.out.printf("국어 : %03d점 영어 : %03d점 수학 : %03d점\n", kor, eng, math);
			    
				int sum = kor + eng + math;
				double avg = (double)sum/3;
				
				System.out.printf("총점 : %03d점 평균 : %06.2f점\n", sum, avg);
			} else {
				System.out.println("아직 입력되지 않았습니다");
			}
				
				
				
			} else if (choice == 3) {
				System.out.println("사용해주셔서 갑사합니다");
				//break 키워드는 해당 반복문 혹은 switch 조건문을 종료시킨다
				break;
			}	

	    }

    }
}
