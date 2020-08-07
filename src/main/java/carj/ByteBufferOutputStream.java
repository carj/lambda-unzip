package carj;

import java.io.ByteArrayOutputStream;

public class ByteBufferOutputStream extends ByteArrayOutputStream {

    public byte[] getBuffer() {
       return this.buf;
    }

    public void close() {
        this.buf = null;
    }

}
