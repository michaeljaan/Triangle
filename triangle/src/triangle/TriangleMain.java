package triangle;
//main function
import java.util.Scanner;

public class TriangleMain
{

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter sides of Triangle");//Enter the sides of Triangle
		int side1=scanner.nextInt();
		int side2=scanner.nextInt();
		int side3=scanner.nextInt();
		
		Triangle triangle=new Triangle(side1,side2,side3);//create new object
		
		System.out.println("right?"+triangle.isRight());//Checking for right angled triangle
		System.out.println("Isosceles?"+triangle.isIsosceles());//Checking for isosceles triangle
		System.out.println("Scalene?"+triangle.isScalene());//Checking for Scalene triangle
		System.out.println("Equilateral?"+triangle.isEquilateral());//Checking for equilateral
		
	}

}
