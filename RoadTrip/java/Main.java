import java.util.Scanner;
import java.io.File;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		try{
			Scanner sc = new Scanner(new File(args[0]));
			sc.useDelimiter(System.getProperty("line.separator"));
			while(sc.hasNext()){
				String s = sc.next();
				if(s.length()<1)
					continue;
				String[] points = s.split(" ");
				int[] dist = new int[points.length];
				for(int i=0;i<points.length;i++)
					dist[i] = Integer.parseInt(points[i].replaceAll(".*,(.*);","$1"));
				Arrays.sort(dist);
				System.out.print(dist[0]+",");
				for(int i=1;i<dist.length-1;i++)
					System.out.print(dist[i]-dist[i-1]+",");
				System.out.println(dist[dist.length-1]-dist[dist.length-2]);
			}
		}
		catch(Exception e){
			System.out.println("Error: "+e);
		}
	}
}