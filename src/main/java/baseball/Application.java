package baseball;

public class Application {
    static void run() {
        AnswerNumber answer = AnswerNumber.withCreateNumber();
        System.out.println(answer.randomNumber);
        GameStatus.gameStart();

        while(GameStatus.status == 1){
            Character[] input = InputNumber.createInputNumber();
            Result.comparison(answer, input);
        }
    }

    public static void main(String[] args) {
        Application.run();
    }

}