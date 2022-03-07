package day0304;

import java.util.Scanner;

// 사용자로부터 국어 영어 수학 점수를 입력 받아서
// 검정고시 결과를 출력해주는 프로그램을 작성하시오
// 검정고시의 경우 만약 평균이 70미만이거나 혹은
// 한 과목이라도 60점 미만일 경우 탈락이 됩니다.

// 예시 : 50 50 50 탈락
//       80 80 80 합격
//       100 100 20 탈락
public class Ex09ResultChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //국어
        System.out.print("국어점수 입력 : ");
        int kor = sc.nextInt();
        
        //영어
        System.out.print("영어점수 입력 : ");
        int eng = sc.nextInt();
        
        //수학
        System.out.print("수학점수 입력 : ");
        int math = sc.nextInt();
        
        //총점
        int sum = math+kor+eng;
        
        //평균
        double avg = (kor+eng+math)/3.0;
        
        //출력
        if(avg < 70 || math < 60 || eng < 60 || kor < 60) {
            System.out.println("불합격");
            System.out.println("총점 : " + sum +" 평균 : " + avg );
        } else {
            System.out.println("합격");
            System.out.println("총점 : " + sum +" 평균 : " + avg );
        }
        
        
        
        
        
    }
}
