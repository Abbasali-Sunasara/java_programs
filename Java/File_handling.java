import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class File_handling {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("Java.txt");
            writer.write("Java is a high level, programming language.");
            writer.close();
            System.out.println("File is created.");
        } catch (IOException e) {
            System.out.println("File is not created.");
            e.printStackTrace();
        }

        try {
            BufferedReader read_java = new BufferedReader(new FileReader("Java.txt"));
            String temp;
            while ((temp = read_java.readLine()) != null) {
                System.out.println(temp);
            }
            read_java.close();
        } catch (IOException e) {
            System.out.println("Error reading the file.");
            e.printStackTrace();
        }
    }
}
