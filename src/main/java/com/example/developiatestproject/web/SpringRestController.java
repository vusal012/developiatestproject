package com.example.developiatestproject.web;

import com.example.developiatestproject.dao.StudentDao;
import com.example.developiatestproject.dao.TeacherDao;
import com.example.developiatestproject.model.Teacher;
import com.example.developiatestproject.service.ServiceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SpringRestController {

    @Autowired
    private ServiceDao serviceDao;

    @RequestMapping(method = RequestMethod.GET,value = "/getTeacher")
    public List<Teacher> getTeacher(){
        List<Teacher> teacherList =  serviceDao.getTeacherList();
        return teacherList;
    }
    
}
