package repository.impl;

import java.util.*;
import connect.MysqlDBConnect;
import entity.Student;
import repository.Repository;
import java.sql.*; 

public class DBRepository implements Repository {

	
	private Connection connection = null; // 전역 DBConnection 객체 
	
	// DBRepository를 생성할때  Connection을 가지고 오겠다. 
	// -> 생성자에서 Connection을 맺겠다. 
	// new DBRespository(); <-- 커낵션이 자동으로 맺어진다. 
	
	public DBRepository() {
		try { 
			this.connection = MysqlDBConnect.getConnection();
		} catch(Exception ex) {
			System.out.println("DB 접속 에러 : " + ex.getMessage());
		}
	}
	
	
	// 전체 학생 들고오기 
	@Override
	public List<Student> selectStudents() throws Exception {
		
		String sql = "select * from student order by std_no asc";
		
		// statement / preparedStatement 로 쿼리 날릴준비 
		PreparedStatement pstmt = connection.prepareStatement(sql);
		
		// 쿼리날리기 (select 쿼리이기 때문에, ResultSet 객체로 테이블을 리턴받는다)
		ResultSet result = pstmt.executeQuery(); 
		
		// 리턴으로 돌려줄 POJO ( Plain Object Java Object ) 
		List<Student> resultList = new ArrayList<Student>(); 

		while(result.next()) {
			resultList.add(
							new Student(
										result.getInt("std_no"),
										result.getString("name"),
										result.getString("grade"), 
										result.getInt("score"),
										result.getString("insert_dt"), 
										result.getString("update_dt")
									)
			);
		}
		
		return resultList;
	}

	// 학번으로 학생 조회하기(학번은 유일무이함으로 한명만 리턴 Student)
	@Override
	public Student selectStudent(int stdNo) throws Exception {
		// TODO Auto-generated method stub
		
		String sql = "select * from student where std_no = ?";
		PreparedStatement pstmt = connection.prepareStatement(sql);
		pstmt.setInt(1, stdNo); // 1번째 ?를 stdNo값으로 치환해라. 
		ResultSet result = pstmt.executeQuery(); 
		Student student = null; 
		
		if(result.next()) {
			student = new Student(
							result.getInt("std_no"),
							result.getString("name"),
							result.getString("grade"), 
							result.getInt("score"),
							result.getString("insert_dt"), 
							result.getString("update_dt")
						);
		}
		
		return student;
	}

	// 학생 이름으로 학생 조회하기(동명이인 존재 가능 => 즉 List<Student> ) 
	@Override
	public List<Student> selectStudent(String name) throws Exception {
		
		String sql = "select * from student where name = ?";
		PreparedStatement pstmt = connection.prepareStatement(sql);
		pstmt.setString(1, name); // 1번째 ?를 name값으로 치환해라. 
		ResultSet result = pstmt.executeQuery(); 
		List<Student> students = new ArrayList<Student>(); // 리턴할 학생 List객체 
		if(result.next()) {
			students.add(
					      		new Student(
									result.getInt("std_no"),
									result.getString("name"),
									result.getString("grade"), 
									result.getInt("score"),
									result.getString("insert_dt"), 
									result.getString("update_dt")
								)
			);
		}
		return students;
	}

	@Override
	public Student lastInsertedStudent() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	// (C)RUD
	//-- 학생 등록하기 ( insert ) 
	@Override
	public boolean registStudent(Student student) throws Exception {
		String sql = "insert into student (name, grade, score) values ( ?, ?, ? )";
		PreparedStatement pstmt = connection.prepareStatement(sql);
		pstmt.setString(1, student.getName()); 
		pstmt.setString(2, student.getGrade()); 
		pstmt.setInt(3, student.getScore()); 
		int affectedRows = pstmt.executeUpdate();
		// 원래는 statement, praparedstatement 는 닫아줘야함
		pstmt.close(); 
		return affectedRows > 0;
	}

	
	// CR(U)D
	// 학생정보 업데이트 
	// 변경할대상의 학번(stdNo), 변경할 정보를 Student 타입의 객체로 받습니다. 
	@Override
	public int updateStudent(int stdNo, Student student) throws Exception {
		String sql = "update student set name = ?, grade = ?, score = ?"
				       + ", update_dt=current_timestamp() where std_no = ?";
		
		PreparedStatement pstmt = connection.prepareStatement(sql);
		pstmt.setString(1, student.getName()); 
		pstmt.setString(2, student.getGrade()); 
		pstmt.setInt(3, student.getScore()); 
		pstmt.setInt(4, stdNo);
		
		int affectedRows = pstmt.executeUpdate(); 
		pstmt.close();
		return affectedRows;
	}
	
	
	// CRU(D)
	// 학번을 기준으로 데이터베이스에서 Row 한개 삭제 
	@Override
	public boolean deleteStudent(int stdNo) throws Exception {
		String sql = "delete from student where std_no = ?";
		PreparedStatement pstmt = connection.prepareStatement(sql);
		pstmt.setInt(1, stdNo);
		int affectedRows = pstmt.executeUpdate(); 
		pstmt.close();
		// TODO Auto-generated method stub
		return affectedRows > 0;
	}

	@Override
	public void closeRepository() throws Exception {
		// TODO Auto-generated method stub
		MysqlDBConnect.closeConnection();
	}

}
