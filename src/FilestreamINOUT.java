
import java.util.Scanner;
import java.io.*;
import java.util.*;
/**
 * @author Cathy Phan
 * @version 1.0
 */
public class FilestreamINOUT {
       /**
        * 
        * @param args command-line arguments 
        * @throws IOException
        * @see user and pass for login validation
        */
	public static void main(String[] args) throws IOException{
		/**
		 * @param String userAttempt and passAttempt 
		 */
		Scanner input = new Scanner(System.in);
	
		//validate username
		String userAttempt = "Start1";
		Boolean user = false;
		//start loop here
		
 while (user != true) {
		System.out.print("Enter UserName: ");
		userAttempt = input.nextLine();
		
		if (validateUser(userAttempt)!= user) {
	        	System.out.println("User username attempt is accepted.");
	        	user = true;
	        }
	        else {
	        	System.out.println("Username format has failed.");
	        }
		System.out.println();
 }
		
 
		//validate password
		String passAttempt = "Start2";
        Boolean pass = false;
        //start loop here?
        
 while (pass!=true) {
		System.out.print("Enter password: ");
        passAttempt = input.nextLine();
       
        if (validatePass(passAttempt)!= pass) {
        	System.out.println("User password attempt is accepted.");
        	pass = true;
        }
        else {
        	System.out.println("User password has failed.");
        }
 }
//file input stream and output 
 				Scanner filescan = new Scanner(ScannerReadFile.class.getResourceAsStream("confidentialInfo.txt"));
 				Scanner filescan2 = new Scanner(ScannerReadFile.class.getResourceAsStream("confidentialInfo.txt"));
 		try {	
 			if("confidentialInfo.txt" == null) {
				throw new Exception("No Records currently");
 			}
 		}  
    catch(FileNotFoundException excpt) {
    	System.out.println("System cannot find File. Please exit system");
    }
    catch (Exception excpt) {
    	System.out.print("File Stream has failed");
    }
 
 		//enter username again
 		System.out.println("Now attempting to open file for validation of user records.");
 		
 		System.out.println("Please enter your username first for username validation:");
 		String nowUser = input.next();
 		while (filescan.hasNextLine()) {
 			String line = filescan.nextLine();
 			if(line.equals(nowUser)) {
 				System.out.println("Your username has been found in our records.Please now enter your password:");
 				String nowPass = input.next();
 				
 				while (filescan2.hasNextLine()) {
 					if(line.equals(nowPass)) {
 						System.out.println("Congrats. Both user and pass are authenticated. Please exit system.");
 					}
 					else {
 						System.out.println("Searching...User may need to reboot system and try again");
 					}
 				}
 				filescan2.close();
 			}
 			else {
 				System.out.println("Searching...User may need to reboot system and try again");
 			}
 		}
 		filescan.close();
 

  
	}
	public static Boolean validateUser(String isUser) {
		/**
		 * @return isUser represents if the username can be validated or not 
		 */
		boolean userYes = false;
		boolean isDigit = false; 
		boolean isbigLetter = false;
		boolean isLength = false;
		//check numbers
		String numbers = "(.*[0-9].*)";
		if (!isUser.matches(numbers)) {
			isDigit = false;
			System.out.println("User has no digits in username. Failed formatting for digits. ");
		}
		else {
			isDigit = true;
			
			System.out.println("Passed digit test.Proceeding with other validations.");
		}
		
		//check length
		if (isUser.length() < 8) {
			isLength = false; 
			
			System.out.println("Insufficient length.");
		}
		else {
			isLength = true;
			 
			System.out.println("Passed length test.");
		}
		
		String letter = "(.*[A-Z].*)";
		if (!isUser.matches(letter)) {
			isbigLetter = false;
			
			System.out.println("User has not enter at least one uppercase letter");
		}
		else {
			isbigLetter = true;
			
			System.out.println("Passed big letter test. All tests done.");
		}
		
		if (isDigit == true && isbigLetter == true && isLength ==true) {
			System.out.println("All Tests Passed");
			userYes = true;
		}
		else {
			System.out.println("One or more tests failed. Please try again.");
		}
		
		return userYes;
		
	}
	public static Boolean validatePass(String isPass) {
		/**
		 * @return isPass to see if password can be validated or not 
		 */
		boolean passYes = false;
		boolean isDigit = false; 
		boolean isbigLetter = false;
		boolean isSymbol = false;
		boolean isLength = false;
		//check numbers
		String numbers = "(.*[0-9].*)";
		if (!isPass.matches(numbers)) {
			isDigit = false;
			System.out.println("User has no digits in password. Failed formatting for digits. ");
		}
		else {
			isDigit = true;
			
			System.out.println("Passed digit test.Proceeding with other validations.");
		}
		
		//check length
		if (isPass.length() < 8) {
			isLength = false; 
			
			System.out.println("Insufficient length.");
		}
		else {
			isLength = true;
			 
			System.out.println("Passed length test.");
		}
		
		//check symbols 
		String symbols = "(.*['*','$','_'].*)";
		if(!isPass.matches(symbols)) {
			isSymbol = false; 
			
			System.out.println("User has not entered '*' , '$' , or ' _' symbols.");
		}
		else {
			isSymbol = true;
		
			System.out.println("Passed symbols test");
		}
		
		String letter = "(.*[A-Z].*)";
		if (!isPass.matches(letter)) {
			isbigLetter = false;
			
			System.out.println("User has not enter at least one uppercase letter");
		}
		else {
			isbigLetter = true;
			
			System.out.println("Passed big letter test. All tests done.");
		}
		
		if (isDigit == true && isbigLetter == true && isSymbol ==true && isLength ==true) {
			System.out.println("All Tests Passed");
			passYes = true;
		}
		else {
			System.out.println("One or more tests failed. Please try again.");
		}
		
		return passYes;
	}

	 

		
	

}
