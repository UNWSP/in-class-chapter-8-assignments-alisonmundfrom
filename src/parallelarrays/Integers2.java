package parallelarrays;

public class Integers2 {

	public static void main(String[] args) {
		
		double[] ds= new double[5];
		
		int k=0;
		
		for(int i=0; i<ds.length; i++) 
		{
			ds[i]=Math.pow(2, i+1);
		}
		
		for(double x:ds) 
		{
			System.out.print(x);
			System.out.print(", ");
		}
		
		System.out.print("\n");
		
		for(int i=4; i>=0; i--) 
		{
			System.out.print(ds[i]);
			System.out.print(", ");
		}

	}

}
