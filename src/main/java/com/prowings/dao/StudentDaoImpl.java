package com.prowings.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.prowings.entity.Student;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void saveStudent(Student std) {
		System.out.println(">>>>> StudentDaoImpl.saveStudent() called!!");
		Session session = null;
		try {
			session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			Integer id = (Integer) session.save(std);
			tx.commit();
			System.out.println(">>>>> Student saved with id: " + id);
		} catch (Exception e) {
			System.out.println("some error while storing Student object to DB!!!");
			e.printStackTrace();
		} finally {
			session.close();
		}
		System.out.println(">>>>> StudentDaoImpl.saveStudent() ended!!");
	}

	@Override
	public List<Student> getAllStudents() {
		System.out.println(">>>>> StudentDaoImpl.getAllStudents() called!!");
		Session session = null;
		List<Student> students = null;
		try {
			session = sessionFactory.openSession();
			students = session.createQuery("from Student").list();
		} catch (Exception e) {
			System.out.println("some error while fetching Student objects from DB!!!");
			e.printStackTrace();
		} finally {
			session.close();
		}
		System.out.println(">>>>> StudentDaoImpl.getAllStudents() ended!!");
		return students;
	}

	@Override
	public void updateStudent(Student std) {
		System.out.println(">>>>> StudentDaoImpl.updateStudent() called!!");
		Session session = null;
		try {
			session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			session.update(std);
			tx.commit();
			System.out.println(">>>>> Student updated with id: " + std.getId());
		} catch (Exception e) {
			System.out.println("some error while updating Student object to DB!!!");
			e.printStackTrace();
		} finally {
			session.close();
		}
		System.out.println(">>>>> StudentDaoImpl.updateStudent() ended!!");
		
	}

}
