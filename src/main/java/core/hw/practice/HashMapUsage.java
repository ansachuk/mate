package core.hw.practice;

import java.util.Map;
import java.util.Set;

//У цьому завданні реалізуй метод calculateSum(), у якому підрахуй суму значень Integer
//переданого хешмапу, де ключ містить keyPart.
//Наприклад, якщо keyPart = "hello" і хешмап має такий вміст:


//якщо хешмап порожній, поверни 0;
//якщо keyPart порожній, поверни суму всіх Integer.

public class HashMapUsage {
    public static int calculateSum(Map<String, Integer> data, String keyPart) {
        Set<Map.Entry<String, Integer>> entries = data.entrySet();
        int sum = 0;

        if (entries.isEmpty()) {
            return 0;
        }

        for (Map.Entry<String, Integer> entry : entries) {
            if (keyPart != null) {
                if (entry.getKey().toLowerCase().contains(keyPart.toLowerCase())) {
                    sum += entry.getValue();
                }
            } else {
                sum += entry.getValue();
            }
        }

        return sum;
    }
}
