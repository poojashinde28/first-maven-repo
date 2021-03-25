package com.lti.view;

import com.lti.model.Employee;

public class EmpView {

	public static void main(String []args){
		Employee emp=new Employee();
		emp.setEmpId(1001);
		emp.setName("mark");
		System.out.println(emp.getEmpId()+" "+emp.getName());
	}
}
