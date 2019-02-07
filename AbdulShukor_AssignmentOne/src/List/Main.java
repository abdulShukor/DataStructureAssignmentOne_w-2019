package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//List<Employee> employeeList = new ArrayList<>();
		
		// vector is similar to array list but it thread safe and synchronize
		List<Employee> employeeList = new Vector<>();
		

		
		employeeList.add(new Employee("Abdul","Shukor",10));
		
		employeeList.add(new Employee("muhammad","yousofzai",20));

		employeeList.add(new Employee("Zeenat","Yousufzai",30));
		
		
		//employeeList.forEach(employee->System.out.println(employee));
		
		// we are getting the second element in the list and list start with zero index
//		System.out.println(employeeList.get(1));
		
		// checking if its empty
//		System.out.println(employeeList.isEmpty());
		
		//setting an employee by index
		employeeList.set(1, new Employee("Ali","Khna",40));
	employeeList.forEach(employee->System.out.println(employee));
	
	// checking the size not the capacity
	System.out.println(employeeList.size());
	
	
	employeeList.add(1, new Employee("abdul" , "shukor",20));
	employeeList.forEach(employee->System.out.println(employee));
	
	// checking to find the instance occupy which index number
	
	System.out.println(employeeList.indexOf(new Employee("abdul","shukor",20)));

	
	//removing items
	employeeList.remove(1);
	employeeList.forEach(employee->System.out.println(employee));

//re

	}

}
