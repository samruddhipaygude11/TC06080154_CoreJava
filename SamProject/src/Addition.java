
public class Addition {
	
	public int add(int...is a)
	{
		int count=a.length;
		int sum=0;
		System.out.println("Count= "+count);
		for(int i:a)
		{
			sum+=i;
		}
		return sum;
	}
	public static void main(String[] args) {
		Addition a= new Addition();
		System.out.println("Addition= "+.Addition(1,2,3));
		int sum=a.add(1,2,4,5,56,4);
		System.out.println("Sum="+sum);
	}
}
