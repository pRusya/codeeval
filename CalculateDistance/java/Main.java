import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.io.File;

public class Main {
	public static void main(String[] args) {
		try{
			Scanner sc = new Scanner(new File(args[0]));
			sc.useDelimiter(System.getProperty("line.separator"));
			while(sc.hasNext()){
				String s = sc.nextLine();
				if(s.length()<1)
					continue;
				int x1 = Integer.parseInt(s.replaceAll("^\\((.*?),.*", "$1"));
				int y1 = Integer.parseInt(s.replaceAll("^\\(.*?,\\s(.*?)\\).*", "$1"));
				
				int x2 = Integer.parseInt(s.replaceAll("^\\(.*\\((.*?),.*", "$1"));
				int y2 = Integer.parseInt(s.replaceAll("^\\(.*?\\(.*?,\\s(.*?)\\)$", "$1"));
				
				int x = Math.abs(x1 - x2);
				int y = Math.abs(y1 - y2);
				
				int dist = (int)Math.sqrt(x*x + y*y);
				System.out.println(dist);
			}
		}
		catch(Exception e){
			System.out.println("Error: "+e);
		}
	}
}