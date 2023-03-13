import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReaderFile {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("example2/example2.txt"))) {
                String line;
                while((line=reader.readLine())!=null) {
                    System.out.println(line);
                }
            } catch (IOException exception) {
                 exception.getMessage();
            }
    }
}
