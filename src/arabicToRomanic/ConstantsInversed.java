package arabicToRomanic;

import java.util.HashMap;

public class ConstantsInversed {

    public HashMap<Integer, String> equalityCharacterMap() {
        HashMap<Integer,String> myMap = new HashMap<>();
        myMap.put(1000,"M");myMap.put(500,"D");myMap.put(100,"C");
        myMap.put(50,"L");myMap.put(10,"X");myMap.put(5,"V");myMap.put(1,"I");
        return myMap;
    }
}
