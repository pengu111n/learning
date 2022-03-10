package day0308;
/* Switch 조건문
 * Switch 조건문은 값이 명확하게 나뉘는 정수형 데이터타입 혹은 문자형 데이터타입의
 * 결과값을 하나 선택해서
 * 가능한 결과값들에 대한 실행 코드를 만들어주는 형태희 조건문이 된다
 * 
 * Switch 조건문은 다음과 같이 생긴다.
 * switch(변수 혹은 변수의 연산자) {
 * case 값1:
 *      값1에 맞춰 실행할 코드구현
 *      break;
 *      
 * case 값2:
 *      값2에 맞춰실행할 코드 구현
 *      break;
 *      
 * case 값3:
 *      값2에 맞춰실행할 코드 구현
 *      break;
 * 
 * default
 *      그 어떤 경우도 해당 안될경우 실행할 코드 구현
 *      break;
 * */
public class Ex03Switch {
    public static void main(String[] args) {
        //switch에서 사용할 int 변수
        int number = 4;
        
        switch(number % 5) {
        case 1:
            System.out.println("1입니다");
            break;
        case 2:
            System.out.println("2입니다.");
            break;
        case 4:
            System.out.println("4입니다");
            break;
        case 3:
            System.out.println("3입니다");
            break;
        default:
            System.out.println("그외입니다");
            break;
        
        }
        
    }
}
