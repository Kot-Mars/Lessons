import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main2 {
    public static void main(String[] args) {
        try {
            File file = new File("example.txt");
            if(file.createNewFile()) {
                System.out.println("Файл создан " + file.getName());
            } else {
                System.out.println("Файл уже есть " + file.getName());
            }
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("New String");
            fileWriter.close();
        } catch (IOException e) {
            e.getMessage();
        }
    }
}
