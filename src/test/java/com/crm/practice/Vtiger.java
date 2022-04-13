package com.crm.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mysql.cj.jdbc.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Vtiger {

	public static void main(String[] args) throws Throwable {
		Connection connection = null; String url = null; String username =null; String password = null;
		//step:1 we should create the object for the driver and register the driver
try {
	Driver driver = new Driver();
	DriverManager.registerDriver(driver);
	//get connection
	Connection connection1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sdet33", "root", "root");
	//create statement
	Statement statement = connection1.createStatement();
	//execute query
	ResultSet result = statement.executeQuery("select * from sdet33;");
	while(result.next()) {
		System.out.println(result.getString(2));
		System.out.println(result.getString(3));

		System.out.println(result.getString(4));
	
		
	
	
	
	
	}}

	finally {
		//step5: close connection
		connection.close();
		System.out.println("connection is closed");
	WebDriverManager.chromedriver().setup();
	WebDriver driver1= new ChromeDriver();
	driver1.get(url);
	
	}
}
}

	




