package application;

import arabicToRomanic.PositionDigitPosMap;
import arabicToRomanic.StringMaker;
import romanicToArabic.Calculation;
import romanicToArabic.CheckInput;
import romanicToArabic.IntroduceInput;

import java.util.HashMap;
import java.util.Scanner;

public class RunnerMethod {

    private Calculation calculation;
    private PositionDigitPosMap positionDigitPosMap;
    private StringMaker stringMaker;

    RunnerMethod() {
        this.calculation = new Calculation();
        this.positionDigitPosMap = new PositionDigitPosMap();
        this.stringMaker = new StringMaker();
    }

    public void chooseConverter() {

        System.out.println(" Please choose what type of conversion you would like");
        System.out.println("Choose 1 for romanic to arab\t Choose 2 for arab to romanic\n");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();

        while (option != 1 && option != 2) {
            System.out.println("Not existing option. Choose again");
            option = scanner.nextInt();
        }

        switch (option) {
            case 1:
                int number = calculation.calculateNumber();
                System.out.println();
                System.out.println("The arab number is " + number);
                break;
            case 2:
                HashMap<Integer, Integer> posDSigitMap = positionDigitPosMap.putPositionAndDigits();
                String resultRomanicNumber = stringMaker.createRomanicNumber(posDSigitMap);
                System.out.println("The romanic number is " + resultRomanicNumber);
                break;
            default:
                System.out.println("Something went wrong");

        }


    }
}
