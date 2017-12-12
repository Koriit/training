package koriit.training.extract;

import koriit.training.fixtures.File;

public class ExtractVariable {

    public void print(File file) {
        print(file.getHeader() + file.getLineSeparator());

        for (String line : file.getContent()) {
            print(line + file.getLineSeparator());
        }

        print(file.getFooter() + file.getLineSeparator());
    }


    private void print(String element) {
        System.out.print(element);
    }
}
