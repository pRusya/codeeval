import java.util.Scanner;
import java.io.File;

public class Main {
	public static void main(String[] args) {
		try{
			Scanner sc = new Scanner(new File(args[0]));
			sc.useDelimiter(System.getProperty("line.separator"));
			char ch = '\0';
			while(sc.hasNext()){
				String s = sc.next();
				if(s.length()<1)
					continue;
				for(int i=0; i<s.length(); i++){
					if(s.lastIndexOf(s.charAt(i))==i && s.indexOf(s.charAt(i))==i){
						ch = s.charAt(i);
						break;
					}
				}
				System.out.println(ch);
			}
		}
		catch(Exception e){
			System.out.println("Error: "+e);
		}
	}
}