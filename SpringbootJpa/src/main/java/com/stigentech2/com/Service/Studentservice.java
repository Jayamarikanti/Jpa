package com.stigentech2.com.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stigentech2.com.dao.Studentrepository;
import com.stigentech2.com.model.Student;

@Service
public class Studentservice {
	@Autowired
	public Studentrepository rep;
	public Student Ssave(Student s) {
		return rep.save(s);
	}
	public Student Supdate(Student s) {
		return rep.save(s);
	}
	public void delete(int id) {
		rep.deleteById(id);
	}
	public List<Student>Sfindall(){
		return rep.findAll();
	}
	public  Optional<Student>Sfindbyid(int id){
		return rep.findById(id);
	}
	public List<Student>namelike(String name){
		return rep.findStudentByNameLike(name);
	}
	public List<Student>addresslike(String address){
		return rep.findStudentByAddressLike(address);
	}
	public List<Student>Studentbyname(String name){
		return rep.findStudentByName(name);
	}
	public List<Student>Studentbyaddress(String address){
		return rep.findStudentByAddress(address);
	}
	public List<Student>StudentNameandAddress(String name,String address){
		return rep.findStudentByNameAndAddress(name,address);
	}
}


