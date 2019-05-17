package com.tiedros.student.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.tiedros.student.dal.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
