package Stok;
import java.util.Scanner;
public class Retangle_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sr = new Scanner(System.in);
		
		Rectangle cal = new Rectangle();
		
		System.out.println("Enter numbers Widht and Height: ");
		cal.setWidth( sr.nextDouble());
		cal.setHeight(sr.nextDouble());
		
		System.out.println(cal);
	}

}
