import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> array = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("file.txt"));

            String line = reader.readLine();
            while (line != null) {
                array.add(line);
                line = reader.readLine();
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(array);

        Collections.sort(array);

        System.out.println(array);
    }
}
