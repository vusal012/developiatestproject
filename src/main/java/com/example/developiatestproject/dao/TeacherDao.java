package com.example.developiatestproject.dao;


import com.example.developiatestproject.model.Teacher;

import java.util.List;

public interface TeacherDao {

	public List<Teacher> getTeacherList() throws Exception;

	void addteacher(Teacher teacher) throws Exception;

	Teacher updateTeacher(Teacher teacher) throws Exception;

	public Teacher getTeacherById(Long id) throws Exception;

	void deleteTeacher(Long id) throws Exception;

	//public List<Teacher> searchTeacher(String keyword) throws Exception;

}
