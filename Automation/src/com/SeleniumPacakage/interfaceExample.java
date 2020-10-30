package com.SeleniumPacakage;
interface vehicles
{
	public void types();
	public void wheels();
	
}

public class interfaceExample implements vehicles {
	public void types()
	{
		System.out.println("there are so many types in vehicles");
				
	}
	public void wheels()
	{
		System.out.println("based on the types we will have to decide the wheels");
	}

	public static void main(String[] args) {
	vehicles obj=new interfaceExample();
	obj.types();
	obj.wheels();

	}

}
