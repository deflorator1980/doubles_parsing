package h;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchJ {
    public static void main(String[] args) throws IOException {
//        String contents = new String(Files.readAllBytes(Paths.get("real_num_n.txt")), StandardCharsets.UTF_8);
//        List<String> words = Arrays.asList(contents.split("\n"));
//
//        for (int i = 0; i < words.size(); i++) {
//            double word = Double.parseDouble(words.get(i));
//            if(i == (int)word) {
//                System.out.println(word);
//            }
//        }
        SearchJ searchJ = new SearchJ();
        System.out.println(searchJ.get_double());

    }

    public List<Double> get_double() throws IOException {
//        String contents = new String(Files.readAllBytes(Paths.get("real_num_n.txt")), StandardCharsets.UTF_8);
        String contents = new String(Files.readAllBytes(Paths.get("/home/a/Documents/My/doubles_parsing/real_num_n.txt")), StandardCharsets.UTF_8);
        List<String> words = Arrays.asList(contents.split("\n"));
        List<Double> result = new ArrayList<>();
        for (int i = 0; i < words.size(); i++) {
            double word = Double.parseDouble(words.get(i));
            if(i == (int)word) {
                result.add(word);
            }
        }
        return result;
    }
}

