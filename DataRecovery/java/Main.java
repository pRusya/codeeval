import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
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
				String[] words = s.replaceAll(";.*", "").split(" ");
				String[] order = s.replaceAll(".*;", "").split(" ");
				
				TreeMap<Integer, String> map = new TreeMap<Integer, String>();
				for(int i=0; i<order.length; i++){
					map.put(Integer.parseInt(order[i]), words[i]);
				}
				Set set = map.keySet();
				if(words.length>order.length){
					for(int i=1; i<=order.length; i++){
						if(!set.contains(i))
							map.put(i, words[words.length-1]);
					}
				}
				if(map.size()<words.length)
					map.put(words.length, words[words.length-1]);
				
				/*map.values().toArray(words);
				for(String ss : words)
					System.out.print(ss+" ");*/
				for(int i=1; i<=map.size(); i++)
					System.out.print(map.get(i)+" ");
				System.out.println();
			}
		}
		catch(Exception e){
			System.out.println("Error: "+e);
		}
	}
}