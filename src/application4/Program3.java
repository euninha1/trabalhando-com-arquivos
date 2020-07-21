package application4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		
		/*lendo arquivos*/ 
		
		File file = new File("c:\\temp\\in.txt"); 
		Scanner sc = null; 
		try { 
			sc = new Scanner(file); 
			while (sc.hasNextLine()) { 
				System.out.println(sc.nextLine());
			}
		}
		catch (IOException e) { 
			System.out.println("Error: " + e.getMessage());
		}
		finally { 
			if ( sc != null)  {
				sc.close();
			}
		}
	}	

}
