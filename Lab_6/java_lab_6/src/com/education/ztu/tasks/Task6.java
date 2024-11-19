package com.education.ztu.tasks;

import java.io.File;
import java.io.IOException;

public class Task6 {

    public static void run() {
        // Папка для створення та маніпуляцій
        String parentDirectory = "directory_for_files";
        String innerDirectoryName = "inner_directory";
        String renamedDirectoryName = "renamed_inner_directory";

        // Шлях до папки
        File innerDirectory = new File(parentDirectory, innerDirectoryName);

        // Створення нової папки
        if (!innerDirectory.exists()) {
            if (innerDirectory.mkdir()) {
                System.out.println("Directory created: " + innerDirectory.getAbsolutePath());
            } else {
                System.err.println("Failed to create directory: " + innerDirectory.getAbsolutePath());
            }
        }

        // Виведення абсолютного шляху та батьківської директорії
        System.out.println("Absolute Path: " + innerDirectory.getAbsolutePath());
        System.out.println("Parent Directory: " + innerDirectory.getParent());

        // Створення двох текстових файлів у папці
        File file1 = new File(innerDirectory, "file1.txt");
        File file2 = new File(innerDirectory, "file2.txt");

        try {
            if (file1.createNewFile()) {
                System.out.println("File created: " + file1.getAbsolutePath());
            }
            if (file2.createNewFile()) {
                System.out.println("File created: " + file2.getAbsolutePath());
            }
        } catch (IOException e) {
            System.err.println("Error creating files: " + e.getMessage());
        }

        // Видалення одного з файлів
        if (file1.exists() && file1.delete()) {
            System.out.println("File deleted: " + file1.getName());
        } else {
            System.err.println("Failed to delete file: " + file1.getName());
        }

        // Перейменування папки
        File renamedDirectory = new File(parentDirectory, renamedDirectoryName);
        if (innerDirectory.renameTo(renamedDirectory)) {
            System.out.println("Directory renamed to: " + renamedDirectory.getAbsolutePath());
        } else {
            System.err.println("Failed to rename directory: " + innerDirectory.getName());
        }

        // Виведення вмісту папки directory_for_files
        File parentDir = new File(parentDirectory);
        System.out.println("Contents of " + parentDir.getAbsolutePath() + ":");
        File[] filesAndDirs = parentDir.listFiles();
        if (filesAndDirs != null) {
            for (File file : filesAndDirs) {
                System.out.println((file.isFile() ? "[File] " : "[Directory] ") + file.getName() + " - Size: " + file.length() + " bytes");
            }
        } else {
            System.err.println("Failed to list contents of directory: " + parentDirectory);
        }
    }
}
