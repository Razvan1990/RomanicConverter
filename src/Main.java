import arabicToRomanic.PositionDigitPosMap;
import arabicToRomanic.StringMaker;
import romanicToArabic.Calculation;
import romanicToArabic.CheckInput;
import romanicToArabic.IntroduceInput;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        CheckInput checkInput = new CheckInput();
        IntroduceInput introduceInput= new IntroduceInput();
        Calculation calculation = new Calculation();
        PositionDigitPosMap positionDigitPosMap = new PositionDigitPosMap();
        StringMaker stringMaker = new StringMaker();



        String test = "MMMMXXXXLLVVVVVVIII";
//        boolean number =  checkInput.numberOfConsecutiveCharacters(test);
//        System.out.println(number);
//
//        //System.out.println(checkInput.checkUnwantedCharacters(test));
//        System.out.println(checkInput.checkFrequencyOfCharacters(test));
//        System.out.println(checkInput.putCorrectString("XXMMLLIIDCCAX"));

        //System.out.println(introduceInput.introduceInputWithCheckings());

       int number = calculation.calculateNumber();
        System.out.println();
       System.out.println("The arab number is "+number);

       HashMap<Integer, Integer> posDSigitMap = positionDigitPosMap.putPositionAndDigits();
        String resultRomanicNumber = stringMaker.createRomanicNumber(posDSigitMap);
        System.out.println("The romanic number is "+resultRomanicNumber);






    }
}
