package koriit.training.extract;

import koriit.training.fixtures.File;

public class ExtractParameter2 {

    public void print(File file, String prefix) {
        print(file.getHeader(), file.getLineSeparator());

        for (String line : file.getContent()) {
            print(line, file.getLineSeparator());
        }

        print(file.getFooter(), file.getLineSeparator());

        // Do something else with prefix...
    }


    private void print(String element, String lineSeparator) {
        System.out.print(element + lineSeparator);
    }
}
