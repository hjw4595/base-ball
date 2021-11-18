package baseball;

import nextstep.utils.numberUtils;

import java.util.ArrayList;


public class AnswerNumber {
    public ArrayList<Character> randomNumber;

    public AnswerNumber(ArrayList<Character> randomNumber) {
        this.randomNumber = randomNumber;
    }

    public static AnswerNumber withCreateNumber() {
        return new AnswerNumber(numberUtils.generateNumbers());
    }

}

