package day0303;
// 연산자(Operator)
// 연산자란 수학적 기호에 프로그래밍적 코드가 정의되어
// 특정 기호를 사용하면 해당 코드가 실행되서 결과값을 계산해주는
// 기호들을 연산자라고 한다.

// 연산자에는
// 산술연산자
// 할당연산자
// 비교연산자
// 논리연산자
// 비트연산자
// 다섯가지 종류가 존재한다.

public class Ex07Operator {
    public static void main(String[] args) {
        // 산술연산자
        // 산술연산자는 2가지 값에 대한
        // 수학연산을 한다.
        // +: 앞의 값과 뒤에값을 더한 결과값을 구한다
        // -: 앞의 값과 뒤에값을 뺀 결과값을 구한다
        // *: 앞의 값과 뒤에값을 곱한 결과값을 구한다
        // /: 앞의 값과 뒤에값을 나눈 몫을 구한다
        // %: 앞의 값과 뒤에값을 나눈 결과값의 나머지를 구한다
        
        // 단, 산술 연산의 경우
        // 정수와 정수끼리의 연산은 결과값이 정수가나오고
        // 정수와 실수끼리의 연산은 실수가 나온다.
        
        // int 타입의 변수 num1 과 num2를 선언하고 각각 3과 5를 저장
        int num1 = 3;
        int num2 = 5;
        
        // double 타입의 변수 d1 과 d2를 선언하고 각각 3과 5를 저장
        double d1 = 3;
        double d2 = 5;
                
        System.out.println("1. 정수끼리의 산술 연산");
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);
        System.out.println("----------------------------------");
        System.out.println();
        
        System.out.println("2. 실수끼리의 산술 연산"); 
        System.out.println(d1+d2);
        System.out.println(d1-d2);
        System.out.println(d1*d2);
        System.out.println(d1/d2);
        System.out.println(d1%d2);
        System.out.println("----------------------------------");
        System.out.println();
        
        System.out.println("3. 정수와 실수끼리의 연산");
        System.out.println(num1+d2);
        System.out.println(num1-d2);
        System.out.println(num1*d2);
        System.out.println(num1/d2);
        System.out.println(num1%d2);
        System.out.println("----------------------------------");
        System.out.println();
        
        // 산술연산의 경우
        // 당연히 계산의 우선순위가 일반 수학처럼 적용이 된다.
        // 만약 같은 우선순위에 속할 경우에는
        // 왼쪽에서 오른쪽으로 실행이 된다.
        
        // 번외
        // String 값에 대한 더하기 연산
        // String 값을 더하기 연산할 수있는데
        // 이 때에는 앞의 값과 뒤에값을 모두 String 값으로 변환하고
        // 앞의 값 뒤에 뒤의 값을 이어서 한개의 커다란 String 결과값을 연산하라는 의미가 된다.
        
        // 앞의 String 값 "A"에 뒤의 String 값 "B"를 이어서
        // "AB" 라는 결과값을 만들고
        // 그 결과값을 화면에 출력해라
        System.out.println("A" + "B");
        
        // 앞의 String 값"A" 에 뒤의 int 값 123을 String "123"으로 변환하여
        // "A123" 이라는 결과값을 만들고
        // 그 결과값을 화면에 출력해라
        System.out.println("A" + 123);
        
        // 앞의 int 123을 String "123"으로 변환하고
        // 뒤에 "456"을 연결하여
        // "123456" 이라는 결과값을 만들고
        // 그 결과값을 출력해라
        System.out.println("123" + 456);
        System.out.println(123+456);
    }
}
