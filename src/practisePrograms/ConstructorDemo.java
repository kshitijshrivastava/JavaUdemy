package practisePrograms;

public class ConstructorDemo {
	
	
	public ConstructorDemo()
	{
		System.out.println("Executing Defalut const");
	}
	
	public ConstructorDemo(int a)
	{
		System.out.println("Executing int const");
	}
	
	public ConstructorDemo(String str)
	{
		System.out.println("Executing String const");
	}


	public static void main(String[] args) {
		
		ConstructorDemo cd = new ConstructorDemo();
		ConstructorDemo cd1 = new ConstructorDemo(10);
		ConstructorDemo cd2 = new ConstructorDemo("Hello");
		
		
		// TODO Auto-generated method stub

	}

}
