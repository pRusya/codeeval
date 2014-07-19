import java.util.Scanner;
import java.io.File;

public class Main {
	public static void main(String[] args) {
		try{
			Scanner sc = new Scanner(new File(args[0]));
			sc.useDelimiter(System.getProperty("line.separator"));
			while(sc.hasNext())
				System.out.println(sc.next().toLowerCase());
			sc.close();
		}
		catch(Exception e){
			System.out.println("Error: "+e);
		}
	}
}