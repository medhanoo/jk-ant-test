package localmath

public class Rectangle {
	public int lenght;
	public int width;
	
	public Rectangle(int x, int y) {
		this.lenght = x;
		this.width = y;
	}
	
	public int getArea() {
		return lenght * width 
	}
	
	public int getPerimeter() {
		return 2 * (lenght + width)
	}
	
}

