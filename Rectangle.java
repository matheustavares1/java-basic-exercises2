package Stok;

public class Rectangle {

	private double width;
	private double height;
	
	// metodos getters e setters
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double area() {
		return height * width;
	}
	
	
	//metodos
	public double perimeter() {
		double perimeter = 2 * (this.width + this.height);
		return perimeter;
	}
	public double diagonal() {
		double diagonal = Math.sqrt(Math.pow(this.height,2) + Math.pow(this.height,2));
		return diagonal;
	}
	@Override
	public String toString() {
		String table = String.format("Área: %.2f\nPerimeter: %.2f\nDiagonal: %.3f"
									, area(), perimeter(), diagonal());
		return table;
	}
	
	
	
}
