package com.sowmik.servletdemo.mvctwo;

import java.util.ArrayList;
import java.util.List;

public class StudentDataUtil {
	public static List<Student> getStudents() {
		
		// create an empty list
		List<Student> students = new ArrayList<>();
		
		
		// add sample data
		students.add(new Student("Ahsan", "Habib", "sowmik.sec@gmail.com"));
		students.add(new Student("Jordi", "Polla", "jordi.nino@gmail.com"));
		students.add(new Student("Volga", "Rahman", "volga.rahman@gmail.com"));
		students.add(new Student("Asadul", "Bishwash", "asadul.biswash@gmail.com"));
		students.add(new Student("Sada", "Babu", "sada.babu@gmail.com"));
		
		// return the list
		return students;
		
	}
}
