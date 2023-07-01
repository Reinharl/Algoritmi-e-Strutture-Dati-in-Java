import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.print("Inserisci il " + (i + 1) + "' numero: ");
            list.add(sc.nextInt());
        }

        // Scrivo nel file la lista di numeri
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("file.txt"));

            for (Integer value : list) {
                writer.write(value.toString() + "\n");
            }

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Leggo e ordino in una nuova lista i numeri letti dal file precedente
        List<Integer> orderedList = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
            String line = reader.readLine();

            while (line != null) {
                orderedList.add(Integer.parseInt(line));
                line = reader.readLine();
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Collections.sort(orderedList);

        // Scrivo in un secondo file la lista ordinata
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("orderedFile.txt"));

            for (Integer value : orderedList) {
                writer.write(value.toString() + "\n");
            }

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
