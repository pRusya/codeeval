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
				String[] strings = s.split(",");
				System.out.println(strings[0].endsWith(strings[1]) ? 1 : 0);
			}
		}
		catch(Exception e){
			System.out.println("Error: "+e);
		}
	}
}