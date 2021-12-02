package Florist.Flower.IOStream;

import java.io.InputStream;
import java.io.OutputStream;

public class IOStream {
    private InputStream inputstream;

    private OutputStream outputStream;

    private String path;

    public IOStream(String path) {
        this.path = path;
    }
}