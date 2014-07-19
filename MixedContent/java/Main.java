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
				String words = s.replaceAll(",?\\d+,?",",");
				words = words.replaceAll("^,*|,*$","");
				String digits = s.replaceAll(",?[^\\d]+,?",",");
				digits = digits.replaceAll("^,*|,*$","");
				if(words.length()<1)
					System.out.println(digits);
				else if(digits.length()<1)
					System.out.println(words.replaceAll(",{2,}",","));
				else
					System.out.println(words.replaceAll(",{2,}",",")+'|'+digits);
			}
		}
		catch(Exception e){
			System.out.println("Error: "+e);
		}
	}
}