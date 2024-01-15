import java.io.Serializable;

public class StudentDemo implements Serializable, Cloneable {
	
	private int rollNo;
	private String name;
	private transient float fees;
	
	public StudentDemo() {}
	
	public StudentDemo(int rollNo, String name, float fees) {
			super();
			this.rollNo = rollNo;
			this.name = name;
			this.fees = fees;
	}
		
	@Override 
	public String toString() {
		return "StudentDemo [rollNo=" + rollNo + ", name="+ name + ",fees= "+ fees + " ]";
		
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		StudentDemo s = new StudentDemo(2, "Sam", 10000.89f);
		StudentDemo s1 = (StudentDemo) s.clone();
		System.out.println(s1);
	}
		
		

	

}
