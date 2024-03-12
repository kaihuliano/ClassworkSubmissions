/**
 * class that will store the grade of a student
 * consisting of data attributes, properties,
 * strings, constructors, and methods
 */
public class Student {

	
	
	//list the grade properties
	private double science;
	private double math;
	private double theology;
	
	//instantiate grade level
	private int gradeLevel;
	//string for kids name
	private String name;
	
	
	/**
	 * This constructor lets us make grades
	 * We pass it numbers to be the initial values
	 * for the data attributes
	 * @param a
	 * @param b
	 * @param c
	 */
	public Student(double a, double b, double c)
	{
		//assign double a variable
		science  = a;
		math = b;
		theology = c;
		
		//give gradelevel value
		int gradeLevel = 12;
	}
	
	/**
	 * method that will return the average grade
	 * @return
	 */
	private double getGPA()
	{
		
		//get the average by dividing the total by the amount
		double A = getTotalGrade()/3;
		//retuwn it
		return A;
		
	}

	/**
	 * method to get the total of all grades
	 * @return
	 */
	private double getTotalGrade() {
		// TODO Auto-generated method stub
		
		//add up all the grades
		double G = science + math + theology;
		//wetuwn it
		return G;
	}
	
	/**
	 * method for student to introduce self 
	 * stating grade, name, and average GPA
	 * @return 
	 */
	public void introduceSelf()
	{
		//print statement that introduces self
		System.out.println("I am a student in " + gradeLevel + " my name is " + name + " my average GPA is "
	}
}
