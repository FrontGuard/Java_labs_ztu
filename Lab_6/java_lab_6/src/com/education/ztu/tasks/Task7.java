package com.education.ztu.tasks;

import java.io.*;
import java.util.zip.*;

public class Task7 {

    public static void run() {
        // Шляхи до директорії та архіву
        String directoryPath = "directory_for_files";
        String zipFilePath = "directory_for_files/archive.zip";

        // Створення архіву
        try (FileOutputStream fos = new FileOutputStream(zipFilePath);
             ZipOutputStream zos = new ZipOutputStream(fos)) {

            File directory = new File(directoryPath);
            File[] files = directory.listFiles();

            if (files != null) {
                for (File file : files) {
                    // Виключаємо сам архів
                    if (file.isFile() && !file.getName().equals("archive.zip")) {
                        addFileToZip(file, zos);
                    }
                }
            }

            System.out.println("Archive created successfully: " + zipFilePath);

        } catch (IOException e) {
            System.err.println("Error creating archive: " + e.getMessage());
        }

        // Читання вмісту архіву
        try (FileInputStream fis = new FileInputStream(zipFilePath);
             ZipInputStream zis = new ZipInputStream(fis)) {

            System.out.println("Contents of the archive:");
            ZipEntry entry;
            while ((entry = zis.getNextEntry()) != null) {
                System.out.println("- " + entry.getName());
            }

        } catch (IOException e) {
            System.err.println("Error reading archive: " + e.getMessage());
        }
    }

    // Додати файл до архіву
    private static void addFileToZip(File file, ZipOutputStream zos) throws IOException {
        try (FileInputStream fis = new FileInputStream(file)) {
            ZipEntry zipEntry = new ZipEntry(file.getName());
            zos.putNextEntry(zipEntry);

            byte[] buffer = new byte[1024];
            int length;
            while ((length = fis.read(buffer)) > 0) {
                zos.write(buffer, 0, length);
            }

            zos.closeEntry();
        }
    }
}
