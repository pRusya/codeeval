import java.util.Scanner;
import java.io.File;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		try{
			Scanner sc = new Scanner(new File(args[0]));
			sc.useDelimiter(System.getProperty("line.separator"));
			while(sc.hasNext()){
				String s = sc.next();
				if(s.length()<1)
					continue;
				s = s.replaceAll("^.*items\": (.*)}}$", "$1");
				String[] items = s.split("},");
				int sum = 0;
				for(String c : items){
					if(c.contains("\"label\":")){
						sum += Integer.parseInt(c.replaceAll(".*\"id\": (\\d+).*", "$1"));
					}
				}
				System.out.println(sum);
			}
		}
		catch(Exception e){
			System.out.println("Error: "+e);
		}
	}
}