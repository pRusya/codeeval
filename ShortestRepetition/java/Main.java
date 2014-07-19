import java.util.Scanner;
import java.io.File;

public class Main {
	public static void main(String[] args) {
		try{
			Scanner sc = new Scanner(new File(args[0]));
			sc.useDelimiter(System.getProperty("line.separator"));
			while(sc.hasNext()){
				String s = sc.next();
				String part = new String();
				int i = 1;
				for(;i<=s.length();i++){
					part = s.substring(0,i);
					if(s.matches("^("+part+")+$"))
							break;
				}
				System.out.println(i);
			}
		}
		catch(Exception e){
			System.out.println("Error: "+e);
		}
	}
}