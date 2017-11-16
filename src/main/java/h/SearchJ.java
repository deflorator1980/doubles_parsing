package h;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class SearchJ {
    public static void main(String[] args) throws IOException {
        String contents = new String(Files.readAllBytes(Paths.get("real_num_n.txt")), StandardCharsets.UTF_8);
        List<String> words = Arrays.asList(contents.split("\n"));

        for (int i = 0; i < words.size(); i++) {
            double word = Double.parseDouble(words.get(i));
            if(i == (int)word) {
                System.out.println(word);
            }
        }

    }
}
