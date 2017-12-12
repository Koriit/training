package koriit.training.inline;

import koriit.training.fixtures.File;

public class InlineMethod {

    public void print(File file) {
        String eol = file.getLineSeparator();

        for (String line : file.getContent()) {
            print(line + eol);
        }
    }


    private void print(String element) {
        System.out.print(element);
    }
}
