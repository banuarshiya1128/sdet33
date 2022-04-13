package com.crm.unittesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mysql.cj.jdbc.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class RmgYantra {

	public static void main(String[] args) throws Throwable {
Connection connection= null; String url = null; String projectid = null; String username =null; String passwords = null;
 //step1: we should create the object for the driver and register the driver
	Driver d = new Driver();
	DriverManager.registerDriver(d);
	//get connection
	Connection connection1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/projects", "root", "root");
	//create statement
	Statement statement = connection1.createStatement();
	//execute query
	int result = statement.executeUpdate("insert into project(project_id, created_by, created_on, project_name, status,team_size) values('TY_PROJ_005','Test Yanta','24/03/2022','sdet33','ongoing',0)");		
	//execute query
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("http://localhost:8084/");
	driver.findElement(By.id("usernmae")).sendKeys("rmgyantra");
	driver.findElement(By.id("inputPassword")).sendKeys("rmgy@9999");
	driver.findElement(By.xpath("//button [text()='Sign in']")).click();
	driver.findElement(By.linkText("Projects"));

}
}
