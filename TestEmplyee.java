Program Name: Test Employee 
Objective: Create a class for employee and test 
Programmer: Felipe SG


public class testEmployee {

	public static void main(String[] args) 
	{
		//create 3 instances of our Employee class (template)
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		//This will not work because its private
		//e1.firstName = "Marshall";
		
		e1.display();
		e1.setFirstName("Marshall");
		e1.setLastName("radzsomethingsomething");
		e1.display();
		
		e2.setFirstName("Felipe");
		e2.setLastName("SG);
		e2.display();
		
		String souza = e2.getLastName();
		
		

	}

}

