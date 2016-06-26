public class Session5Assignment3 {
	int length;
	int breadth;
	int side;



Rectangle() {
	System.out.println("Constructor with Zero Parameter Called ");
	length = breadth = 0;
}

Rectangle(int side) {
	System.out.println("Constructor with One Parameter Called");
	length = breadth = side;
}

Rectangle(int l, int b) {
	System.out.println("Constructor with Two Parameters Called");
	length = l;
	breadth = b;
}

int area() {
	return (length * breadth);

}

class Square{
	int side = 9;
	int area = side*side;
	Square(){
		System.out.println("The Area of square: "+ area);
			}

		}

	}

class shape {
@SuppressWarnings("unused")
public static void main(String[] args) {
	Rectangle r1 = new Rectangle(); 
	Rectangle r2 = new Rectangle(5);
	Rectangle r3 = new Rectangle(7, 8); 
	System.out.println("Area of Rectangle is : " + r3.area());
	System.out. println("Area of Square is : "+ r2.area( )); 
	}
}
