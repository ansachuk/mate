package hw.bits;

public class MathByte {
    static public String toBinaryString(int value) {
        StringBuilder res = new StringBuilder();
        do {
            res.append(value % 2);
            value /= 2;
        } while (value != 0);

        return res.reverse().toString();
    }

    public static int fromBinaryString(String value){
        if (value == null) {
            return 0;
        }

        char[] arr = new StringBuilder(value).reverse().toString().toCharArray();

        int res = 0;

        for (int i = 0; i < arr.length; i++) {
            int number = arr[i] - '0';
            int multiplyResult = number << i;
            res += multiplyResult;
        }

        return res;
    }

    public boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        return (!a && !b && c && d)
                || (!a && b && !c && d)
                || (!a && b && c && !d)
                || (a && !b && !c && d)
                || (a && !b && c && !d)
                || (a && b && !c && !d);
    }

}
