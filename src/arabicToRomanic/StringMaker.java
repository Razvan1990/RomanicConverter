package arabicToRomanic;

import java.util.HashMap;

public class StringMaker {

    private ConstantsInversed constantsInversed = new ConstantsInversed();

    public String createRomanicNumber(HashMap<Integer, Integer> valueMap) {
        StringBuilder result = new StringBuilder();
        int mapLenght = valueMap.size();
        HashMap<Integer, String> romanicArabicMap = constantsInversed.equalityCharacterMap();

        switch (mapLenght) {
            case 4:
                for (int i : valueMap.keySet()) {
                    //need to traverse all the cases now

                    switch (i) {
                        case 1:
                            if (valueMap.get(i) == 1) {
                                result.append(romanicArabicMap.get(1000));
                            } else if (valueMap.get(i) == 2) {
                                result.append(romanicArabicMap.get(1000)).append(romanicArabicMap.get(1000));
                            } else if (valueMap.get(i) == 3) {
                                result.append(romanicArabicMap.get(1000)).append(romanicArabicMap.get(1000)).append(romanicArabicMap.get(1000));
                            }
                            break;
                        case 2:
                            if (valueMap.get(i) == 1) {
                                result.append(romanicArabicMap.get(100));
                            } else if (valueMap.get(i) == 2) {
                                result.append(romanicArabicMap.get(100)).append(romanicArabicMap.get(100));
                            } else if (valueMap.get(i) == 3) {
                                result.append(romanicArabicMap.get(100)).append(romanicArabicMap.get(100)).append(romanicArabicMap.get(100));
                            } else if (valueMap.get(i) == 4) {
                                result.append(romanicArabicMap.get(100)).append(romanicArabicMap.get(500));
                            } else if (valueMap.get(i) == 5) {
                                result.append(romanicArabicMap.get(500));
                            } else if (valueMap.get(i) == 6) {
                                result.append(romanicArabicMap.get(500)).append(romanicArabicMap.get(100));
                            } else if (valueMap.get(i) == 7) {
                                result.append(romanicArabicMap.get(500)).append(romanicArabicMap.get(100)).append(romanicArabicMap.get(100));
                            } else if (valueMap.get(i) == 8) {
                                result.append(romanicArabicMap.get(500)).append(romanicArabicMap.get(100)).append(romanicArabicMap.get(100)).append(romanicArabicMap.get(100));
                            } else if (valueMap.get(i) == 9) {
                                result.append(romanicArabicMap.get(100)).append(romanicArabicMap.get(1000));
                            }
                            break;

                        case 3:
                            if (valueMap.get(i) == 1) {
                                result.append(romanicArabicMap.get(10));
                            } else if (valueMap.get(i) == 2) {
                                result.append(romanicArabicMap.get(10)).append(romanicArabicMap.get(10));
                            } else if (valueMap.get(i) == 3) {
                                result.append(romanicArabicMap.get(10)).append(romanicArabicMap.get(10)).append(romanicArabicMap.get(10));
                            } else if (valueMap.get(i) == 4) {
                                result.append(romanicArabicMap.get(10)).append(romanicArabicMap.get(50));
                            } else if (valueMap.get(i) == 5) {
                                result.append(romanicArabicMap.get(50));
                            } else if (valueMap.get(i) == 6) {
                                result.append(romanicArabicMap.get(50)).append(romanicArabicMap.get(10));
                            } else if (valueMap.get(i) == 7) {
                                result.append(romanicArabicMap.get(50)).append(romanicArabicMap.get(10)).append(romanicArabicMap.get(10));
                            } else if (valueMap.get(i) == 8) {
                                result.append(romanicArabicMap.get(50)).append(romanicArabicMap.get(10)).append(romanicArabicMap.get(10)).append(romanicArabicMap.get(10));
                            } else if (valueMap.get(i) == 9) {
                                result.append(romanicArabicMap.get(10)).append(romanicArabicMap.get(100));
                            }
                            break;
                        case 4:
                            if (valueMap.get(i) == 1) {
                                result.append(romanicArabicMap.get(1));
                            } else if (valueMap.get(i) == 2) {
                                result.append(romanicArabicMap.get(1)).append(romanicArabicMap.get(1));
                            } else if (valueMap.get(i) == 3) {
                                result.append(romanicArabicMap.get(1)).append(romanicArabicMap.get(1)).append(romanicArabicMap.get(1));
                            } else if (valueMap.get(i) == 4) {
                                result.append(romanicArabicMap.get(1)).append(romanicArabicMap.get(5));
                            } else if (valueMap.get(i) == 5) {
                                result.append(romanicArabicMap.get(5));
                            } else if (valueMap.get(i) == 6) {
                                result.append(romanicArabicMap.get(5)).append(romanicArabicMap.get(1));
                            } else if (valueMap.get(i) == 7) {
                                result.append(romanicArabicMap.get(5)).append(romanicArabicMap.get(1)).append(romanicArabicMap.get(1));
                            } else if (valueMap.get(i) == 8) {
                                result.append(romanicArabicMap.get(5)).append(romanicArabicMap.get(1)).append(romanicArabicMap.get(1)).append(romanicArabicMap.get(1));
                            } else if (valueMap.get(i) == 9) {
                                result.append(romanicArabicMap.get(1)).append(romanicArabicMap.get(10));
                            }
                            break;
                    }
                }

                break;
            case 3:
                for (int i : valueMap.keySet()) {
                    //need to traverse all the cases now

                    switch (i) {
                        case 1:
                            if (valueMap.get(i) == 1) {
                                result.append(romanicArabicMap.get(100));
                            } else if (valueMap.get(i) == 2) {
                                result.append(romanicArabicMap.get(100)).append(romanicArabicMap.get(100));
                            } else if (valueMap.get(i) == 3) {
                                result.append(romanicArabicMap.get(100)).append(romanicArabicMap.get(100)).append(romanicArabicMap.get(100));
                            } else if (valueMap.get(i) == 4) {
                                result.append(romanicArabicMap.get(100)).append(romanicArabicMap.get(500));
                            } else if (valueMap.get(i) == 5) {
                                result.append(romanicArabicMap.get(500));
                            } else if (valueMap.get(i) == 6) {
                                result.append(romanicArabicMap.get(500)).append(romanicArabicMap.get(100));
                            } else if (valueMap.get(i) == 7) {
                                result.append(romanicArabicMap.get(500)).append(romanicArabicMap.get(100)).append(romanicArabicMap.get(100));
                            } else if (valueMap.get(i) == 8) {
                                result.append(romanicArabicMap.get(500)).append(romanicArabicMap.get(100)).append(romanicArabicMap.get(100)).append(romanicArabicMap.get(100));
                            } else if (valueMap.get(i) == 9) {
                                result.append(romanicArabicMap.get(100)).append(romanicArabicMap.get(1000));
                            }
                            break;

                        case 2:
                            if (valueMap.get(i) == 1) {
                                result.append(romanicArabicMap.get(10));
                            } else if (valueMap.get(i) == 2) {
                                result.append(romanicArabicMap.get(10)).append(romanicArabicMap.get(10));
                            } else if (valueMap.get(i) == 3) {
                                result.append(romanicArabicMap.get(10)).append(romanicArabicMap.get(10)).append(romanicArabicMap.get(10));
                            } else if (valueMap.get(i) == 4) {
                                result.append(romanicArabicMap.get(10)).append(romanicArabicMap.get(50));
                            } else if (valueMap.get(i) == 5) {
                                result.append(romanicArabicMap.get(50));
                            } else if (valueMap.get(i) == 6) {
                                result.append(romanicArabicMap.get(50)).append(romanicArabicMap.get(10));
                            } else if (valueMap.get(i) == 7) {
                                result.append(romanicArabicMap.get(50)).append(romanicArabicMap.get(10)).append(romanicArabicMap.get(10));
                            } else if (valueMap.get(i) == 8) {
                                result.append(romanicArabicMap.get(50)).append(romanicArabicMap.get(10)).append(romanicArabicMap.get(10)).append(romanicArabicMap.get(10));
                            } else if (valueMap.get(i) == 9) {
                                result.append(romanicArabicMap.get(10)).append(romanicArabicMap.get(100));
                            }
                            break;
                        case 3:
                            if (valueMap.get(i) == 1) {
                                result.append(romanicArabicMap.get(1));
                            } else if (valueMap.get(i) == 2) {
                                result.append(romanicArabicMap.get(1)).append(romanicArabicMap.get(1));
                            } else if (valueMap.get(i) == 3) {
                                result.append(romanicArabicMap.get(1)).append(romanicArabicMap.get(1)).append(romanicArabicMap.get(1));
                            } else if (valueMap.get(i) == 4) {
                                result.append(romanicArabicMap.get(1)).append(romanicArabicMap.get(5));
                            } else if (valueMap.get(i) == 5) {
                                result.append(romanicArabicMap.get(5));
                            } else if (valueMap.get(i) == 6) {
                                result.append(romanicArabicMap.get(5)).append(romanicArabicMap.get(1));
                            } else if (valueMap.get(i) == 7) {
                                result.append(romanicArabicMap.get(5)).append(romanicArabicMap.get(1)).append(romanicArabicMap.get(1));
                            } else if (valueMap.get(i) == 8) {
                                result.append(romanicArabicMap.get(5)).append(romanicArabicMap.get(1)).append(romanicArabicMap.get(1)).append(romanicArabicMap.get(1));
                            } else if (valueMap.get(i) == 9) {
                                result.append(romanicArabicMap.get(1)).append(romanicArabicMap.get(10));
                            }
                            break;
                    }
                }
                break;

            case 2:
                for (int i : valueMap.keySet()) {
                    //need to traverse all the cases now

                    switch (i) {
                        case 1:
                            if (valueMap.get(i) == 1) {
                                result.append(romanicArabicMap.get(10));
                            } else if (valueMap.get(i) == 2) {
                                result.append(romanicArabicMap.get(10)).append(romanicArabicMap.get(10));
                            } else if (valueMap.get(i) == 3) {
                                result.append(romanicArabicMap.get(10)).append(romanicArabicMap.get(10)).append(romanicArabicMap.get(10));
                            } else if (valueMap.get(i) == 4) {
                                result.append(romanicArabicMap.get(10)).append(romanicArabicMap.get(50));
                            } else if (valueMap.get(i) == 5) {
                                result.append(romanicArabicMap.get(50));
                            } else if (valueMap.get(i) == 6) {
                                result.append(romanicArabicMap.get(50)).append(romanicArabicMap.get(10));
                            } else if (valueMap.get(i) == 7) {
                                result.append(romanicArabicMap.get(50)).append(romanicArabicMap.get(10)).append(romanicArabicMap.get(10));
                            } else if (valueMap.get(i) == 8) {
                                result.append(romanicArabicMap.get(50)).append(romanicArabicMap.get(10)).append(romanicArabicMap.get(10)).append(romanicArabicMap.get(10));
                            } else if (valueMap.get(i) == 9) {
                                result.append(romanicArabicMap.get(10)).append(romanicArabicMap.get(100));
                            }
                            break;
                        case 2:
                            if (valueMap.get(i) == 1) {
                                result.append(romanicArabicMap.get(1));
                            } else if (valueMap.get(i) == 2) {
                                result.append(romanicArabicMap.get(1)).append(romanicArabicMap.get(1));
                            } else if (valueMap.get(i) == 3) {
                                result.append(romanicArabicMap.get(1)).append(romanicArabicMap.get(1)).append(romanicArabicMap.get(1));
                            } else if (valueMap.get(i) == 4) {
                                result.append(romanicArabicMap.get(1)).append(romanicArabicMap.get(5));
                            } else if (valueMap.get(i) == 5) {
                                result.append(romanicArabicMap.get(5));
                            } else if (valueMap.get(i) == 6) {
                                result.append(romanicArabicMap.get(5)).append(romanicArabicMap.get(1));
                            } else if (valueMap.get(i) == 7) {
                                result.append(romanicArabicMap.get(5)).append(romanicArabicMap.get(1)).append(romanicArabicMap.get(1));
                            } else if (valueMap.get(i) == 8) {
                                result.append(romanicArabicMap.get(5)).append(romanicArabicMap.get(1)).append(romanicArabicMap.get(1)).append(romanicArabicMap.get(1));
                            } else if (valueMap.get(i) == 9) {
                                result.append(romanicArabicMap.get(1)).append(romanicArabicMap.get(10));
                            }
                            break;
                    }
                }
                break;
            case 1:
                for (int i : valueMap.keySet()) {
                    //need to traverse all the cases now

                    switch (i) {
                        case 1:

                            if (valueMap.get(i) == 1) {
                                result.append(romanicArabicMap.get(1));
                            } else if (valueMap.get(i) == 2) {
                                result.append(romanicArabicMap.get(1)).append(romanicArabicMap.get(1));
                            } else if (valueMap.get(i) == 3) {
                                result.append(romanicArabicMap.get(1)).append(romanicArabicMap.get(1)).append(romanicArabicMap.get(1));
                            } else if (valueMap.get(i) == 4) {
                                result.append(romanicArabicMap.get(1)).append(romanicArabicMap.get(5));
                            } else if (valueMap.get(i) == 5) {
                                result.append(romanicArabicMap.get(5));
                            } else if (valueMap.get(i) == 6) {
                                result.append(romanicArabicMap.get(5)).append(romanicArabicMap.get(1));
                            } else if (valueMap.get(i) == 7) {
                                result.append(romanicArabicMap.get(5)).append(romanicArabicMap.get(1)).append(romanicArabicMap.get(1));
                            } else if (valueMap.get(i) == 8) {
                                result.append(romanicArabicMap.get(5)).append(romanicArabicMap.get(1)).append(romanicArabicMap.get(1)).append(romanicArabicMap.get(1));
                            } else if (valueMap.get(i) == 9) {
                                result.append(romanicArabicMap.get(1)).append(romanicArabicMap.get(10));
                            }
                            break;

                    }


                }
                break;

        }
        return result.toString();
    }
}