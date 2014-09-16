import java.util.Scanner;
import java.io.File;

public class Main {
	public static void main(String[] args) {
		try{
			Scanner sc = new Scanner(new File(args[0]));
			sc.useDelimiter(System.getProperty("line.separator"));
			while(sc.hasNext()){
				String s = sc.next();
				String degree = s.replaceAll("\\..*", "");
				double fraction = s.matches("^\\d+\\.\\d+") ? Double.parseDouble("0."+s.replaceAll("^\\d+\\.", "")) : 0;
				int seconds = (int)((int)3600 * fraction) % 60;
				int minutes = (int)((int)(3600 * fraction) - seconds) / 60;
				System.out.println(degree+"."+String.format("%02d", minutes)+"'"+String.format("%02d", seconds)+"\"");
			}
			sc.close();
		}
		catch(Exception e){
			System.out.println("Error: "+e);
		}
	}
}