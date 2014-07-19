import java.util.Scanner;
import java.io.File;

public class Main {
	public static void main(String[] args) {
		try{
			Scanner sc = new Scanner(new File(args[0]));
			sc.useDelimiter(System.getProperty("line.separator"));
			while(sc.hasNext()){
				String[] s = sc.next().split(",");
				int[] points = new int[s.length];
				for(int i=0;i<s.length;i++)
					points[i] = Integer.parseInt(s[i]);
				if((points[0]<=points[4]&&points[4]<=points[2])||(points[0]<=points[6]&&points[6]<=points[2])||(points[4]<=points[0]&&points[2]<=points[6])){
					if((points[1]>=points[5]&&points[5]>=points[3])||(points[1]>=points[7]&&points[7]>=points[3])||(points[1]<=points[5]&&points[7]<=points[3]))
						System.out.println("True");
					else
						System.out.println("False");
				}
				else
					System.out.println("False");
			}
		}
		catch(Exception e){
			System.out.println("Error: "+e);
		}
	}
}