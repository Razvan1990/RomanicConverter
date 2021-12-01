import java.util.HashMap;

import static java.lang.Math.abs;

public class Calculation {

    private IntroduceInput introduceInput = new IntroduceInput();
    private CheckInput checkInput = new CheckInput();
    private Constants constants = new Constants();

    public int calculateNumber() {
        String givenString = introduceInput.introduceInputWithCheckings();
        System.out.print(givenString);
        String extraSpaceGivenString = checkInput.addExtraSpace(givenString);

        int sum = 0;

        char[] myArray = extraSpaceGivenString.toCharArray();
        HashMap<Character, Integer> mapValues = constants.equalityCharacterMap();

        /**
         *   1.traverse trhough all the character array
         *   2. check conditions and make correct sum: CD, CM, IV, IX, XL, XC
         *   3. make the correct sum
         */

        for (int i = 0; i < myArray.length - 1; ) {
            //CD
            if (myArray[i] == 'C' && myArray[i + 1] == 'D') {
                sum += calculateDifference(mapValues, myArray[i], myArray[i + 1]);
                i+=2;
            }
            //CM
            else if (myArray[i] == 'C' && myArray[i + 1] == 'M') {
                sum += calculateDifference(mapValues, myArray[i], myArray[i + 1]);
                i+=2;
            }
            //IV
            else if (myArray[i] == 'I' && myArray[i + 1] == 'V') {
                sum += calculateDifference(mapValues, myArray[i], myArray[i + 1]);
                i+=2;
            }
            //IX
            else if (myArray[i] == 'I' && myArray[i + 1] == 'X') {
                sum += calculateDifference(mapValues, myArray[i], myArray[i + 1]);
                i+=2;
            }
            //XL
            else if (myArray[i] == 'X' && myArray[i + 1] == 'L') {
                sum += calculateDifference(mapValues, myArray[i], myArray[i + 1]);
                i+=2;
            }
            //XC
            else if (myArray[i] == 'X' && myArray[i + 1] == 'C') {
                sum += calculateDifference(mapValues, myArray[i], myArray[i + 1]);
                i+=2;
            } else {
                sum += mapValues.get(myArray[i]);
                i++;
            }


        }

        return sum;
    }

    private int difference(int a, int b) {
        return abs(a - b);
    }

    private int calculateDifference(HashMap<Character, Integer> map, char a, char b) {

        int first = map.get(a);
        int last = map.get(b);
        return difference(first, last);


    }


}
