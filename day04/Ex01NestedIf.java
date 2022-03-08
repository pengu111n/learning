package day0307;
// 중첩 if문
// 중첩 if문이란, 한개의 of 코드 블락 안에
// 새로운 if 코드 블록이 들어가 있는 형태이다.

// 지금은 우리가 아는 제어문이 if 문밖에 없으니
// if문만 중첩을 시키지만,
// 후에 우리가 새로운 제어문을 배우게 된다면
// 다양한 제어문을 중첩하여 사용할 수 있다.
public class Ex01NestedIf {
	public static void main(String[] args) {
		// 어떤 정수 변수의 값이 자연수이면 "자연수입니다" 라고 출력이되고
		// 만약 음의 정수일경우에는 "음의 정수입니다." 라고 출력이되는 프로그램
		
		// 단, 자연수일경우, 0이면 자연수입니다 라는ㄴ 메시지와 "0입니다"라는 메시지가 같이
		// 출력이되고, 한자리 자연수이면 " 자연수입니다"라는 메세지의 "한자리 자연수입니다"가 같이 출력이 되고
		// 그보다 클 경우에는 "자연수입니다" "두자리 이상입니다"가 같이 출력이된다.
		
		// int 변수 num 선언후 3으로 초기화
		int num = -10;
		
		if(num < 0) {
			System.out.println("음의 정수입니다");
		} else {
			System.out.println("자연수입니다.");
		}
		
		if(num == 0) {
			System.out.println("0입니다.");
		} else if(num < 10) {
			System.out.println("한자리 자연수입니다");
		} else {
			System.out.println("두자리 이상입니다.");
		}
		
		
		
	}

}
