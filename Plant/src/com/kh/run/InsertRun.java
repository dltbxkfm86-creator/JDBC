package com.kh.run;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertRun {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("번호를 입력해주세요");
		int num = sc.nextInt();
		sc.nextLine();
		
		System.out.println("이름을 입력하세요");
		String name = sc.nextLine();
		
		System.out.println("종을 입력하세요");
		String species = sc.nextLine();
		
		System.out.println("물주는 주기를 입력하세요");
		int waterCycle = sc.nextInt();
		sc.nextLine();
		
		System.out.println("햇빛 조건을 입력하세요");
		String sunlight = sc.nextLine();
		
		System.out.println("등록일을 입력하세요");
		String create = sc.nextLine();
		
		String sql = """
						 INSERT
						   INTO
						     	PLANT
						 VALUES
						        (
						        ?
						      , ?
						      , ?
						      , ?
						      , ?
						      , ?
						        )
				
					 """;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver등록 성공!");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@115.90.212.20:10000:XE"
											  ,"PSM06"
											  ,"PSM061234");
			System.out.println("DB서버 접속 성공!");
			conn.setAutoCommit(false);
			
			pstmt = conn.prepareStatement(sql);
			System.out.println("Statement 객체 생성!");
			
			pstmt.setInt(1, num);
			pstmt.setString(2, name);
			pstmt.setString(3, species);
			pstmt.setInt(4, waterCycle);
			pstmt.setString(5, sunlight);
			pstmt.setString(6, create);
			
			result = pstmt.executeUpdate();
			System.out.println("SQL문 실행 성공!");		
			if(result > 0) {
				conn.commit();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) {
					pstmt.close();					
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if(conn != null) {
					conn.close();					
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}
