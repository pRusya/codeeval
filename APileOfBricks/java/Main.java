import java.util.Scanner;
import java.io.File;

public class Main {
	public static void main(String[] args) {
		try{
			Scanner sc = new Scanner(new File(args[0]));
			sc.useDelimiter(System.getProperty("line.separator"));
			while(sc.hasNext()){
				String s = sc.next();
				if(s.length()<1)
					continue;
				
				int holeWidth = Math.abs(Integer.parseInt(s.replaceAll("^\\[(.*?),.*", "$1")) 
						- Integer.parseInt(s.replaceAll("^\\[.*?\\[(.*?),.*", "$1")));
				int holeHeight = Math.abs(Integer.parseInt(s.replaceAll("^.*?,(.*?)\\].*", "$1")) 
						- Integer.parseInt(s.replaceAll("^.*?,.*?,(.*?)\\].*", "$1")));
				
				String match = "";
				String[] rawBricks = s.replaceAll(".*?\\|", "").split(";");
				for(String rawBrick : rawBricks){
					int index = Integer.parseInt(rawBrick.replaceAll("^\\((.*?)\\s.*", "$1"));
					int sideX = Math.abs(Integer.parseInt(rawBrick.replaceAll("^.*?\\[(.*?),.*", "$1"))
							- Integer.parseInt(rawBrick.replaceAll("^.*?\\[.*?\\[(.*?),.*", "$1")));
					int sideY = Math.abs(Integer.parseInt(rawBrick.replaceAll("^.*?\\[.*?,(.*?),.*", "$1"))
							- Integer.parseInt(rawBrick.replaceAll("^.*?\\[.*?\\[.*?,(.*?),.*", "$1")));
					int sideZ = Math.abs(Integer.parseInt(rawBrick.replaceAll("^.*?\\[.*?,.*?,(.*?)\\].*", "$1"))
							- Integer.parseInt(rawBrick.replaceAll("^.*?\\[.*?\\[.*?,.*?,(.*?)\\].*", "$1")));
					
					if((holeHeight>=sideX && holeWidth>=sideY)
							|| (holeHeight>=sideY && holeWidth>=sideX)
							|| (holeHeight>=sideX && holeWidth>=sideZ)
							|| (holeHeight>=sideZ && holeWidth>=sideX)
							|| (holeHeight>=sideY && holeWidth>=sideZ)
							|| (holeHeight>=sideZ && holeWidth>=sideY))
						match += (","+index);
				}
				if(match.equals(""))
					System.out.println("-");
				else
					System.out.println(match.replaceAll("^,", ""));
			}
		}
		catch(Exception e){
			System.out.println("Error: "+e);
		}
	}
}