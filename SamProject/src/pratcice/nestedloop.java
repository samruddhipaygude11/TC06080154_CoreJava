package pratcice;

public class nestedloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i=1;
//		while(i<=5)
//		{
//			int j=1;
//			while(j<=i)
//			{
//				System.out.print("*");
//				j++;
//			}
//			System.out.println("");
//			i++;
//		}
		
		int i=5;
		do {
			int j=1;
			while(j<=i)
			{
				System.out.print("*");
				j++;
			}while(j<=i);
			System.out.println("");
			i--;
		}while(i>=1);

	}

}

