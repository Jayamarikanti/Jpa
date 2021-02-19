package com.stigentech2.com.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.stigentech2.com.model.Student;
@Repository
public interface Studentrepository extends JpaRepository<Student,Serializable> {

List<Student>findStudentByNameLike(String name);
List<Student>findStudentByAddressLike(String address);
//jpql
@Query("select s from Student s where s.name=:name")
List<Student>findStudentByName(@Param("name")String name);
@Query("select s from Student s where s.address=:address")
List<Student>findStudentByAddress(@Param("address")String address);
@Query("select s from Student s where s.name=:name AND s.address=:address")
List<Student>findStudentByNameAndAddress(@Param("name")String name, @Param("address")String address);

}
