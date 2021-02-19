package com.stigentech2.com;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.stigentech2.com.Service.Studentservice;
import com.stigentech2.com.model.Student;

@SpringBootApplication
public class SpringbootJpaApplication {

	public static void main(String[] args) {
		ApplicationContext at=SpringApplication.run(SpringbootJpaApplication.class, args);
		Studentservice dao=at.getBean(Studentservice.class);
		Student stud=new Student();
		/***save record***/
		//stud.setId(14);
		//stud.setName("varun");
		//stud.setAddress("medchal");
		//dao.Ssave(stud);
		/***update record***/
		//stud.setId(14);
		///stud.setName("varshini");
		//stud.setAddress("manuguru");
		//dao.Supdate(stud);
		/***delete record***/
		//dao.delete(14);
		/*** list of all records***/
		//List<Student>list=dao.Sfindall();
		//for(Student std:list)
			//System.out.println(std);
		/***find by id ***/
			//Optional<Student>stud1=dao.Sfindbyid(7);

			//Student student=stud1.get();
				//System.out.println(student.getId());
				//System.out.println(student.getName());
				//System.out.println(student.getAddress());
		/*** find by name**/
		//List<Student>stud2=dao.namelike("%s%");
		//for(Student student:stud2)
			//System.out.println(student);
		/***find by address***/
			//List<Student>stud2=dao.addresslike("%hyd%");
			//for(Student student:stud2)
				//System.out.println(student);
		/**find by name in jpql**/
		List<Student>stud3=dao.Studentbyname("jaya");
		for(Student student:stud3)
			{
				System.out.println(student.getId());
				System.out.println(student.getName());
				System.out.println(student.getAddress());
				System.out.println("----------------------------");
			}
		/***find by address in jpql**/
		List<Student>stud4=dao.Studentbyaddress("hyd");
		for(Student student1:stud4)
			{
				System.out.println(student1.getId());
				System.out.println(student1.getName());
				System.out.println(student1.getAddress());
				System.out.println("----------------------------");
			}
		
		/**find by name and address in jpql**/
		List<Student>stud5=dao.StudentNameandAddress("sai","hyd");
		for(Student student2:stud5)
		{
			System.out.println(student2.getId());
			System.out.println(student2.getName());
			System.out.println(student2.getAddress());
		    System.out.println("----------------------------");
			
		}
			
	}
	

}
