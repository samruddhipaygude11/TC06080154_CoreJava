package pratcice;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value=16,i;
		boolean flag = true;
		i=2;
		while(i<value/2)
		{
			if(value %i==0)
			{
				flag=false;
			}
			i++;
		}
		if(flag==true)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not Prime");
		}

	}

}
