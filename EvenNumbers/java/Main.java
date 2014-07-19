import java.util.Scanner;
import java.io.File;

public class Main {
	public static void main(String[] args) {
		try{
			Scanner sc = new Scanner(new File(args[0]));
			sc.useDelimiter(System.getProperty("line.separator"));
			while(sc.hasNext()){
				if(Integer.lowestOneBit(sc.nextInt())==1)
					System.out.println("0");
				else
					System.out.println("1");
			}
		}
		catch(Exception e){
			System.out.println("Error: "+e);
		}
	}
}