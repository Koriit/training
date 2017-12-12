package koriit.training.extract;

import koriit.training.fixtures.File;

public class ExtractConstant {

    public void print(File file) {
        print(file.getHeader() + "\n");

        for (String line : file.getContent()) {
            print(line + "\n");
        }

        print(file.getFooter() + "\n");
    }


    private void print(String element) {
        System.out.print(element);
    }
}
