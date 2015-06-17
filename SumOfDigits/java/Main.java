import java.util.Scanner;
import java.io.File;

public class Main {
	public static void main(String[] args) {
		try{
			Scanner sc = new Scanner(new File(args[0]));
			sc.useDelimiter(System.getProperty("line.separator"));
			while(sc.hasNext()){
				String[] set = sc.nextLine().split("");
				int sum = 0;
				
				for(String s : set){
					if(s.length()>0)
						sum += Integer.parseInt(s);
				}
				System.out.println(sum);
			}
		}
		catch(Exception e){
			System.out.println("Error: "+e);
		}
	}
}