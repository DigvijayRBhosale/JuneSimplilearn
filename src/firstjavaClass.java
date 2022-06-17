
public class firstjavaClass {

	public static void main(String[] args) {
		
		//creating an object of type student
		student student1=new student(); //thist will called default constructor
		System.out.println(student1.name);
		// Two ways to assign Values
		
		// Way 1: assiging values to the properties
		student1.name="Sudha1";
		student1.rollNo=123;
		
		// Way 2: or we can use constructor to assign values to properties/instance 
		student student2=new student("Shreyansh",234,"FSD Phase 1");
		System.out.println(student2.name);
		
	}
}


class student{
	String name; // properties or data or instance variable 
	int rollNo;
	String courseEnrolled;
	
	//METHODs
	void attendSession() { 
		
		//open webx
		//login to webx using your roll No
		//join the course you have enrolled
	}
	
	//constructer overloading
	//Constructer - - -> non argument constructer
	student (){
		
	}
	
	//Parametrized costructer
	student (String Name,int Roll,String Course){
		name=Name;
		rollNo=Roll;
		courseEnrolled=Course;
		
		int x; // --local variable
	}
}