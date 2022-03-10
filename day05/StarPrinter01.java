package day0308;
// 별찍기 1번
import java.util.Scanner;
public class StarPrinter01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("*************************************");
        System.out.println("\t\t별찍기 1번");
        System.out.println("*************************************");
        
        // 출력할 줄 수를 입력받는다
        System.out.print("출력할 줄 수를 입력하세요");
        int userNumber = sc.nextInt();
        
        // i for문은 세로로 총 몇줄이 출력될지를 결정한다
        // 그렇다면 i for문은 총 몇번 반복이 되어야할까
        // userNumber번만큼 반복이되어야한다
        
        // i의 최소값
        int iMin = 1;
        // i의 최대값
        int iMax = userNumber;
        
        for(int i = iMin; i <= iMax; i++) {
            // j for문을 사용하여
            // i번째 줄에 별을 print로 찍어낸다
            
            // 이문제에서 별은 각줄마다 i개 만큼 들어간다
            // 즉 j for문은 총 i 번 반복되어야한다.
            
            // j의 최소값
            int jMin = 1;
            // j의 최대값
            int jMax = i;
            
            for(int j = jMin; j <= jMax; j++) {
                System.out.print("*");
            }
            
            System.out.println();
            
            
            
            
        }
        
    }
       
}
