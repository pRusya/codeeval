import java.util.Scanner;
import java.io.File;

public class Main {
	public static void main(String[] args) {
		try{
			String temp = new String();
			int half = 0;
			Scanner sc = new Scanner(new File(args[0]));
			sc.useDelimiter(System.getProperty("line.separator"));
			while(sc.hasNext()){
				String[] splitted = sc.next().split(" ");
				if(splitted[0].length()<1)
					continue;
				half = (int)(splitted.length/2)-1;
				for(int i=0;i<=half;i++){
					temp = splitted[i];
					splitted[i] = splitted[splitted.length-i-1];
					splitted[splitted.length-i-1] = temp;
				}
				for(int i=0;i<splitted.length-1;i++)
					System.out.print(splitted[i]+" ");
				System.out.println(splitted[splitted.length-1]);
			}
			sc.close();
		}
		catch(Exception e){
			System.out.println("Error: "+e);
		}
	}
}