import java.util.Scanner;
import java.io.File;

public class Main {
	public static void main(String[] args) {
		try{
			Scanner sc = new Scanner(new File(args[0]));
			sc.useDelimiter(System.getProperty("line.separator"));
			while(sc.hasNext()){
				int i = sc.nextInt();
				int fives = i/5;
				int five_sum = fives*5;
				int threes = (i-five_sum)/3;
				int ones = (i-(threes*3+five_sum))/1;
				System.out.println(fives+threes+ones);
			}
		}
		catch(Exception e){
			System.out.println("Error: "+e);
		}
	}
}