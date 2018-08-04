package triangle;
//main function
public class Triangle 
{
	int side1,side2,side3;//instance member

	public Triangle(int side1, int side2, int side3)//constructor
	{
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	boolean isTriangle()//function to check for Entered value is of triangle 
	{
		int max=Math.max(Math.max(side1, side2), side3);
		return (side1>0 && side2>0 && side3>0) && (max<=side1+side2+side3-max);
	}
	 boolean isRight()//Function to check condition for Right angle triangle
	 {
		 int max=Math.max(Math.max(side1, side2), side3);
		 return (isTriangle() && ((max*max)==((side1*side1)+(side2*side2)+(side3*side3)-(max*max))));
	 }
	boolean isScalene()//Function to check condition for Scalene
	{
		return (isTriangle() && (side1!=side2 && side2!=side3 && side3!=side1)&&(!isRight()));
	}
	boolean isIsosceles()//Function to check condition for Isosceles
	{
		return (isTriangle() && ((side1==side2 && side1!=side3)|| (side2==side3 && side2!=side1)|| (side1==side3 && side1!=side2))); 
	}
	boolean isEquilateral()//Function to check condition for Equilateral
	{
		return (isTriangle() && (side1==side2 && side2==side3));
	}
}
