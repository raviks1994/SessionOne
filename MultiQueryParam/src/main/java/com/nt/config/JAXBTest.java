package com.nt.config;

import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class JAXBTest {

	public static void main(String[] args) throws Exception {
		Employee e1=new Employee();
		e1.setId(101);
		e1.setName("raaja");
		e1.setSalary(10000);
		Employee e2=new Employee();
		e2.setId(102);
		e2.setName("ravi");
		e2.setSalary(10000);
		
		
		Employees e=new Employees();
		ArrayList<Employee> al=new ArrayList<>();
		al.add(e1);al.add(e2);
		e.setEmployees(al);
		JAXBContext context=JAXBContext.newInstance(Employees.class);
		Marshaller marshaller=context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(e, new File("data3.xml"));
		System.out.println("done");
		
	
	}

}
