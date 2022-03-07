package day0304;
// 사용자로부터 이름, 나이, 키, 몸무게를 차례대로 입력받아서
// 다음과 같은 형식으로 출력되게 프로그램을 작성하시오

import java.util.Scanner;

// 결과))))
// 이름: ### 나이: 0##세
// 키: #.##M 몸무게 : 0##.##kg
// BMI : ##.## 비만도 ###

// BMI 계산공식은
// 몸무게(kg 단위) / 키 m단위 / 키 m단위 이다

// BMI에 따른 비만도는
// ~18.5 미만 : 저체중
// 18.5 이상 23미만 : 정상
// 23 이상 25미만: 과체중
// 25이상: 비만

public class Ex08BmiChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //이름
        System.out.print("이름을 입력하시오 : ");
        String name = sc.nextLine();
        
        //나이
        System.out.print("나이를 입력하시오 : ");
        int age = sc.nextInt();
        
        //키
        System.out.print("키를 입력하시오 : ");
        double height = sc.nextDouble();
        
        //몸무게
        System.out.print("몸무게를 입력하시오 : ");
        double weight = sc.nextDouble();
        
        //bmi
        double bmi = weight/ height / height;
        
        
        
        //출력
        System.out.println("---------결과------------");
        System.out.printf("이름 : %s 나이 : %03d세\n", name, age);
        System.out.printf("키 : %3.2fM 몸무게 : %03.2fkg\n", height, weight);
        // bmi :##.## 비만도 : ##
        if(bmi < 18.5) {
            System.out.printf("bmi : %.2f 비만도 : 저체중", bmi);
        } else if(bmi < 23) {
            System.out.printf("bmi : %.2f 비만도 : 정상", bmi);
        } else if (bmi <25) {
            System.out.printf("bmi : %.2f 비만도 : 과체중", bmi);
        } else {
            System.out.printf("bmi : %.2f 비만도 : 저체중", bmi);
        }
        
        
    }
}
