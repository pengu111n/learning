package day0308;

import java.util.Random;
import java.util.Scanner;

/* 랜덤게임
 * 이 프로그램은
 * 플레이, 최고기록 보기, 종료의 기능으로 나누어져있다
 * 
 * 만약 사용자가 플레이를 누르면
 * 1부터 100까지의 난수를 컴퓨터가 만들어내고
 * 사용자는 그 숫자를 맞추는것이 목표가 된다
 * 만약 사용자가 입력한 숫자가 컴퓨터의 숫자보다 작으면
 * 화면에 "up" 이라고 뜨고
 * 반대의 상황에서는 "Down"이라고 뜬다.
 * 사용자가 한번 입력할 때 마다 사용자의 점수는 1점씩 오르는데
 * 이게임에서는 더 낮은 점수를 받는것이 목표가 된다
 * 만약 사용자가 컴퓨터의 숫자를 맞추면 축하메세지와 함께
 * 사용자의 이번 기록을 출력한다.
 * 또한 사용자가 새로운 최고 기록이면
 * 사용자에게 새로운 최고기록이 되었다는것을 알려준다.
 * 
 * 최고기록 보기의 경우
 * 현재 최고 점수를 보여주되, 만약 플레이 기록이 존재하지 않으면
 * "아직 플레이 기록이 존재하지 않습니다" 라는 메시지만 화면에 출력이 된다.
 * 
 * 쉬는시간포함 4시 50분
 **/
public class Ex02RandomNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        
        int randomnum = r.nextInt(100)+1;
        int score = 0;
        int bestscore = 0;        
        
        while(true) {
            System.out.print("1. 플레이 2. 최고기록 보기 3. 종료 : ");
            int choice = sc.nextInt();
            
            // 1번일경우
            if(choice == 1) {
                // 1. 숫자를 입력받는다
                System.out.print("맞추기 : ");
                int quiz = sc.nextInt();
                
                if(quiz > randomnum) {
                    System.out.println("down");
                } else if (quiz < randomnum) {
                    System.out.println("up");
                }
                
                
                // 사용자가 입력한 숫자가 컴퓨터의 숫자와 일치할때 까지 반복
                
                while(quiz  != randomnum) {
                    System.out.println("맞추기 : ");
                    quiz = sc.nextInt();
                    if(quiz > randomnum) {
                        System.out.println("down");
                    } else if (quiz < randomnum) {
                        System.out.println("up");
                    }
                    
                    score++;
                    
                }
                    
                System.out.printf("사용자의 이번 플레이 기록 : [%d]\n", score);
                
                if(bestscore > 0) {
                    System.out.printf("현재 최고 기록 : [%d]\n", bestscore);
                }
             
                if(bestscore == 0 || bestscore > score) {
                    bestscore = score;
                    System.out.println("새로운 최고기록입니다!");
                }
                
              // 2번선택
            } else if(choice == 2) {
                System.out.println("최고 점수 : " + bestscore);
                
                if(score == 0) {
                    System.out.println("아직 플레이한 기록이 존재하지않습니다.");
                }
                
            }else if (choice ==3 ) {
                System.out.println("종료합니다");
                break;
            }
            
            
        }
        
        
    }
}
