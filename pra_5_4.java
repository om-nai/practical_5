import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;

public class Practical5 {
    public static void main(String[] args) throws IOException {

        DataInputStream inputStream = null;
        DataOutputStream outputStreamEven = null;
        DataOutputStream outputStreamOdd = null;

        try {
            inputStream = new DataInputStream(new BufferedInputStream(new FileInputStream("input.txt")));
            outputStreamEven = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("even.txt")));
            outputStreamOdd = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("odd.txt")));

            int number;
            

            number = inputStream.readInt();
            

            while ((number = inputStream.read()) % 2 != 0) {
                outputStreamOdd.writeInt(number);
                
            }

            while ((number = inputStream.read()) % 2 == 0) {
                outputStreamEven.writeInt(number);
                
            }

        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStreamEven != null) {
                outputStreamEven.close();
            }
            if (outputStreamOdd != null) {
                outputStreamOdd.close();
            }
        }
    }
}


