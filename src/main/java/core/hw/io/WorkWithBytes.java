package core.hw.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

public class WorkWithBytes {
    //Тепер потренуймося записувати масив байтів у файл та реалізуємо метод writeBytesToFile(),
    // який приймає 2 параметри:
    //String fileName — це назва файлу, куди потрібно записати масив байтів;
    //byte[] data — це дані, які потрібно записати.
    //Зверни увагу: не перетворюй байти на String. У файл потрібно записати саме byte[].
    public void writeBytesToFile(String fileName, byte[] data) {
        File file = new File(fileName);

        try {
            Files.write(file.toPath(), data, StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException("Can't write to file " + fileName, e);
        }
    }
}
