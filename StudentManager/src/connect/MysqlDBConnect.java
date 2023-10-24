package connect;

import java.sql.*; 

// 데이터 베이스 커넥션 클래스 
public class MysqlDBConnect {

	// 싱글턴패턴으로 DBConnection을 사용할 것입니다. 
	// 한번 연결되면 끊길때 까지 connection이 유지되는 구조 
	private static Connection conn = null; 
	
	//-- DB연결 (connection) 객체 리턴 
	public static Connection getConnection() throws Exception {
		
		//-- 한번도 연결한적이 없을때 연결작업 수행 
		if( conn == null ) {
			
			// 1. mysql 드라이버 로딩 
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2. DriverManager를 이용한 connection 객체 얻기 
			conn = DriverManager.getConnection(
						"jdbc:mysql://lodossw-mysql.cepsqcj7hjbg.ap-northeast-2.rds.amazonaws.com:3306/javalec", 
						"root",
						"a1234567890"
//						 "urlString jdbc:mysql://엔드포인트:포트/접근데이터베이스명",
//						 "id",
//						 "password"
					);
			
		}
		
		return conn; 
	}
	
	//-- 연결된 DB 끊기. 
	public static void closeConnection() throws Exception {
		if(conn != null && !conn.isClosed()) conn.close();
	} 
	
}
