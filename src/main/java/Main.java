import hw.io.WorkWithBytes;

public class Main {
    public static void main(String[] args) {
        WorkWithBytes bytes = new WorkWithBytes();

        String[] arr = new String[]{"AAA", "bbb", "CcC"};

        for (String el : arr) {
            bytes.writeBytesToFile("src/test.txt", el.getBytes());
        }
    }
}
