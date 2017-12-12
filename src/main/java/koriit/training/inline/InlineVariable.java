package koriit.training.inline;

import koriit.training.fixtures.File;

public class InlineVariable {

    public void print(File file) {
        String header = file.getHeader();
        System.out.print(header);

        // ...
    }
}
