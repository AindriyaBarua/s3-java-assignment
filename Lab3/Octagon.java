import java.util.*;
public class Octagon extends Shape{
	int side;
	Octagon(int side){
		this.side = side;
	}
	public double getArea(){
		return side*side*(2+4*(Math.sqrt(2)));
	}
	public int getSide(){
		return side;
	}


}
