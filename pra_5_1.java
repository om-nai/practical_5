import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class pra_5_1 {

    public static void main(String[] args) throws IOException {
        System.out.println("Enter file name to open : ");
        Scanner scan = new Scanner(System.in);
        String fileName = scan.nextLine();
        scan.close();
        File file = new File(fileName);
        System.out.println("File name : " + file.getName());
        System.out.println("Absolute path : " + file.getAbsolutePath());
        if (file.exists()) {
            System.out.println("Writeable : " + file.canWrite());
            System.out.println("Readable : " + file.canRead());
            System.out.println("Size in bytes : " + file.length());

        }
    }
}