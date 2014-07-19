import java.util.Scanner;
import java.io.File;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
	public static void main(String[] args) {
		try{
			Scanner sc = new Scanner(new File(args[0]));
			sc.useDelimiter(System.getProperty("line.separator"));
			while(sc.hasNext()){
				String s = sc.next();
				BigDecimal aX = new BigDecimal(s.replaceAll(".*Center: \\((.*?),.*","$1"));//.abs();
				BigDecimal aY = new BigDecimal(s.replaceAll(".*Center:.*?, (.*?)\\).*","$1"));//.abs();
				BigDecimal radius = new BigDecimal(s.replaceAll(".*Radius: (.*?);.*","$1")).abs();
				BigDecimal bX = new BigDecimal(s.replaceAll(".*Point: \\((.*?),.*","$1"));//.abs();
				BigDecimal bY = new BigDecimal(s.replaceAll(".*Point:.*?, (.*?)\\).*","$1"));//.abs();
				BigDecimal x = bX.subtract(aX).abs();
				BigDecimal y = bY.subtract(aY).abs();
				BigDecimal dist = new BigDecimal( Math.sqrt( (x.multiply(x).add(y.multiply(y))).doubleValue() ) ).setScale(5,RoundingMode.DOWN);
				if(dist.doubleValue()<=radius.doubleValue())
					System.out.println("true");
				else
					System.out.println("false");
			}
		}
		catch(Exception e){
			System.out.println("Error: "+e);
		}
	}
}