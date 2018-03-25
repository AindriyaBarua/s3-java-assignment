import java.util.*;
public class Test{
	public static void main(String[] args){
		Shape o = new Octagon(8);
		Shape s = new Square(5);
		// Rectangle r = new Rectangle(5,6);
		Shape r1 = new Rectangle();

		// System.out.print(Instance(r));
		Rectangle[] r = { new Rectangle(5, 8), new Rectangle(6, 8), new Rectangle(1,2)};
		java.util.Arrays.sort(r);
		for(int i=0;i<5;i++){
			r[i].Print();

		}
	}
}