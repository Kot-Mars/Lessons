import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main3 {
    public static void main(String[] args) {
        try {
            File directory = new File("example2");
            File file = new File("example2/example2.txt");
            if(directory.mkdir()) {
                System.out.println("Directory create " + directory.getName());
                if(file.createNewFile()) {
                    System.out.println("File create " + file.getName());
                }
                else {
                    System.out.println("File created " + file.getName());
                }
            } else {
                System.out.println("Directory created " + file.getName());
            }
            FileWriter writer = new FileWriter(file);
            writer.write("Hello world!");
            writer.close();
            System.out.print("Click button... ");
            System.in.read();
            if(file.delete()) {
                System.out.println("File delete " + directory.getName());
            } else {
                System.out.println("File does not exist " + directory.getName());
            }
            if(directory.delete()) {
                System.out.println("Directory delete " + directory.getName());
            } else {
                System.out.println("Directory does not exist " + directory.getName());
            }
        } catch (IOException exception) {
            exception.getMessage();
        }
    }
}
