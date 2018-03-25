public class Square extends Shape{
	int side;
	Square(int side){
		this.side = side;
	}
	public double getArea(){
		retunr side*side;
	}
}