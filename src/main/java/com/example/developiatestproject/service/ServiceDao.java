package com.example.developiatestproject.service;

import com.example.developiatestproject.dao.StudentDao;
import com.example.developiatestproject.dao.TeacherDao;
import com.example.developiatestproject.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceDao {
    @Autowired
    private TeacherDao teacherDao;

    @Autowired
    private StudentDao studentDao;

   public List<Teacher> getTeacherList(){
       List<Teacher> listTeacher = new ArrayList<>();
       try {
            listTeacher = teacherDao.getTeacherList();
       } catch (Exception e) {
           e.printStackTrace();
       }
       return listTeacher ;
   }
}
