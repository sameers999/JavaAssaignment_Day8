package Line_Comparison;

import java.util.Scanner;

public class LineComparison_Uc1 {
	int x1,x2,y1,y2;
	Scanner scanner = new Scanner(System.in);
	
	public void welcome() {
		System.out.println("***** Welcome To Line Comparision Program *****");
	}
	public void lengthofLine() {
		System.out.println("Enter Cartesion Co_ordinates");
		System.out.println("Enter x1 ");
		x1 = scanner.nextInt();
		System.out.println("Enter x2 ");
		x2 = scanner.nextInt();
		System.out.println("Enter y1 ");
		y1 = scanner.nextInt();
		System.out.println("Enter y2 ");
		y2 = scanner.nextInt();
		System.out.println("Length Of The Line: " + (Math.sqrt(Math.pow((x2 - x1),2)) + Math.pow((y2 - y1), 2)));
		
	}
	public static void main(String[] args) {
		LineComparison_Uc1 lineMethods = new LineComparison_Uc1();
		lineMethods.welcome();
		lineMethods.lengthofLine();
	}
}
