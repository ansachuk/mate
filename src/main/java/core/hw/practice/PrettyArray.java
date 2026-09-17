package core.hw.practice;

public class PrettyArray {
    public static boolean isArrayPretty(int[] array) {
        if (array.length == 0){
            return false;
        }
        for (int item : array) {
            boolean isCurrentIntPretty = false;

            for (int innerItem : array) {
                if (innerItem == item + 1 || innerItem == item - 1) {
                    isCurrentIntPretty = true;
                    break;
                }
            }

            if (!isCurrentIntPretty) {
                return false;
            }

        }
        return true;
    }
}
