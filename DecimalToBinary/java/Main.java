import java.util.Scanner;
import java.io.File;

public class Main {
	public static void main(String[] args) {
		try{
			Scanner sc = new Scanner(new File(args[0]));
			sc.useDelimiter(System.getProperty("line.separator"));
			while(sc.hasNext()){
				String s = sc.next();
				if(s.length()<1)
					continue;
				System.out.println(Integer.toBinaryString(Integer.parseInt(s)));
			}
		}
		catch(Exception e){
			System.out.println("Error: "+e);
		}
	}
}