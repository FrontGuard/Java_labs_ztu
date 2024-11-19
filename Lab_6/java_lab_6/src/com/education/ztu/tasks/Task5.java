package com.education.ztu.tasks;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Task5 {

    // Метод для роботи з RandomAccessFile
    public static void modifyFile(String filePath, long position, String textToAdd) {
        try (RandomAccessFile file = new RandomAccessFile(filePath, "rw")) {

            // Перевіряємо, чи позиція в файлі є валідною
            if (position > file.length()) {
                System.err.println("Position exceeds file size. Text will be appended to the end of the file.");
                position = file.length();
            }

            // Читаємо вміст файлу після вказаної позиції
            file.seek(position);
            byte[] remainingBytes = new byte[(int) (file.length() - position)];
            file.readFully(remainingBytes);

            // Повертаємося до позиції та записуємо текст
            file.seek(position);
            file.write(textToAdd.getBytes());

            // Записуємо назад збережений вміст після доданого тексту
            file.write(remainingBytes);

            System.out.println("Text added successfully at position " + position);

        } catch (IOException e) {
            System.err.println("Error modifying file: " + e.getMessage());
        }
    }

    // Метод для тестування функціоналу
    public static void run() {
        String filePath = "directory_for_files/test_file.txt";

        // Створюємо тестовий файл, якщо його немає
        File file = new File(filePath);
        if (!file.exists()) {
            try {
                if (file.createNewFile()) {
                    System.out.println("Test file created: " + filePath);
                }
            } catch (IOException e) {
                System.err.println("Error creating test file: " + e.getMessage());
            }
        }

        // Додаємо текст у кілька позицій у файлі
        modifyFile(filePath, 0, "Start of the file.\n");
        modifyFile(filePath, 10, "Inserted text.\n");
        modifyFile(filePath, file.length(), "End of the file.\n");
    }
}
