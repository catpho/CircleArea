import java.io.*;
import java.util.Scanner;
public class ScannerReadFile {
	 public static void main(String[] args) {

	        // Location of file to read
	        File file = new File("CardNative.java.txt");

	        try 
	        {

	                Scanner scanner = new Scanner(file);

	                while (scanner.hasNextLine()) 
	                {
	                    String line = scanner.nextLine();
	                    System.out.println(line);
	                }
	                scanner.close();
	        } 
	        catch (FileNotFoundException e) 
	        {
	              e.printStackTrace();
	        }

	    }
}
