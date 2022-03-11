package day0310;
/* 배열(Array)
 * 배열이란, 똑같은 목적을 가진 똑같은 데이터 타입의 변수가 여러개가 필요할 때,
 * 굳이 필요한 갯수의 변수를 여러개 만들지 않고
 * 우리가 한번에 묶어서 하나의 변수로 만들 때 쓰이는 데이터 타입이다.
 * 
 * 예시 : 만약 우리가 로또 번호 추첨 프로그램을 만들게 된다면
 * int 변수를 6개 만들게 된다면?
 * 중복 제거 혹은 오름차순 정렬을 할 때, 매번 별개의 변수 이름을 모두다 써야하므로
 * 코드가 매우 복잡해진다
 * 
 * 하지만, 우리가 로또 번호에서 변수명이 중요할까?
 * 혹은 해당 변수들이 제각각 목정이 다른 변수들일까?
 * 
 * 즉 이렇게 같은 목적을 가지고, 같은 데이터타입을 가진 데이터를 관리해야 할 경우,
 * 우리가 해당 데이터타입들을 배열로 만들어서 하나의 변수로 관리할 수있게 만들어 주면
 * 훨씬 더 코드가 편해진다
 * 
 * 배열은 다음과 같이 선언하고 초기화해준다.
 * 데이터타입[] 배열이름 = new 데이터타입[길이]
 * 데이터타입 : 해당 배열의 각 칸에 담을 데이터타입
 * 길이: 해당 배열이 총 몇개의 값을 가지고 있을지를 지정한다. 
 */
public class Ex01Array {
    public static void main(String[] args) {
        // 총 4개의 값을 가지고 있을수 있는
        // int 배열 intArray
        int[] intArray = new int[4];
        
        /* 일반적인 int 데이터타입의 변수에 값을 저장할 때에는?
         * 변수이름 = 값
         * 으로 저장했다
         * 배열의 경우 우리가 해당 배열의 몇번째 칸에 저장할 지를 지정해야 한다.
         * 이때에는 우리가 다음과 같이 칸을 지정해서 값을 저장한다.
         * 배열이름[칸 번호] = 값;ㅣ
         * 단, 프로그래밍에서 우리가 순서를 셀 때에는
         * 1이 아닌 0부터 세게된다.
         * 
         * int 배열 intArray의 0번칸에 30을 저장해라
         */   
         intArray[0] = 30;
        
         /* 우리가 특정 변수의 값을 출력하거나 저장된 값을 호출할 때에는
          * 변수이름을 적어주기만 하면 되었지만
          * 배열의 경우, 우리가 몇번째 칸에 저장된 값을 호출하는 것인지
          * 지정해야한다
          * 이때에는 배열이름[칸 번호] 로 지정하게 된다
          * 
          * int 배열 intArray의 0번칸에 저장된 값을 화면에 출력해라
          */
          System.out.println(intArray[0]);
         
         /* 배열에 관련된 팁들
          *  1. 배열에 길이를 지정할 때 우리가 다른 변수를 사용해서
          *     지정해줄 수 있다.
          *     단, 이 때에는 해당변수는 반드시 정수형 데이터타입의 변수여야 한다.
          */
          
          int length = 5;
          intArray = new int[length];
          
          /* 2. 배열의 특정 칸 번호를 우리가 인덱스 라고 부른다.
           *     인덱스도 우리가 변수를 사용해서 특정 칸을 지칭할 수 있다.
           */
          int idx = 2;
          intArray[idx] = 40;
          System.out.println(intArray[idx]);
          
          /* 3. 컴퓨터는 순서를 0부터 세기 때문에
           *     어떤 배열의 인덱스는 0부터 해당배열의 길이 -1 까지가 범위가된다
           *     만약 잘못된 인덱스(0보다 작거나 아니면 해당 배열의 길이 이상일경우)를
           *     접근하게 되면 ArrayIndexOutOfBoundsException 이 발생한다.
           */
          
          // intArray의 -1번째칸에 50을 저장해라
          //intArray[-1] = 50;
          
          // intArray의 6번째칸에 40을 저장해라
          //intArray[6] = 40;
          
          // 4. 기본형 데이터 타입의 배열일 경우, 모든 칸은 0으로 초기화된다.
          intArray = new int[3];
          
          // intArray의 0번칸 1번칸 2번칸을 출력
          System.out.println("intArray[0] : " + intArray[0]);
          System.out.println("intArray[1] : " + intArray[1]);
          System.out.println("intArray[2] : " + intArray[2]);
          
          // 하지만 참조형 데이터타입의 배열일 경우, 모든 칸은 null이라는 특수한 상태로 초기화가 된다.
          // null이란, 참조형 데이터타입에 연결된 해당 메모리 주소칸이 아직 준비가 안되어있는 상태로써
          // 제대로 초기화를 하지 않을 경우에는 해당 칸의 메소드를 실행시킬수 없다.
          
          // String 배열 StringArray를 선언하고 4칸으로 초기화해보자
          String[] StringArray = new String[4];
          
          // StirngArray의 0, 1, 2, 3번칸을 출력해보자
          System.out.println("StringArray[0] : " + StringArray[0]);
          System.out.println("StringArray[1] : " + StringArray[1]);
          System.out.println("StringArray[2] : " + StringArray[2]);
          System.out.println("StringArray[3] : " + StringArray[3]);
          
          // 특정 배열의 길이를 알고 싶을 때에는
          // 배열이름.length라고 하면 길이가 자동으로 나온다
          
          for(int i = 0; i < StringArray.length; i++) {
              System.out.printf("stringArray[%d] : %s\n", i, StringArray[i]);
          }
          
          // stringArray의 0번째 칸에 String 값이 "abc"와 같은지 출력하시오
          //System.out.println(StringArray[0].equals(("abc"));
          // 상태가 null인 공간의 메소드를 실행시켰으므로 NullPointerException이 발생한다. 
          
          // 즉, 만약 어떤 참조형 데이터타입의 배열을 선언과 초기화했을경우에는
          // 그 후에 해당 배열의 각 칸을 초기화해야 정상적으로 사용가능하다/
          
    }
}
