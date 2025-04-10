package com.prashant.simpleJDBC;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

import com.prashant.simpleJDBC.config.DBConfigurationService;

public class Main {

	public static void main(String[] args) {

		try (Connection connection = DBConfigurationService.getConnection(); Scanner sc = new Scanner(System.in);) {
			System.out.println("Welcome to School Management System");

		}
		catch(Exception ex){
			ex.printStackTrace();
		}

	}

}
