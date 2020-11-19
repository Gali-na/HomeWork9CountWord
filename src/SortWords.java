import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortWords {
    public static void sort(String file) {
        String dataFtomFile = "";
        try (BufferedReader fileRead = new BufferedReader(new FileReader("Text.txt"))) {
            while (fileRead.read() != -1) {
                dataFtomFile = dataFtomFile + fileRead.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        parsingStringWords(dataFtomFile);
    }

    private static void parsingStringWords(String dataFtomFile) {
        String wordWithFile = dataFtomFile.replaceAll("[^A-Za-z]", "");
        char[] arryChars = wordWithFile.toCharArray();
        Arrays.sort(arryChars);
        char element = arryChars[0];
        LetterComperator letterComperator = new LetterComperator();
        List<LetterPosition> letterPositions = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < arryChars.length; i++) {
            if (arryChars[i] == element) {
                count++;
            } else {
                char cuttentElement = element;
                LetterPosition letterPosition = new LetterPosition(cuttentElement, count);
                letterPositions.add(letterPosition);

                element = arryChars[i];
                count = 1;
            }
        }
        letterPositions.sort(letterComperator);
        System.out.println(letterPositions);
    }
}
