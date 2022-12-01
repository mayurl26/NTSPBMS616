package com.nt.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.SimpleLayout;



public class SelectTest1 {
	
	private static Logger logger=Logger.getLogger("SelectTest.class");
	static {
		try {
			PropertyConfigurator.configure("src/com/nt/commons/log4j.properties");
			logger.info("Log4j setup ready ");
		}
		catch (Exception e) {
			logger.fatal("Unknown exeception occured ");
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		logger.debug("starting of main method");
		Connection con=null;
		Statement st= null;
		ResultSet rs= null;
		
		try {
			logger.debug("in try block");
			//loading JDBC driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			logger.info("done with loading JDBC driver");
			//establishing connection with oracle driver
			con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","System","manager");
			logger.info("Done with establishing connection with JDBC driver ");
			if(con!=null) {
				st=con.createStatement();
				logger.debug("Statement obj is created");
			}
			if(st!=null) {
				
				rs=st.executeQuery("select * from student");
				logger.info("Query is loded and executed" );
			}
			if(rs!=null) {
			while(rs.next()!=false) {
				System.out.println(rs.getString(1)+"   "+rs.getString(2)+"   "+rs.getString(3)+"    "+rs.getString(4));
				
			
			}}
			
			
		}
		catch (SQLException se) {
			// TODO: handle exception
			se.printStackTrace();
			se.getMessage();
			logger.error("SQL Exception occured");
		}
		catch(Exception e) {
			e.printStackTrace();
			logger.fatal("Unknown exception occured");
		}
		finally {
			if(rs!=null) {
				try {
					rs.close();
					logger.info("Resultset obj is closed");
				}catch(SQLException e) {
					e.printStackTrace();
					logger.info("problem in closing rs obj");
				}
			}
			if(st!=null) {
				try {
					st.close();
					logger.info("Statement obj is closed");
				}catch(SQLException e) {
					e.printStackTrace();
					logger.info("problem in closing st obj");
				}
			}
			if(con!=null) {
				try {
					con.close();
					logger.info("connection obj is closed");
				}catch(SQLException e) {
					e.printStackTrace();
					logger.info("problem in closing rs obj");
				}
			}
		}
	}

}
