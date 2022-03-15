package day0311;
// 로또 번호 추첨기 ver4.0

// 사용자가 숫자를 뽑으면
// 컴퓨터의 숫자들과 비교하여
// 사용자 숫자, 컴퓨터 숫자, 총 맞은 갯수를 출력해주는 버젼
// 5시 20분까지

// 고려해볼것: [1, 2, 3, 4, 5, 6] 과 [2, 3, 4, 5, 6, 7] 중 맞은 갯수를 찾는 방법

import java.util.Scanner;
import java.util.Random;

public class Ex02Lotto04 {
    public static void main(String[] args) {
        // 1. 상수
        // 로또 번호의 가능한 최소 값
        final int LOTTO_MIN = 1;
        // 로또 번호의 가능한 최대 값
        final int LOTTO_MAX = 45;
        // 로또 번호의 총 갯수
        final int LENGTH_MAX = 6;

        // 2. 변수
        // 입력에 사용할 Scanner 클래스 변수
        Scanner scanner = new Scanner(System.in);
        // 난수를 뽑는데 사용할 Random 클래스 변수
        Random random = new Random();

        // 사용자의 숫자를 저장할 int 배열
        int[] userNumbers = new int[LENGTH_MAX];
        // 컴퓨터의 숫자를 저장할 int 배열
        int[] computerNumbers = new int[LENGTH_MAX];

        // 컴퓨터 배열에 로또 번호 저장
        for (int i = 0; i < computerNumbers.length;) {
            int temp = random.nextInt(LOTTO_MAX) + LOTTO_MIN;

            boolean numberSwitch = true;

            for (int j = 0; j < i; j++) {
                if (temp == computerNumbers[j]) {
                    numberSwitch = false;
                }
            }

            if (numberSwitch) {
                computerNumbers[i] = temp;
                i++;
            }
        }

        // 컴퓨터 숫자 정렬
        for (int i = 0; i < computerNumbers.length - 1; i++) {
            if (computerNumbers[i] > computerNumbers[i + 1]) {
                int temp = computerNumbers[i];
                computerNumbers[i] = computerNumbers[i + 1];
                computerNumbers[i + 1] = temp;
                i = -1;
            }
        }

        // 사용자로부터 입력을 받아 배열에 저장하는 i for문
        for (int i = 0; i < userNumbers.length;) {
            System.out.printf("%d번째 숫자를 입력해주세요.\n", i + 1);
            System.out.print("> ");
            int temp = scanner.nextInt();

            boolean validSwitch = temp >= LOTTO_MIN && temp <= LOTTO_MAX;

            for (int j = 0; j < i; j++) {
                if (temp == userNumbers[j]) {
                    validSwitch = false;
                }
            }

            if (validSwitch) {
                userNumbers[i] = temp;
                i++;
            } else {
                System.out.println("잘못 입력하셨습니다.");
            }
        }

        // 사용자 배열 오름차순 정렬
        for (int i = 0; i < userNumbers.length - 1; i++) {
            if (userNumbers[i] > userNumbers[i + 1]) {
                int temp = userNumbers[i];
                userNumbers[i] = userNumbers[i + 1];
                userNumbers[i + 1] = temp;
                i = -1;
            }
        }

        // 사용자의 배열과 컴퓨터의 배열을 비교해서
        // 똑같은 숫자의 갯수를 int 변수에 저장한다.
        int count = 0;
        for (int i = 0; i < userNumbers.length; i++) {
            for (int j = 0; j < computerNumbers.length; j++) {
                if (userNumbers[i] == computerNumbers[j]) {
                    count++;
                }
            }
        }

        // 결과 출력
        System.out.print("컴퓨터의 숫자: [");
        for (int i = 0; i < computerNumbers.length; i++) {
            System.out.printf("%2d", computerNumbers[i]);
            if (i < computerNumbers.length - 1) {
                System.out.print(", ");
            } else {
                System.out.println("]");
            }
        }

        System.out.print("사용자의 숫자: [");
        for (int i = 0; i < userNumbers.length; i++) {
            System.out.printf("%2d", userNumbers[i]);
            if (i < userNumbers.length - 1) {
                System.out.print(", ");
            } else {
                System.out.println("]");
            }
        }

        System.out.println("총 맞은 갯수: " + count);

    }
}
