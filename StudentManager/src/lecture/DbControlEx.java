package lecture;

import java.sql.*; 

// 자바에선 DB를 사용할때는 JDBC (Java DataBase Connectivity)
// java.sql 패키지에 존재합니다. 
// !) java.sql은 대부분 추상클래스와 Interface 로 구성되어 있고, 
// 따라서 내가 접속해야할 DBMS에서 제공하는 Driver라는 놈을 사용해야 합니다.
// ex) mysql driver, Oracle driver ( jdbc connect/j ) 
// Driver를 구하는데는 크게 2군데 
// 1. DBMS 회사 사이트 
// https://mysql.com
// 2. Maven Repository ( 스프링이나 기타등등 할때 사용 ) 
// https://mvnrepository.com/


// JDBC 데이터베이스 사용방법
// 1. 밴더의 jdbc driver를 로딩한다. 
// 2. DB Connection을 한다. 
// 3. 질의문(SQL)을 날린다
// 4. 3의 결과를 가공한다. 
// 5. 2번에서한 Connection을 닫는다.


public class DbControlEx {
	
	public static void main(String args[]) throws Exception {
		
		// 1.  밴더(mysql)의 jdbc driver(connector/j)를 로딩한다. 
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		
		// 2. Connection을 맺는다 
		// DB에 접속해서 -> 로그인까지 + 사용할 데이터베이스(폴더)까지 결정 
		// http://naver.com -> 주소 
		// DBConnection을 얻을려면 Host, id, password, port 정보   
		
		Connection conn = DriverManager.getConnection(
				"jdbc:mysql://lodossw-mysql.cepsqcj7hjbg.ap-northeast-2.rds.amazonaws.com:3306/javalec08", 
				// JAVA connection String
				"root", 
				"a1234567890"
		);
		
		
		//-- (R)ead
		//String sql = "SELECT * FROM test_table";
		String sql = "SELECT * FROM test_table Where user_name = '이종석'";
		
		//-- 자바에서는 DB에 질의를 할때 2가지 타입 
		//-- 1. statement, 
		//-- 2. preparedStatement; 
		
		// Statement 사용
		Statement stmt = conn.createStatement(); 
		ResultSet rs = stmt.executeQuery(sql); 
		
		while(rs.next()) {
			System.out.println(
					String.format("user_no : %d, user_name : %s",
									    rs.getInt("user_no"),
									    rs.getString("user_name") 
					)
			); 
		}
		
		//-- (C)reate -> Insert 
		//sql = "insert into test_table (user_no, user_name) values ('10','이종석')"; 
		
		sql = "insert into test_table (user_no, user_name) values (?,?)"; 
		// PreparedStatement 사용 
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, 10);
		pstmt.setString(2, "하악하악");
		pstmt.execute(); 
		
		//pstmt.close();
		
		// (U)pdate 
		sql = "update test_table set user_name = ? where user_name = ?"; 
		//pstmt = conn.prepareStatement(sql);
		PreparedStatement pstmt2 = conn.prepareStatement(sql);
		pstmt2.setString(1, "AAA");
		pstmt2.setString(2, "하악하악");
		pstmt2.execute(); 
		
		// Delete 
	 	// PreparedStatement pstmt3 로 user_name = 'AAA'인것만 삭제하라 
		
		
		
		conn.close(); // 5. 커넥션을 닫는다. (자원반납) 
		
	}

}
