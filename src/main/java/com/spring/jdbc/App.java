package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.spring.jdbc.dao.StudentDAO;
import com.spring.jdbc.entities.Student;

public class App {

	public static void main(String[] args) {
		System.out.println("My Program Started");
//spring jdbc=>jdbcTemplate
//		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
//		JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);

//		Insert Query
//		String query = "insert into student(id,name,city) values(?,?,?)";

//		fire query
//		int result = template.update(query, 444, "Gayasuddin Kumar", "Manpur");
//		System.out.println("Number of Record Inserted.." + result);

		StudentDAO studentDao = context.getBean("studentDao", StudentDAO.class);
//		*************Inserting Data into Database**************

		/*
		 * Student student = new Student(); student.setId(555);
		 * student.setName("Ravan Kumar"); student.setCity("Colombo"); int result =
		 * studentDao.insert(student); System.out.println(result);
		 */

//		******************Updating Existing data*******************
		/*
		 * Student student=new Student(); student.setId(333);
		 * student.setName("Pawan Lomoh"); student.setCity("Tokyo"); int result =
		 * studentDao.change(student); System.out.println("Data Changed: "+result);
		 */

//		********************Deleting Data from Database**************
		/*
		 * int result = studentDao.delete(555); System.out.println("Deleted: "+result);
		 */

//		*****************Select Single Row************************
		/*
		 * Student student = studentDao.getStudent(333); System.out.println(student);
		 */

//		*****************Select All Row************************
		List<Student> students = studentDao.getAllStudents();
		for (Student stu : students) {
			System.out.println(stu);
		}
	}

}
