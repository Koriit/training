package koriit.training.rename;

import java.util.List;

public class RenameMethod {

    public void print(List<String> file) {
        someMethod(file);
    }

    private void someMethod(List<String> file) {
        for (String line : file) {
            System.out.println(line);
        }
    }
}
