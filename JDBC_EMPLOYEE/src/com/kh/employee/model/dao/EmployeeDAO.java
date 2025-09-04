package com.kh.employee.model.dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.kh.employee.model.vo.Employee;

public class EmployeeDAO {
	private Properties prop = new Properties();
	
//	public EmployeeDao() {
//		prop.loadFromXML(new FileInputStream("));d
//	}
//	
	public List<Employee> selectEmp(Connection conn) {
		List<Employee> employees = new ArrayList(); 
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String sql = prop.getProperty("selectEmp");
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				Employee mEmployee = new Employee(rset.getInt("EMP_ID")
												 ,rset.getString("EMP_NAME")
												 ,rset.getInt("SALARY")
												 ,rset.getString("DEPT_CODE")
						
						
						
						
						)
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
}
