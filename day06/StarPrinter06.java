package day0310;

// 별찍기 6번
import java.util.Scanner;

public class StarPrinter06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("************************************");
        System.out.println("\t\t별찍기 6번");
        System.out.println("************************************");

        System.out.println("출력할 줄 수를 입력해주세요.");
        System.out.print("> ");
        int userNumber = scanner.nextInt();

        // i의 최소값
        int iMin = 1;
        // i의 최대값
        int iMax = userNumber;

        for (int i = iMin; i <= iMax; i++) {
            // i번째 줄에 출력될 내용을 저장할 String 변수
            String stars = "";

            // 공백의 갯수
            int spaceWidth = i - 1;

            // 공백을 담당하는 j for 문
            for (int j = 1; j <= spaceWidth; j++) {
                stars += " ";
            }

            // 별의 갯수
            int starWidth = -2 * i + 2 * userNumber + 1;

            // 별을 담당하는 j for 문
            for (int j = 1; j <= starWidth; j++) {
                stars += "*";
            }

            System.out.println(stars);
        }
    }
}
