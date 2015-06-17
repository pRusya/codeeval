import java.util.Scanner;
import java.io.File;

public class Main {
	public static void main(String[] args) {
		try{
			Scanner sc = new Scanner(new File(args[0]));
			sc.useDelimiter(System.getProperty("line.separator"));
			while(sc.hasNext()){
				String[] set = sc.next().split(" ");
				int x = Integer.parseInt(set[0]);
				int y = Integer.parseInt(set[1]);
				for(int i=1; i<=Integer.parseInt(set[2]); i++){
					if(i % x == 0 && i % y == 0) System.out.print("FB ");
					else if(i % x ==0) System.out.print("F ");
					else if(i % y ==0) System.out.print("B ");
					else System.out.print(i + " ");
				}
				System.out.println();
			}
		}
		catch(Exception e){
			System.out.println("Error: "+e);
		}
	}
}