package com.kh.employee.model.dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.ibatis.session.SqlSession;

import com.kh.employee.model.vo.Employee;


public class EmployeeDAO {

	public List<Employee> findAll(SqlSession session, int empId, String enpName, String deptCode, String jobCode, int salary) {
		
		
		return session.findAll("employeeMapper.findAll");
		
	}


}
