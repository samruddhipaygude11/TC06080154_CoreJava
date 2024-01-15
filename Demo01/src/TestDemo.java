import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.InvalidClassException;

public class TestDemo {
	
	public static void main(String[] args) throws IOException {
		
//		FileOutputStream fos = new FileOutputStream("c://abc.txt");
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		
//		StudentDemo s = new StudentDemo(1, "Sam", 1000.09f);
//		
//		oos.writeObject(s);
//		System.out.println("Success");
//		
//		oos.close();
//		fos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d://abc.txt"));
		StudentDemo s = (StudentDemo)ois.readObject();
		System.out.println(s);
		
	}
}
