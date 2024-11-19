package com.education.ztu.tasks;

import java.io.*;

public class Task4 {

    // Метод для копіювання текстового файлу
    public static void copyTextFile(String sourceFile, String destinationFile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            System.out.println("Text file copied successfully from " + sourceFile + " to " + destinationFile);

        } catch (IOException e) {
            System.err.println("Error copying text file: " + e.getMessage());
        }
    }

    // Метод для копіювання зображення або іншого файлу
    public static void copyBinaryFile(String sourceFile, String destinationFile) {
        try (FileInputStream inputStream = new FileInputStream(sourceFile);
             FileOutputStream outputStream = new FileOutputStream(destinationFile)) {

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

            System.out.println("Binary file copied successfully from " + sourceFile + " to " + destinationFile);

        } catch (IOException e) {
            System.err.println("Error copying binary file: " + e.getMessage());
        }
    }

    // Метод для тестування функціоналу
    public static void run() {
        // Шлях до файлів
        String textSource = "directory_for_files/source_text.txt";
        String textDestination = "directory_for_files/destination_text.txt";

        String imageSource = "directory_for_files/source_image.jpg";
        String imageDestination = "directory_for_files/destination_image.jpg";

        // Копіювання текстового файлу
        copyTextFile(textSource, textDestination);

        // Копіювання зображення
        copyBinaryFile(imageSource, imageDestination);
    }
}
