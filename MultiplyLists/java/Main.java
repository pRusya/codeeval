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
				
				String[] halfOne = s.replaceAll("\\s\\|.*", "").split(" ");
				String[] halfTwo = s.replaceAll(".*?\\|\\s", "").split(" ");
				
				for(int i=0; i<halfOne.length; i++){
					System.out.print(Integer.parseInt(halfOne[i])*Integer.parseInt(halfTwo[i]) + " ");
				}
				System.out.println();
			}
		}
		catch(Exception e){
			System.out.println("Error: "+e);
		}
	}
}