import java.io.File;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		try{
			Scanner sc = new Scanner(new File(args[0]));
			sc.useDelimiter(System.getProperty("line.separator"));
			Integer[][] matrix = new Integer[256][256];
			for(int a=0;a<256;a++){
				for(int b=0;b<256;b++){
					matrix[a][b] = 0;
				}
			}
			Integer row, col, value, sum = 0;
			while(sc.hasNext()){
				String s = sc.next();
				String operation = s.replaceAll("\\s.*","");
				switch(operation){
					case "SetRow":
						row = Integer.parseInt(s.replaceAll(".*?\\s(\\d+).*","$1"));
						value = Integer.parseInt(s.replaceAll(".*\\s(\\d+).*","$1"));
						for(int i=0;i<=255;i++){
							matrix[row][i] = value;
						}
						break;
					case "SetCol":
						col = Integer.parseInt(s.replaceAll(".*?\\s(\\d+).*","$1"));
						value = Integer.parseInt(s.replaceAll(".*\\s(\\d+).*","$1"));
						for(int i=0;i<=255;i++){
							matrix[i][col] = value;
						}
						break;
					case "QueryRow":
						row = Integer.parseInt(s.replaceAll(".*\\s(\\d+).*","$1"));
						for(int i=0;i<=255;i++){
							sum += matrix[row][i];
						}
						System.out.println(sum);
						sum = 0;
						break;
					case "QueryCol":
						col = Integer.parseInt(s.replaceAll(".*\\s(\\d+).*","$1"));
						for(int i=0;i<=255;i++){
							sum += matrix[i][col];
						}
						System.out.println(sum);
						sum = 0;
						break;
					default:
						System.out.println("Unknown operation.");
						break;
				}
			}
		}
		catch(Exception e){
			System.out.println("Error: "+e);
		}
	}
}