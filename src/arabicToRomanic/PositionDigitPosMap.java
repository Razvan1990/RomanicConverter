package arabicToRomanic;

import java.util.HashMap;

public class PositionDigitPosMap {
    private IntroduceNumber introduceNumber;

   public PositionDigitPosMap(){
       this.introduceNumber = new IntroduceNumber();
   }



    public HashMap<Integer, Integer> putPositionAndDigits(){
        HashMap<Integer, Integer>positionDigitMap = new HashMap<>();

        int introducedNumber = introduceNumber.giveNumber();

        int temp = introducedNumber;
        int countDigits = 0;

        //make the keys to have the order of elements to be easier to traverse ex: 1864-> key 1 is 1 key 2 is 8 and not vice versa

        while(temp!=0){
            temp/=10;
            countDigits++;
        }


        while(introducedNumber!=0){
            int digit = introducedNumber %10;
            positionDigitMap.put(countDigits, digit);
            introducedNumber/=10;
            countDigits--;
        }
        return positionDigitMap;
    }
}
