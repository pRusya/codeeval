import java.util.Scanner;
import java.io.File;

public class Main {
	public static void main(String[] args) {
		try{
			Scanner sc = new Scanner(new File(args[0]));
			sc.useDelimiter(System.getProperty("line.separator"));
			while(sc.hasNext())
				System.out.println(Integer.parseInt(sc.next(),16));
			sc.close();
		}
		catch(Exception e){
			System.out.println("Error: "+e);
		}
	}
}