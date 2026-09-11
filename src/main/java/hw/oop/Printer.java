package hw.oop;

import java.util.Arrays;

class Printer {

    /**
     * Ми створили клас Printer. Він має друкувати різні дані, тому має метод print(). Однак наш клас може працювати з різними типами даних:
     * якщо на вхід приходить рядок, то метод повертає цей рядок;
     * якщо на вхід приходить int або double число, то метод повертає це число у вигляді рядка;
     * якщо на вхід приходить рядок та ціле число (int), то метод повертає рядок у форматі <рядок> and <число>;
     * якщо на вхід приходить масив рядків, то метод повертає рядок із вмістом вхідного масиву (використай метод Arrays.toString()).
     * Ми вже створили метод, який приймає рядок. Додаси методи для інших вхідних даних?
     */

    public String print(String message) {
        return message;
    }

    public String print(int message) {
        return Integer.valueOf(message).toString();
    }

    public String print(double message) {
        return Double.valueOf(message).toString();
    }

    public String print(String message1, int message2) {
        return new StringBuilder(message1).append(" and ").append(message2).toString();
    }

    public String print(String[] messages) {
        return Arrays.toString(messages);
    }

}
