package day0303;
// 연산자 03
// 비교연산자

// 비교연산자는 2개의 값을 비교한다

public class Ex09Operator03 {
    public static void main(String[] args) {
        // int num1 을 선언하고 5를 저장하자
        int num1 = 5;
        // int num2 을 선언하고 8를 저장하자
        int num2 = 8;
        
        // <은 왼쪽공간의 값이 오른쪽 값보다 작으면 true, 그외에는 false.
        // >은 왼쪽값이 오른쪽보다 크면 true, 그외 false
        System.out.println("1. <");
        System.out.println("num1 < 100 : " + (num1 < 100));
        System.out.println("num2 < num1 : " + (num2 < num1));
        System.out.println("num1 < 5 : " + (num1 < 5));
        
        // <= 왼쪽값이 오른쪽값보다 작거나 같으면 true, 그외에는 false가연산된다
        //><= 왼쪽값이 오른쪽값보다 크거나 같으면 true, 그외에는 false가연산된다
        System.out.println("2. <=, >=");
        System.out.println("num1 >= 100 : " + (num1 >= 100));
        System.out.println("num2 >= num1 : " + (num2 >= num1));
        System.out.println("num1 >= 5 : " + (num1 >= 5));
        
        // == 은 왼쪽값과 오른쪽값이 같으면 true, 아니면 false
        System.out.println("3. ==");
        System.out.println("num1 ==5 : " + (num1 == 5));
        System.out.println("num1 == num2 : " + (num1 == num2));
        
        // !=은 왼쪽값과 오른쪽값이 다르면 true 아니면 false
        System.out.println("4 != ");
        System.out.println("num1 ! = 5 : " + (num1 != 5));
        System.out.println("num1 != num2 : " + (num1 != num2));
        
        System.out.println("-------------------------------------------");
        System.out.println();
        
        // 단, 비교연산자의 경우 참조형 데이터타입에 대해서는 부정확한 값이 연산될 수있기 때문에
        // 참조형 데이터타입에 대해서는 비교연산자를 사용해선 안된다.
        
        // String 변수 str1을 선언하고 "abc"를 할당한다.
        String str1 = "abc";
        // String 변수 str2을 선언하고 "abc"를 할당하되 다른방법으로 할당한다
        String str2 = new String("abc");
        // String 변수 str3을 선언하고 str1의 현재값을 저장한다
        String str3 = str1;
        
        // str1, str2, str3에 같은글자들만 들어가있는지 확인하기위해
        // ###의 현재값 [###]의 형태로 출력되게 코드를 작성한다
        System.out.println("str1의 현재값 : ["+str1+"]");
        System.out.println("str2의 현재값 : ["+str2+"]");
        System.out.println("str3의 현재값 : ["+str3+"]");
        
        // str1과 str2
        // str1과 str3
        // str2와 str3을
        // == 비교연산자를 통하여 비교한 결과값을 화면에 출력
        System.out.println("str1 == str2: " + (str1 == str2));
        System.out.println("str1 == str3: " + (str1 == str3));
        System.out.println("str2 == str3: " + (str2 == str3));
        
        // 비교연산자는 Stack 영역의 저장되어있는 값만 비교한다
        // 기본형 데이터타입의 경우, Stack 영역에 실제 값이 저장되기 때문에
        // 비교연산자를 통한 비교가 정확하지만
        // 참조형 데이터타입은 Stack 영역에 주소값이 저장된다
        // 실제 값을 비교하려면 해당 주소값을 참조해서
        // 그 주소값에 해당하는 heap 영역 안에 실제 값을 비교해야하지만
        // 비교연산자는 그렇게 하는 대신, stack 영역에 저장된 주소값을 토대로해서 비교를 한다.
        // 즉 str1, str2, str3은 모두 "abc"라는 실제 값을 가지고 있지만
        // str2 의 주소값은 str1과 다르고 str3은 str1의 주소값을 그대로 가져왔기 때문에
        // 비교연산자가 str1과 str2, str2와 str3은 서로 일치하지 않는다라는 연산을 하게된다는 것이다.
        
        // 따라서, 우리가 참조형 데이터 타입의 공간들의 실제값 비교를 위해서는 비교연산자를 사용해선 안된다.
        // 대신 해당공간의 equals() 라는 메소드를 통하여
        // 실제 값 비교를 실행해야 한다.
        // euqals 메소드는 다음과 같은 방법으로 사용한다.
        // 변수이름.equals(비교대상)
        System.out.println("str1.euqals(str2) : " + str1.equals(str2));
        System.out.println("str1.euqals(str3) : " + str1.equals(str3));
        System.out.println("str2.euqals(str3) : " + str2.equals(str3));
    }
}
