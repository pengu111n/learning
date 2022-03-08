package day0307;

import java.util.Scanner;

// 사용자로부터 이름, 나이, 키, 몸무게 순으로 입력받아서
// Bmi 를 계산학 비만도 결과값을 출력하는 프로그램을 작성하세요.

// Bmi 공식은 몸무게/키m/키m 입니다.
// 기네스북에 따르자면, 세계에서 가장 키가 컸던 사람은 2.72m
// 기네스북에 따르자면 세계에서 가장 무거웠던 사람은 635kg였습니다

// bmi 따른 비만도
// 18.5미만 : 저체중
// 18.5이상 23미만 정상
// 23이상 25미만 과체중
// 25이상 비만
public class Ex04BmiChecker {
	public static void main(String[] args) {
		// 상수
		// 1. 입력 가능한 키의 최소값
		final double HEIGHT_MIN = 0;
		// 2. 입력 가능한 키의 최대값
		final double HEIGHT_MAX = 2.72;
		// 3. 입력 가능한 몸무게의 최소값
		final double WEIGHT_MIN = 0;
		// 4. 입력 가능한 몸무게의 최대값
		final double WEIGHT_MAX = 635;
		// 5. Bmi 기준점 1
		final double BMI_STANDARD1 = 18.5;
		// 6. Bmi 기준점 2
		final double BMI_STANDARD2 = 23;
		// 7. Bmi 기준점 3
		final double BMI_STANDARD3 = 25;
		
		Scanner sc = new Scanner(System.in);
		
		// 1.이름
		System.out.print("이름 : ");
		String name = sc.nextLine();
		// 2. 나이
		System.out.print("나이 : ");
		int age = sc.nextInt();
		// 3. 키
		System.out.print("키(m단위) : ");
		double height = sc.nextDouble();
		
		// 4. 키가 올바른지 확인
		if (height > HEIGHT_MIN && height <= HEIGHT_MAX) {
			// 4-1. 올바른 키의 범위에 속하므로 몸무게를 입력받는다
			System.out.print("몸무게 : ");
			double weight = sc.nextDouble();
			
			// 5. 몸무게가 올바른지 확인
			if(weight > WEIGHT_MIN && weight <= WEIGHT_MAX) {
				//이름 : ### 나이: 0##세 출력
				System.out.printf("이름 : %s 나이 : %03d세\n", name, age);
				//키: #.##M 몸무게 : 0##.##kg 출력
				System.out.printf("키 : %.2fM 몸무게 : %06.2fkg\n", height, weight);
				//비만도 : ##.## 비만도 출력
				final double bmi = weight/height/height;
				System.out.printf("BMI : %.2f 비만도 : ", bmi);
				
				if(bmi < BMI_STANDARD1) {
					System.out.println("저체중");
					System.out.printf("%.2f", bmi);
				} else if (bmi < BMI_STANDARD2) {
					System.out.println("정상");
					System.out.printf("%.2f", bmi);
				}else if (bmi < BMI_STANDARD3) {
					System.out.println("과체중");
					System.out.printf("%.2f", bmi);
				} else {
					System.out.println("비만");
					System.out.printf("%.2f", bmi);
				}
				//올바른 몸무게의 범위에 속하지 않으므로 경고메세지만 출력
			} else {
				//올바른 키의 범위에 속하지 않으므로 경고메시지만 출력
				System.out.println("올바르지 않은 범위입니다. 프로그램을 종료합니다");
			}
		} else {
			System.out.println("올바르지 않은 범위입니다. 프로그램을 종료합니다");
		}
		
		
		
	}
}
