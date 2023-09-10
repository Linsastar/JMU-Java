import java.io.*;

/**
 * @author gong
 */
public class WriteBinaryFile {
    public static void main(String[] args) throws IOException {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("file.bin"));
        dos.writeInt(128);
        dos.writeChars("Sine");
        dos.close();
    }
}
