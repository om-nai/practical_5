import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Practical4 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("testFile1.txt");
            fos = new FileOutputStream("testFile2.txt");

            int temp;

            while ((temp = fis.read()) != -1) {
                fos.write(temp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
 
