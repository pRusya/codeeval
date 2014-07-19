import java.util.Scanner;
import java.io.File;

public class Main {
	public static void main(String[] args) {
		try{
			char[] alphabet;
			int[] key;
			String[] keys;
			Scanner sc = new Scanner(new File(args[0]));
			sc.useDelimiter(System.getProperty("line.separator"));
			while(sc.hasNext()){
				String s = sc.next();
				if(s.length()<1)
					continue;
				alphabet = s.replaceAll("|.*", "").toCharArray();
				keys = s.replaceAll(".*\\| ", "").split(" ");
				key = new int[keys.length];
				for(int i=0;i<keys.length;i++)
					key[i] = Integer.parseInt(keys[i]);
				String writer = "";
				for(int i : key){
					writer += alphabet[i-1];
				}
				System.out.println(writer);
			}
		}
		catch(Exception e){
			System.out.println("Error: "+e);
		}
	}
}