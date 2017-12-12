package koriit.training.extract;

import java.util.List;

public class ExtractField {

    public void print(List<String> list) {
        for (String element : list) {
            println(element);
        }
    }

    private void println(String element) {
        System.out.println(element);
    }
}
