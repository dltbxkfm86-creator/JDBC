package com.kh.run;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectRun {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		
			conn = DriverManager.getConnection("jdbc:oracle:thin:@115.90.212.20:10000:XE"
											  ,"PSM06"
											  ,"PSM061234");
			pstmt = conn.prepareStatement(
										"""
											SELECT 
												   PLANT_ID
									             , NAME
									             , SPECIES
									             , WATERING_CYCLE
									             , SUNLIGHT
									             , CREATED_AT
									          FROM PLANT
									         ORDER 
									         	BY 
									         	   PLANT_ID DESC
										"""
					);
			
			rset = pstmt.executeQuery();
			
			while (rset.next()) {
                int plantId = rset.getInt("PLANT_ID");
                String name = rset.getString("NAME");
                String species = rset.getString("SPECIES");
                int wateringCycle = rset.getInt("WATERING_CYCLE");
                String sunlight = rset.getString("SUNLIGHT");
                java.sql.Date createAt = rset.getDate("CREATED_AT");

                System.out.printf("%d | %s | %s | %d | %s | %s%n",
                                  plantId, name, species, wateringCycle, sunlight, createAt);
            }
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
