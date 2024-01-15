
public class student {
	private int rollNo;
	private String Name;
	private static int count;
	
	public student() {}
	
	public student(int rollNo, String name)
	{
		this.rollNo=rollNo;
		this.Name=Name;
		count++;
	}
	
	public static int getCount()
	{
		return count; 
	}
	
	@Override
	public String toString() {
		return "Student [rollNo = "+rollNo+", Name= "+Name+"]";
	}
	static {
		System.out.println("Static block");
		count=50;
	}
	
	public static void main(String[] args)
	{
		System.out.println("Main Method");
		student s1= new student(1,"Sam");
		student s2= new student(2,"Ruchi");
		student s3= new student(3,"Vishal");
		System.out.println("student.Count = "+student.getCount());
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
//	public int d,m,y;
//	public void initDate()
//	{
//		d=m=y=1;
//	}
//	public void setDate(int dd, int ,,,int yy)
//	{
//		d=dd;
//		m==mm;
//		y=yy;
//	}
//	public void displayDate()
//	{
//		System.out.println("Date"=["+d+"/"+m+"/"+y+"])
//	}
//	public static void main(Sring agrs[])
//	{
//		student s= new student();
//		d.displayDate();
//		d.initDate();
//		d.displayDate();
//		d.setDate(17,10,2023);
//		d.displayDate();
//	}
//
//}
