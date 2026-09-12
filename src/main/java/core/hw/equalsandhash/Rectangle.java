package core.hw.equalsandhash;

public record Rectangle(Integer width, Integer length, String color) {

    //    Ми створили клас Rectangle. Тобі потрібно перевизначити його 2 методи: equals()
    //    та hashCode().
    //    equals() має порівнювати об’єкти Rectangle за його полями: width, length та color.
    //    Також переконайся, що ти дотримуєшся контракту між equals() та hashCode().

    @Override
    public boolean equals(Object rect) {
        if (rect == this) {
            return true;
        }
        if (rect == null) {
            return false;
        }
        if (getClass() != rect.getClass()) {
            return false;
        }

        return ((color != null && color.equals(((Rectangle) rect).color))
                || color == ((Rectangle) rect).color)
                && ((width != null && width.equals(((Rectangle) rect).width))
                || width == ((Rectangle) rect).width)
                && ((length != null && length.equals(((Rectangle) rect).length))
                || length == ((Rectangle) rect).length);
    }

}
