package axaar;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CommandLineExample {
	public static void main(String args[]) throws FileNotFoundException, UnsupportedEncodingException{  
		try{
			System.out.println("Bonjour: "+args[0]);
		
		} catch(Exception e) {
			System.out.println("Error please check Log file ");
			SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss"); 
			Date date = new Date();
			PrintWriter writer = new PrintWriter(formatter.format(date)+"-log.txt", "UTF-8");
			writer.println("must exist 1 param");
			writer.close();
		} 
		}
}
