package com.prashant;

import java.sql.Connection;
import java.sql.SQLException;

import com.prashant.config.DBConfigurationService;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException {
		try(Connection connection  = DBConfigurationService.getConnection()){
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
