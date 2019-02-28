package headfirst.decorator2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class InputTest {
    public static void main(String[] args) throws Exception {
        try (InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("name.txt")))) {
            int c;
            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }
        }
    }
}
