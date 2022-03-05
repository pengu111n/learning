package day0302;
// 변수 (Variable)
// 변수란, 저장되어 있는 값을 다른 값으로 마음껏 덮어씌울 수있는 저장공간을 뜻한다.
// 프로그래밍에서 우리가 변수를 사용하려면
// 반드시 선언과 초기화라는 단계를 거쳐서 사용해야한다.

// 선언(Declaration)
// 변수의 선언이란, 해당 변수의 이름이 무엇이고 어떤 종류의 값을 저장 가능한지를
// 프로그램에게 말해주는 코드이다.
// 선언은 다음과 같이한다.
// 데이터타입 변수이름;
// 데이터타입: 해당 변수에 저장 가능한 값의 종류를 지정한다.

// 초기화(initialization)
// 변수의 초기화란, 해당 변수에 값을 저장하는 것을 우리가 초기화라고 한다.
// 값의 할당, 값의 저장 이라고도 표현할 수 있으며
// 단, 우리가 해당 변수를 사용하기 위해서는 반드시 최소한 한번은 값이 저장되어야 한다.
// 값의 할당은 다음과 같이 한다.
// 변수이름 = 값;
// 값 = 변수이름;
// 프로그래밍에서 = 은 오른쪽 값 또는 오른쪽 공간에 저장되어 있는 값을
// 왼쪽 공간에 할당해라 라는 의미이다.
public class Ex04Variable {
    public static void main(String[] args) {
        // int 데이터타입을 가진 변수 number를 선언해보자
        int number;
        // int 변수 number에 20을 할당해 보자
        number = 20;
        // 화면에 int 변수 number에 현재 저장된 값을 출력해보자
        System.out.println(number);
        
        //number에 30을 할당해보자
        number = 30;
        //화면에 int 변수 number에 저장된 값을 출력해보자
        System.out.println(number);
        
        // 변수를 사용할때 알아둬야할 점들
        // 1. 변수의 선언과 초기화는 우리가 한줄로 해줄수도 있다.
        // int 변수 number2 를 선언하고 45를 할ㄷ아해라
        int number2 = 45;
        // int 변수 number2의 현재 값을 출력해라
        System.out.println(number2);
        
        // 2. 똑같은 이름의 변수는 우리가 여러번 선언할수 없다.
        // int 변수 number를 선언하라
        // int number;  // 26번인지 46번인지 애매모호 하기 때문에 에러 자바는 유도리있지가 못하다. 이미 26번 라인에서 똑같이 변수선언했으므로
        // 같은 이름의 number라는 변수는 선언할 수 없다.
        number = 80;
        
        // 3. 당연하지만, 선언하지 않은 변수에 값을 저장하거나 호출할 수 없다.
        
        // 4. 값을 할당할 때에는 왼쪽엔 무조건 공간을, 오른쪽엔 저장될 값을 적어야 한다.
        // 3 = number; error
        
        // 5. 만약 호환가능한 데이터타입이면
        //    당연히 다른 변수의 값을 변수에 저장할수도 있다
        
        // number에 현재 저장된 값을 출력해라
        System.out.println(number);
        // number에 number2에 저장된 값을 저장해라
        number = number2;
        // number값 출력
        System.out.println(number);
        
    }
}
