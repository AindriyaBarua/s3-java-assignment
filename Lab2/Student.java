
public class Student{
	private int rollno;
	private String name;
	private int mark;
	public Student(){
		rollno = 0;
		name = "";
		mark = 0;
	}
	public Student(int r, String n, int m){
		rollno = r;
		name = n;
		mark = m;
	}
	public void Print(){
		System.out.println(" Name:  " + name + " Roll no:" + rollno + " Mark: " + mark);
	}
	public static void main(String args[]){
		Student temp = new Student();
		Student ram = new Student(1, "ram", 34);
		Student seeta = new Student(2, "seeta", 52);
		temp = ram;
		ram = seeta;
		seeta = temp;
		System.out.println("Ram");
		ram.Print();
		System.out.println("Seeta");
		seeta.Print();
	}
}
