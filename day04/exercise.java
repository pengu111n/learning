package day0307;

import java.util.Scanner;

//사용자로부터
//번호, 이름, 국어, 영어, 수학 순으로 입력 받아서
//다음과 같이 출력되는 프로그램을 작성하시오


//번호: 0##번 이름 : ###
//국어: 0##점 영어 : 0##점 수학: 0##점
//총점: 0##점 평균 : 0##.##점

//단, 입력과 출력을 분리해서
//사용자가 입력을 누를때에만 입력이 되고
//출력을 누르면 출력이 되게 코드를 작성하시고
//사용자가 종료를 선택하기 전까지는
//해당기능이 무한하게 반복되게 코드를 작성해보시오

//힌트) 변수의 선언위치

//심화과정 : 만약 사용자가 입력한적 없이
//출력을 선택하면
//"아직 입력된 정보가 없습니다" 만 출력되게 작성하시오
public class exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = 0;
        String name = null;
        int kor = 0;
        int eng = 0;
        int math = 0;
        
        boolean tf = false;
        
        
        while(true) {
            System.out.print("1. 입력 2. 출력 3.종료 : ");
            int choice = sc.nextInt();
                //입력
            if(choice == 1) {
                //번호
                System.out.print("번호 : ");
                num = sc.nextInt();
                
                //이름
                System.out.print("이름 : ");
                sc.nextLine();
                name = sc.nextLine();
                
                //국어
                System.out.print("국어 : ");
                kor = sc.nextInt();
                
                //영어
                System.out.print("영어 : ");
                eng = sc.nextInt();
                
                System.out.print("수학 : ");
                math = sc.nextInt();
                
                tf = true;
                
                //출력
            }else if(choice == 2 ) {
                
                if(tf == false) {
                    System.out.println("아직 입력된 정보가 없습니다");
                    break;
                }
                
                int sum = math+eng+kor;
                double avg = (double)sum/3;
                
                System.out.printf("번호 : %03d 이름 : %s\n", num, name);
                System.out.printf("국어 : %03d 영어 : %03d 수학 : %03d\n", kor, eng, math);
                System.out.printf("총점 : %03d점 평균 : %06.2f점\n", sum, avg);
                
                
                
            }else if (choice == 3) {
                System.out.println("종료합니다.");
                break;
            }
        }
        
        
        
    }

}
