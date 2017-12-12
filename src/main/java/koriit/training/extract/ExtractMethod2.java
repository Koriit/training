package koriit.training.extract;

import koriit.training.fixtures.File;

import java.util.List;

public class ExtractMethod2 {

    public void getFile(List<String> content) {
        // ...

        File file = new File();
        file.setContent(content);
        file.setLineSeparator("\n");
        file.setFilename("SomeFile.ext");

        // ...

        doSomethingWithFile(file);

        // ...
    }

    private void doSomethingWithFile(File file) {
        // Do something
    }
}
