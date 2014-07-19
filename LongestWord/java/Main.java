import java.util.Scanner;
import java.io.File;

public class Main {
	public static void main(String[] args) {
		try{
			Scanner sc = new Scanner(new File(args[0]));
			sc.useDelimiter(System.getProperty("line.separator"));
			while(sc.hasNext()){
				String[] words = sc.next().split(" ");
				int index = 0;
				int length = 0;
				for(int i=0;i<words.length;i++){
					int wl = words[i].length();
					if(wl>length){
						length = wl;
						index = i;
					}
				}
				System.out.println(words[index]);
			}
		}
		catch(Exception e){
			System.out.println("Error: "+e);
		}
	}
}