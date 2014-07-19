import java.util.Scanner;
import java.io.File;

public class Main {
	public static void main(String[] args) {
		try{
			String temp = new String();
			String first = new String();
			String second = new String();
			Scanner sc = new Scanner(new File(args[0]));
			sc.useDelimiter(System.getProperty("line.separator"));
			while(sc.hasNext()){
				String s = sc.next();
				if(s.length()<1)
					continue;
				String[] nums = s.replaceAll("\\s:.*","").split(" ");
				String[] swap = s.replaceAll(".*:\\s","").split(", ");
				for(String sw : swap){
					first = sw.replaceAll("-.*","");
					second = sw.replaceAll(".*-","");
					temp = nums[Integer.parseInt(first)];
					nums[Integer.parseInt(first)] = nums[Integer.parseInt(second)];
					nums[Integer.parseInt(second)] = temp;
				}
				for(int i=0;i<nums.length-1;i++)
					System.out.print(nums[i]+" ");
				System.out.println(nums[nums.length-1]);
			}
		}
		catch(Exception e){
			System.out.println("Error: "+e);
		}
	}
}