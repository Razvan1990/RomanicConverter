package arabicToRomanic;

import java.util.Scanner;

public class IntroduceNumber {

    public int giveNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce the number");
        int number = scanner.nextInt();

        while(number <=0 ||number >3999){
            System.out.println("We cannot convert this number into romanic number. Introduce again");
            number = scanner.nextInt();
        }
        return number;
    }
}
