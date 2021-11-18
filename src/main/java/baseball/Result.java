package baseball;

public class Result {
    public static void comparison(AnswerNumber answer, Character[] input) {
        int st = 0;
        int ba = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (answer.randomNumber.get(i) == input[j]) {
                    if (i == j) {
                        st++;
                    } else {
                        ba++;
                    }
                }
            }
        }
        if (st == 0 && ba == 0) {
            System.out.println("낫싱");
        } else {
            System.out.printf("%d 스트라이크 %d 볼 %n", st, ba);
            if(st == 3) {
                System.out.println("정답");
                GameStatus.gameEnd(st);
            }
        }
    }
}
