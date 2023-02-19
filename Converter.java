public class Converter {
    static  String[] romArray = new String[]{"0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
            "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXIV", "XXV", "XXVII", "XXVIII",
            "XXX", "XXXII", "XXXV", "XXXVI", "XL", "XLII", "XLV", "XLVIII", "XLIX", "L", "LIV", "LVI", "LX", "LXIII", "LXIV",
            "LXX", "LXXII", "LXXX", "LXXXI", "XC", "C"};
    public static boolean roman(String input){
        for (int i = 0; i < romArray.length; i++){
            if (input.equals(romArray[i])){
                return true;
            }
        }
        return false;
    }
    public static int convArabian(String roman){
        for (int i = 0; i < romArray.length; i++){
            if (roman.equals(romArray[i])){
                return i;
            }
        }
        return -1;
    }
    public static String convRoman(int arab){
        return romArray[arab];
    }

}
