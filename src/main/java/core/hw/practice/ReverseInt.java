package core.hw.practice;

public class ReverseInt {
    public static int[] toArrayOfDigits(int n) {
        String reversed = new StringBuilder(String.valueOf(n)).reverse().toString();
        String[] stringArray = reversed.split("");
        int[] res = new int[n < 0 ? stringArray.length - 1 : stringArray.length];

        for (int i = 0; i < stringArray.length; i++){
            if (stringArray[i].equals("-")){
                continue;
            }
            res[i] = Integer.valueOf(stringArray[i]);
        }
        return res;
    }
}
