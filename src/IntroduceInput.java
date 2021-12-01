import java.util.Scanner;

public class IntroduceInput {
    private CheckInput checkInput = new CheckInput();

    public String introduceInputWithCheckings() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce the romanic number");
        String romanicNumber = scanner.nextLine();
        String romanicNumberUpper = romanicNumber.toUpperCase();

        boolean firstCheck = checkInput.checkUnwantedCharacters(romanicNumberUpper);
        boolean secondCheck = checkInput.numberOfConsecutiveCharacters(romanicNumberUpper);

        while (!firstCheck || !secondCheck) {
            System.out.println("Introduce the number again");
            romanicNumber = scanner.nextLine();
            romanicNumberUpper = romanicNumber.toUpperCase();
            firstCheck = checkInput.checkFrequencyOfCharacters(romanicNumberUpper);
            secondCheck = checkInput.checkUnwantedCharacters(romanicNumberUpper);

        }
        System.out.print("You have introduced ");
        return romanicNumberUpper;


    }
}
