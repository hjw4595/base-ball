package baseball;

import java.util.Scanner;

public class Start {
    public static boolean gameStart() {
        int status;
        Scanner sc = new Scanner(System.in);
        System.out.println("게임을 시작하려면 1 종료하려면 2를 입력해주세요.");
        status = sc.nextInt();
        return status == 1;
    }
}
