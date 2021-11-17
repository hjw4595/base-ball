package nextstep.utils;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class numberUtils {
    public static ArrayList<Character> generateNumbers() {

        Set<Character> answerNumber = new LinkedHashSet<>();
        for (int i = 0; answerNumber.size() < 3; i++) {
            int number = Randoms.pickNumberInRange(1, 9);
            answerNumber.add(Integer.toString(number).charAt(0));
        }
        ArrayList<Character> result = new ArrayList<>(answerNumber);
        return result;
    }
}
