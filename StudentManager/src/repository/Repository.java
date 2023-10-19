package repository;

import java.util.List;
import entity.Student;

public interface Repository {
	
	// CRUD 
	// 1. Read(Select)
	// 학생목록 전체 들고오기 
	List<Student> selectStudents() throws Exception; 
	
	// 학생정보 하나 불러오기 (학번기준으로 Where 해와라) 
	Student selectStudent(int stdNo) throws Exception; 
	
	// 학생이름으로 학생정보 불러오기 
	// 동명이인이 존재할 수 있으니 
	List<Student> selectStudent(String name) throws Exception;
	
	// 최종 추가된 학생 하나 불러오기 
	abstract Student lastInsertedStudent() throws Exception;
	
	// 2. Create(Insert) 
	// 학생 입력하기 
	boolean registStudent(Student student) throws Exception; 
	
	
	// 3. Update(Update) 
	// 학생 한명 수정하기
	int updateStudent(int stdNo, Student student) throws Exception; 
	

	// 4. Delete(Delete) 
	// 학생 한명 삭제하기 
	boolean deleteStudent(int stdNo) throws Exception; 
	
	// 5. 자원반납(DB Close) 
	void closeRepository() throws Exception; 
	
	
}
