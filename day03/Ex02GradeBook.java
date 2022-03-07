package day0304;
// 사용자로부터 번호, 이름, 영어점수, 수학점수, 국어점수를
// 차례대로 입력 받아서
// 다음과 같은 양식으로 출력되는 프로그램을 작성하십시오

import java.util.Scanner;

// 결과)
// 번호: 0##번 이름: ###
// 국어: 0##점 영어: 0##점 수학: 0##점
// 총점: 0##점 평균 0##.##점
public class Ex02GradeBook {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        //과목의 갯수를 저장한 상수
        final int SUBJECT_SIZE = 3;
        
        //입력
        
        //번호
        System.out.print("번호 : ");
        int num = sc.nextInt();
        
        //이름
        System.out.print("이름 : ");
        sc.nextLine(); // 버그방지용
        String name = sc.nextLine();
        
        //영어
        System.out.print("영어점수 : ");
        double eng = sc.nextDouble();
        
        //수학
        System.out.print("수학점수 : ");
        double math = sc.nextDouble();
        
        //국어
        System.out.print("국어점수 : ");
        double kor = sc.nextDouble();
        
        double sum = math+eng+kor;
        double avr = sum / (double)SUBJECT_SIZE;
        
        //출력
        System.out.printf("번호 : %03d 이름 : %s\n", num, name);
        
        System.out.printf("국어 : %03.0f 영어 : %03.0f : 수학 : %03.0f\n", kor, eng, math);
        
        System.out.printf("총점 : %03.0f 평균 : %06.2f ", sum, avr);
        
    }

}
