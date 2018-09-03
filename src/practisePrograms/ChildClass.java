package practisePrograms;

public class ChildClass extends ParentClass {
	
	//String name = "ChildName";
	
	public void getName()
	{
		super.getName();
		System.out.println("Method getName() of child class");
	}
	
	public ChildClass()
	{
		super();
		System.out.println("Constructor of child class");
	}
	
	

	public static void main(String[] args) {
		
		ChildClass cd = new ChildClass();
		System.out.println(cd.name);
		cd.getName();
		//name1= super.name;
		// TODO Auto-generated method stub

	}

}
