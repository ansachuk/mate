package core.hw.practice;

public class CountOccurrences {
    public static int countOccurrences(String str, String substr) {
        int counter = 0;

        char[] stringChars = str.toCharArray();
        char[] substringChars = substr.toCharArray();

        for (int i = 0; i < stringChars.length; i++) {
            boolean isEveryCharEqual = false;
            if (stringChars[i] == substringChars[0]){
                for (int k = 0; k < substringChars.length; k++){
                    if (i + k >= stringChars.length){
                        isEveryCharEqual = false;
                        break;
                    }
                    if (stringChars[i + k] != substringChars[k]){
                        isEveryCharEqual = false;
                        break;
                    } else {
                        isEveryCharEqual = true;
                    }
                }
                if (isEveryCharEqual){
                    counter++;
                }
            }
        }
        System.out.println(counter);
        return counter;
    }
}

