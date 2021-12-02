import romanicToArabic.Calculation;
import romanicToArabic.CheckInput;
import romanicToArabic.IntroduceInput;

public class Main {

    public static void main(String[] args) {
        CheckInput checkInput = new CheckInput();
        IntroduceInput introduceInput= new IntroduceInput();
        Calculation calculation = new Calculation();



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



    }
}
