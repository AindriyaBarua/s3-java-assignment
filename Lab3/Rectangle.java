import java.*;

public class Rectangle extends Shape implements Comparable{
	int l;
	int b;
	public  int compareTo(Rectangle r){
		double area1 = r.getArea();
		double area2 = this.getArea();
		if(area2>area1)
			return 1;
		else if(area2 == area1)
			return 0;
		else
			return 1;
	}
	Rectangle(){
		l=0;
		b=0;
	}
	Rectangle(int l, int b){
		this.l = l;
		this.b = b;
	}
	public double getArea(){
		return l*b;
	}
	public int getLength(){
		return l;
	}
	public int getBreadth(){
		return b;
	}
	public void setSide(int l, int b){
		this.l = l;
		this.b = b;
	}
	public void Print(){
		System.out.println(this.l + " " + this.b);
	}
}