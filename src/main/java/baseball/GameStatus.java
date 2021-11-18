package baseball;

import java.util.Scanner;

public class GameStatus {
    public static int status;

    public static int gameStart() {
        Scanner sc = new Scanner(System.in);
        System.out.println("게임을 시작하려면 1 종료하려면 2를 입력해주세요.");
        status = sc.nextInt();
        return status;
    }
    public static int gameEnd(int st) {
        if(st == 3) {
            return status = 2;
        }
        return status;
    }
}
