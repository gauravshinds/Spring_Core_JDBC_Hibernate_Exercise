package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entity.Student;

public class StudentDaoImpl implements StudentDao {
	
	private JdbcTemplate jdbcTemplate;

	public int insert(Student student) {
		//Inserting data into table
		String query = "insert into student(id,name,city) values(?,?,?)";
		int res = this.jdbcTemplate.update(query,student.getId(),student.getName(), student.getCity());
		return res;
	}
	
	public int update(Student student) {
		//update data into table
		String query = "update student set name=?, city=? where id=?";
		int res = this.jdbcTemplate.update(query,student.getName(), student.getCity(), student.getId());
		return res;
	}
	
	public int delete(int studentId) {
		String query = "delete from student where id=?";
		int res = this.jdbcTemplate.update(query, studentId);
		
		return res;
	}
	
	public Student getStudent(int studentId) {
		String query = "select * from student where id=?";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student student = this.jdbcTemplate.queryForObject(query, rowMapper, studentId);
		return student;
	}
	
	public List<Student> getAllStudent() {
		String query = "select * from student";
		List<Student> allStudent = this.jdbcTemplate.query(query, new RowMapperImpl());
		return allStudent;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	

	
	

}
