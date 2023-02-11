package org.patterns.structural.decorator.javaIO;

import java.io.*;

public class TestIO {

    public static void main(String[] args) throws IOException {
        File file = new File("src/main/resources/dest3.txt");
        file.createNewFile();
        try (FileInputStream fileInputStream = new FileInputStream("src/main/resources/source.txt");
             FileOutputStream fileOutputStream = new FileOutputStream(file, true);
             DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream)) {
            int content;
            while ((content = fileInputStream.read()) != -1) {
                System.out.print((char) content);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
