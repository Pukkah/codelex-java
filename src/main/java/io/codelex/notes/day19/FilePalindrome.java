package io.codelex.notes.day19;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilePalindrome {
    public static void reverseFile(String filePath) throws IOException {
        Path path = Paths.get(filePath);
        String fileContents = Files.readString(path);
        String newFileContents = reverse(fileContents);
        String fileName = path.toFile().getName();
        String directory = path.toFile().getParent();
        Path newPath = Paths.get(directory + "/" + getNewFileName(fileName));
        Files.write(newPath, newFileContents.getBytes());
    }

    private static String getNewFileName(String fileName) {
        if (fileName.contains(".")) {
            int dot = fileName.lastIndexOf(".");
            String fileTitle = fileName.substring(0, dot);
            String extension = fileName.substring(dot);
            fileName = reverse(fileTitle) + extension;
        } else {
            fileName = reverse(fileName);
        }
        return fileName;
    }

    private static String reverse(String string) {
        return new StringBuilder(string).reverse().toString();
    }

}
