package koriit.training.extract;

import koriit.training.fixtures.File;

public class ExtractParameter {

    public void print(File file) {
        print(file.getHeader(), file);

        for (String line : file.getContent()) {
            print(line, file);
        }

        print(file.getFooter(), file);
    }


    private void print(String element, File file) {
        System.out.print(element + file.getLineSeparator());
    }
}
