import java.io.*;
public class File{
    public static void main(String[] args) throws IOException {
        // Initialize FileInputStream and FileOutputStream
        FileInputStream source = null;
        FileOutputStream target = null;
        try {
            source = new FileInputStream("source.txt");
            target = new FileOutputStream("destination.txt");
            int content;
            // Read a byte at a time; when it reaches the end of the file, it returns -1
            while ((content = source.read()) != -1) {
                // Write the byte to the target output stream
                target.write((byte) content);
            }
        } finally {
            // Close the streams
            if (source != null) {
                source.close();
            }
            if (target != null) {
                target.close();
            }
        }
    }
}