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
				
				String[] ss = s.split("\\s+");
				double[] A = new double[ss.length];
				
				for(int i=0; i<ss.length;i++){
					A[i] = Double.parseDouble(ss[i]);
				}
				mergeSort(A);
				for(int i=0; i<A.length-1; i++)
					System.out.print(String.format("%.3f ", A[i]));
				System.out.println(String.format("%.3f ", A[A.length-1]));
			}
		}
		catch(Exception e){
			System.out.println("Error: "+e);
		}
	}
	
	public static void mergeSort(double[] a){
		if(a.length<=1)
			return;
		
		int middle = a.length/2;
		double[] a1 = Arrays.copyOfRange(a, 0, middle);
		double[] a2 = Arrays.copyOfRange(a, middle, a.length);
		
		mergeSort(a1);
		mergeSort(a2);
		merge(a, a1, a2);
	}
	
	public static void merge(double[] a, double[] a1, double[] a2){
		int i, j, k;
		i = j = k = 0;
		
		while(i<a1.length && j<a2.length){
			if(a1[i]<a2[j])
				a[k++] = a1[i++];
			else
				a[k++] = a2[j++];
		}
		while(i<a1.length)
			a[k++] = a1[i++];
		while(j<a2.length)
			a[k++] = a2[j++];
	}
}