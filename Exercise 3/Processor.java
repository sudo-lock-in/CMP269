import java.io.*;
import java.util.*;

public class Processor {
    public static void main(String[] args) {
        FileInputStream fileIS;
        Scanner fileScan;
        String lineContent;
        PrintWriter output;
        Scanner inStream;
         try {
                fileIS = new FileInputStream("students.txt");
                fileScan = new Scanner(fileIS);
                inStream = new Scanner(new File("students.txt"));
                output = new PrintWriter(new FileOutputStream("grades_report.txt", true));
                while (inStream.hasNextLine()) {
                    lineContent = inStream.nextLine();
                    String[] content = lineContent.split(" ");
                    try {
                        String name = content[0].replace("_", " ");
                        int score1 = Integer.parseInt(content[1]);
                        int score2 = Integer.parseInt(content[2]); 
                        int score3 = Integer.parseInt(content[3]); 
                        int average = (score1 + score2 + score3)/3;
                        output.println("Student: " + name + " | Average: " + average);
                        output.flush(); 
                    }
                    catch (NumberFormatException e) {
                        System.out.println("Invalid input. Student skipped.");
                    }
                }
            } catch (FileNotFoundException e) {
            } 
            finally {
                System.out.println("Processing Complete");
            }
    }
}
