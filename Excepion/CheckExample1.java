package Excepion;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckExample1 {

    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("file.txt");
            int data = reader.read();
            System.out.println(data);
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
