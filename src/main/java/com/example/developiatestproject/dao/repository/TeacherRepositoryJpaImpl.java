package com.example.developiatestproject.dao.repository;

import com.example.developiatestproject.dao.TeacherDao;
import com.example.developiatestproject.model.Teacher;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class TeacherRepositoryJpaImpl implements TeacherDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Teacher> getTeacherList() {
        return entityManager.createQuery("Select c from Teacher c", Teacher.class).getResultList();
    }

    @Override
    public void addteacher(Teacher teacher) throws Exception {
        entityManager.persist(teacher);
    }

    @Override
    public Teacher updateTeacher(Teacher teacher) throws Exception {

        return entityManager.merge(teacher);
    }

    @Override
    public Teacher getTeacherById(Long id) throws Exception {
        return entityManager.find(Teacher.class, id);
    }

    @Override
    public void deleteTeacher(Long id) throws Exception {
        entityManager.remove(entityManager.getReference(Teacher.class, id));
    }
   /* @Override
    public List<Teacher> searchTeacher(String keyword) throws Exception {
        return entityManager.createQuery("Select t from Teacher t where name= :%keyword% or surname= :%keyword%" , Teacher.class)
               .setParameter("keyword",keyword)
               .getResultList();
    }*/
}
