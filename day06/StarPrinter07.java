package day0310;

// 별찍기 7번
import java.util.Scanner;

public class StarPrinter07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("************************************");
        System.out.println("\t\t별찍기 7번");
        System.out.println("************************************");

        System.out.println("출력할 줄 수를 입력해주세요.");
        System.out.print("> ");
        int userNumber = scanner.nextInt();

        // 윗부분을 담당하는 i for문
        for (int i = 1; i <= userNumber - 1; i++) {
            // i번째 줄에 출력될 내용을 저장할 String 변수
            String stars = "";

            // 별의 갯수
            int starWidth = i;

            // 별을 담당하는 j for문
            for (int j = 1; j <= starWidth; j++) {
                stars += "*";
            }

            System.out.println(stars);
        }

        // 아랫부분을 담당하는 i for문
        for (int i = 1; i <= userNumber; i++) {
            String stars = "";

            // 별의 갯수
            int starWidth = userNumber - i + 1;

            // 별을 담당하는 j for문
            for (int j = 1; j <= starWidth; j++) {
                stars += "*";
            }

            System.out.println(stars);
        }
    }
}
