import java.util.Scanner;
import java.io.File;

public class Main {
	public static void main(String[] args) {
		try{
			Scanner sc = new Scanner(new File(args[0]));
			sc.useDelimiter(System.getProperty("line.separator"));
			while(sc.hasNext()){
				char[] ch = sc.next().toCharArray();
				for(int i=0;i<ch.length;i++){
					if(ch[i]>=65 && ch[i]<=90)
						ch[i] = Character.toLowerCase(ch[i]);
					else if(ch[i]>=97 && ch[i]<=122)
						ch[i] = Character.toUpperCase(ch[i]);
				}
				System.out.println(String.valueOf(ch));
			}
		}
		catch(Exception e){
			System.out.println("Error: "+e);
		}
	}
}