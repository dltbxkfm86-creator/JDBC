package com.kh.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.kh.model.vo.Plant;

public class PlantDao {
	private final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private final String URL = "jdbc:oracle:thin:@115.90.212.20:10000:XE";
	private final String USERNAME = "PSM06";
	private final String PASSWORD = "PSM061234";
	
	
	public int plantSave(Plant plant) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = 0;
		
		String sql = """
						INSERT
						  INTO
						  	   PLANT
						  	   (
						  	   PLANT_ID
						  	 , PLANT_NAME
						  	 , SPEICES
						  	 , WATERINGCYCLE
						  	 , SUNLIGHT
						  	 , CREATE_AT
						  	   )
						 VALUES
						       ?
						     , ?
						     , ?
						     , ?
						     , ?
						     , ?  
				               )
					 """;
		try {
			Class.forName(DRIVER);
		
		try {
			conn = DriverManager.getConnection(URL,USERNAME, PASSWORD);
			conn.setAutoCommit(false);
			pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, plant.getPlantId());
			pstmt.setString(2, plant.getPlantName());
			pstmt.setString(3, plant.getSpecies());
			pstmt.setString(4, plant.getWateringCycle());
			pstmt.setInt(5, plant.getSunlight());
			pstmt.setString(6, plant.getCreateAt());
			
			result = pstmt.executeUpdate();
			
			if(result > 0) {
				conn.commit();
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(pstmt != null) {				
				pstmt.close();
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} try {
			if(conn != null) {				
				conn.close();
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}

	return result;
}
