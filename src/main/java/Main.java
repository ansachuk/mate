import core.hw.practice.HashMapUsage;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> data = new HashMap<>();
        data.put("myhelloworld", 4);
        data.put("Hello", 7);
        data.put("AwesomeString", 8);
        data.put("Wow!!!! HELLO", 9);

        //Результатом буде 4 + 7 + 9 = 20.
        //Зверни увагу:

        int hello = HashMapUsage.calculateSum(data, "hello");
        System.out.println(hello);
    }
}
