package romanicToArabic;

import com.sun.org.apache.regexp.internal.RE;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CheckInput {

    private Constants constants = new Constants();


    public CheckInput() {
//        char mNumber = 1000;
//        char dNumber = 500;
//        char cNumber = 100;
//        char lNumber = 50;
//        char xNumber = 10;
//        char vNumber = 5;
//        char iNumber = 1;
    }

    //method to return number of consecutive characters introduced

    public boolean numberOfConsecutiveCharacters(String s) {
        boolean isValidNumber = false;
        List<Character> characterList = new ArrayList<>();
        int first = 0;
        int last = 0;
        int result = 0;
        char[] charArray = s.toCharArray();

        while (last <= charArray.length - 1 && first<=charArray.length-1) {
            if (charArray[first] == charArray[last]) {
                characterList.add(charArray[first]);
                first++;
                result = Math.max(result, characterList.size());
            } else {
                characterList.clear();
                last++;
            }
        }
        //System.out.println(result);
        if (result <= 3) {
            isValidNumber = true;
            return isValidNumber;

        }
        System.out.println("More than 3 characters once after another");
        return isValidNumber;

    }


    //method do not add incorrect characters

    public boolean checkUnwantedCharacters(String s) {
        List<Character> wantedCharactersList = new ArrayList<>();
        char[] charsArray = constants.correctChars.toCharArray();

        for (char c : charsArray) {
            wantedCharactersList.add(c);
        }

        for (int i = 0; i < s.length(); i++) {
            if (!wantedCharactersList.contains(s.charAt(i))) {
                System.out.println("Not a correct character introduced");
                return false;
            }
        }

        return true;
    }

    /**
     * This methods are not ok for this part
     * @param s
     * @return
     */
    //not ok, the first method is ok, cause we can have more than
    public boolean checkFrequencyOfCharacters(String s) {
        boolean canContinue = checkUnwantedCharacters(s);
        if (canContinue) {
            boolean isOk = true;
            HashMap<Character, Integer> myMap = new HashMap<>();
            char[] charactersArray = s.toCharArray();

            for (char c : charactersArray) {
                if (myMap.containsKey(c)) {
                    myMap.put(c, myMap.get(c) + 1);
                } else {
                    myMap.put(c, 1);
                }
            }

            for (char mapCharacter : myMap.keySet()) {
                if (myMap.get(mapCharacter) > 3) {
                    System.out.println("You have introduced more than 3 " + mapCharacter);
                    isOk = false;
                }
            }
            return isOk;


        } else {
            return false;
        }


    }

    //add to the string an empty space to not get index out of bounds when calculating sum

    public String addExtraSpace(String s){
        String newString ="";
        String space = " ";
        //char charArray [] = s.toCharArray();
        newString = s + space;
        return newString;


    }
    //transform string as it should even if not introduced correct by user
    //not correct cause we need to calculate properly
    public String putCorrectString(String s){
        boolean canContinueCharacters = checkFrequencyOfCharacters(s);
        char [] introducedWordArray = s.toCharArray();
        char [] correctCharsArray = constants.correctChars.toCharArray();
        //put in this list all the values of each characters and then use it to sort it in reverse order
        List<Integer>stringValuesList = new ArrayList<>();
        List<Character> arrangedString = new ArrayList<>();
        HashMap<Character, Integer>characterNumberMap = constants.equalityCharacterMap();
        //boolean areOkIntroduced = true;
        StringBuilder arrangedInputString = new StringBuilder();


        if(canContinueCharacters){
            for(int i =0;i<introducedWordArray.length;i++){
                //here we put all the values in the map;
                stringValuesList.add(characterNumberMap.get(introducedWordArray[i]));
            }
            sortListDescendingOrder(stringValuesList);

            //get key from value;

            for(int i =0;i<stringValuesList.size();i++){
                arrangedString.add(getKey(characterNumberMap, stringValuesList.get(i)));
            }


            for (int i =0;i<arrangedString.size();i++){
                arrangedInputString.append(arrangedString.get(i).toString());
            }
            return arrangedInputString.toString();
        }
        return "";
    }



   public void sortListDescendingOrder(List<Integer>numbersList){
        for (int i =0;i<numbersList.size();i++){
            for(int j =0;j<numbersList.size();j++){
                if(numbersList.get(i)>numbersList.get(j)){
                    int temp = numbersList.get(i);
                    numbersList.set(i,numbersList.get(j));
                    numbersList.set(j,temp);

                }
            }
        }
    }
//take the key based on a value of a map
    private <K,V> K getKey(Map<K,V> map, V value){
        for(Map.Entry<K, V> entry: map.entrySet()){
            if (value.equals(entry.getValue())){
                return entry.getKey();
            }
        }
        return null;
    }
}

