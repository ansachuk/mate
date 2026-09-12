import core.hw.generics.Pair;

public class Main {
    public static void main(String[] args) {

        Pair<Integer, String> pair = new Pair<>(1, "hello");
        Integer key = pair.getKey(); // 1
        String value = pair.getValue(); // "hello"

        Pair<Integer, String> secondPair = new Pair<>(1, "hello");
        boolean mustBeTrue = pair.equals(secondPair); // true!
        boolean mustAlsoBeTrue = pair.hashCode() == secondPair.hashCode(); // true!
        System.out.println(key);
        System.out.println(value);
        System.out.println(mustAlsoBeTrue);
        System.out.println(mustBeTrue);

    }
}
