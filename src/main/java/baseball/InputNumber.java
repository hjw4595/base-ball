package baseball;

import java.util.*;

public class InputNumber {
    public static Character[] createInputNumber() {
        int same=0;
        System.out.print("숫자 입력: ");
        Scanner sc = new Scanner(System.in);
        String inputValue = sc.next();
        Set<Character> inputNumber = new LinkedHashSet<>();
        for(int i = 0 ; i < inputValue.length(); i++){
           if(!inputNumber.add(inputValue.charAt(i))){
               same++;
           }
        }
        Character[] numberArray = new Character[3];
        inputNumber.toArray(numberArray);
        return numberArray;
    }
}
