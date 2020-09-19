package com.example.developiatestproject.dao;
import com.example.developiatestproject.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface StudentDao extends JpaRepository<Student,Integer>{
}
