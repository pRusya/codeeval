import java.io.File;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		try{
			Scanner sc = new Scanner(new File(args[0]));
			sc.useDelimiter(System.getProperty("line.separator"));
			while(sc.hasNext()){
				String s = sc.next();
				String bitString = Integer.toBinaryString(Integer.parseInt(s.replaceAll(",.*", "")));
				int firstBitPosition = Integer.parseInt(s.replaceAll(".*?,(\\d+),.*", "$1"));
				int secondBitPosition = Integer.parseInt(s.replaceAll(".*,", ""));
				char firstBit = bitString.charAt(bitString.length()-firstBitPosition);
				char secondBit = bitString.charAt(bitString.length()-secondBitPosition);
				System.out.println(firstBit==secondBit);
			}
		}
		catch(Exception e){
			System.out.println("Error:"+e);
		}
	}
}