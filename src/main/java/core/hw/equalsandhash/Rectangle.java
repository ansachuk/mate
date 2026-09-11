package core.hw.equalsandhash;

import java.util.Objects;

public class Rectangle {
    private final Integer width;
    private final Integer length;
    private final String color;

//    Ми створили клас Rectangle. Тобі потрібно перевизначити його 2 методи: equals() та hashCode().
//    equals() має порівнювати об’єкти Rectangle за його полями: width, length та color.
//    Також переконайся, що ти дотримуєшся контракту між equals() та hashCode().

    public Rectangle(Integer width, Integer length, String color) {
        this.width = width;
        this.length = length;
        this.color = color;
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getLength() {
        return length;
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object rect) {
        if (rect == this) return true;
        if (rect == null) return false;
        if (getClass() != rect.getClass()) return false;

        return ((color != null && color.equals(((Rectangle) rect).color)) || color == ((Rectangle) rect).color)
                && ((width != null && width.equals(((Rectangle) rect).width)) || width == ((Rectangle) rect).width)
                && ((length != null && length.equals(((Rectangle) rect).length)) || length == ((Rectangle) rect).length);
    }

    @Override
    public int hashCode() {
        int res = 19;
        res = 31 * res + (color == null ? 0 : color.hashCode());
        res = 31 * res + (width == null ? 0 : width.hashCode());
        return 31 * res + (length == null ? 0 : length.hashCode());
    }
}
