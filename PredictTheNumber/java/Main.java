import java.util.Scanner;
import java.math.*;
import java.io.File;
import java.util.Arrays;

public class Main {
	/*long[] power = {1L, 2L, 4L, 8L, 16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 4096L, 8192L, 16384L, 32768L, 65536L, 131072L, 262144L, 524288L, 1048576L, 2097152L, 4194304L, 8388608L, 16777216L, 33554432L, 67108864L, 134217728L, 268435456L, 536870912L, 1073741824L, 2147483648L, 4294967296L};*/
	public static void main(String[] args) {
		try{
			Scanner sc = new Scanner(new File(args[0]));
			sc.useDelimiter(System.getProperty("line.separator"));
			while(sc.hasNext()){
				String s = "0";
				long i = sc.nextLong();
				if(i==0)
					System.out.println(0);
				else if(i==1)
					System.out.println(1);
				else if(i>1){
					long power = 63-Long.numberOfLeadingZeros(i);
					long low = (long)Math.pow(2, power);
					long diff = (i+1)-low;
					int n = 2;
					//System.out.println("low="+low+"  diff="+diff+"  n="+n);
					while(diff>2){
						power = 63-Long.numberOfLeadingZeros((int)diff-1);
						low = (long)Math.pow(2, power);
						diff = diff-low;
						n++;
						//System.out.println("low="+low+"  diff="+diff+"  n="+n);
					}
					diff /= 2;
					//System.out.println("n="+n+"  diff="+diff);
					
					long out = 0;
					if(n%3==0)
						out = 2+diff;
					else if((n-1)%3==0)
						out = 0+diff;
					else
						out = 1+diff;
					if(out>2)
						out = 0;
					System.out.println(out);
				}
				//System.out.println(s);
			}
		}
		catch(Exception e){
			System.out.println("Error: "+e);
		}
	}
}