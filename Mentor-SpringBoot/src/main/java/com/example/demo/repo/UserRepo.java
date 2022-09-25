package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.demo.Entity.Student;

@Repository
public interface UserRepo extends JpaRepository<Student, Integer> {

}
