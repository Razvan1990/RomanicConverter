import java.util.HashMap;

public class Constants {

    public final String correctChars = "MDCLXVI";

    public HashMap<Character, Integer> equalityCharacterMap() {
        HashMap<Character,Integer> myMap = new HashMap<>();
        myMap.put('M',1000);myMap.put('D',500);myMap.put('C',100);
        myMap.put('L',50);myMap.put('X',10);myMap.put('V',5);myMap.put('I',1);
        return myMap;
    }
}
