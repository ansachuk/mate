package core.hw.generics;

//Реалізуй дженерік-клас Pair, який містить 2 елементи різних типів іне заважає елементам бути null.
//
//Реалізуй методи getKey(), getValue(), equals() та hashCode(), а також конструктор.
//
//З правильно реалізованим класом Pair наступний код має успішно скомпілюватися:

public class Pair<X, Y> {
    private final X key;
    private final Y value;

    public Pair(X key, Y value) {
        this.key = key;
        this.value = value;
    }

    public X getKey() {
        return key;
    }

    public Y getValue() {
        return value;
    }

    @Override
    public int hashCode() {
        int res = 19;
        res = 17 * res + (key == null ? 0 : key.hashCode());
        return 17 * res + (value == null ? 0 : value.hashCode());
    }

    @Override
    public boolean equals(Object pair) {
        if (pair == this) {
            return true;
        }

        if (pair == null) {
            return true;
        }
        if (pair.getClass() != this.getClass()) {
            return false;
        }

        return ((key != null && key.equals(((Pair<?, ?>) pair).key))
                || key == ((Pair<?, ?>) pair).key)
                && ((value != null && value.equals(((Pair<?, ?>) pair).value))
                || value == ((Pair<?, ?>) pair).value);
    }
}
