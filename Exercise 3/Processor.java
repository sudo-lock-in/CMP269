import java.io.*;
import java.util.Scanner;

public class Processor {
    public static void main(String[] args) {
        FileInputStream fileIS;
        Scanner fileScan;
        String lineContent = "";
         try {
                fileIS = new FileInputStream("students.txt");
                fileScan = new Scanner(fileIS);
                Scanner inStream = null;
                inStream = new Scanner(new File("students.txt"));
                while (inStream.hasNextLine()) {

                    lineContent = inStream.nextLine();


                    try {
                        PrintWriter output = new PrintWriter(new FileOutputStream("grades_report.txt", true));
                        output.println(lineContent);
                        output.flush();

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }


                }
            } catch (FileNotFoundException e) {
            }
    }
}
