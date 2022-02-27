package com.zensar.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.training.bean.Circle;
import com.zensar.training.bean.Employee;
import com.zensar.training.bean.Square;
import com.zensar.training.bean.Student;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
    	
    	Student student;
    	student=(Student)applicationContext.getBean("stud");
    	System.out.println(student);
    	
    	Square square=(Square)applicationContext.getBean("sqr");
    	System.out.println(square);
    	
    	Circle circle=(Circle)applicationContext.getBean("circ");
    	System.out.println(circle);
    	
    	Employee employee=(Employee)applicationContext.getBean("employee");
    	employee.setId(101);
    	employee.setName("jhon");
    	employee.setBasic(1000.00);
    	
    	System.out.println("Allowance : "+employee.getAllowance());
    	System.out.println("Deduction : "+employee.getDeduction());
    }
}
