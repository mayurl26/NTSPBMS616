package com.nt.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.sbeans.Employee;
@Repository
public class EmployeeDAOImpl implements IEmployeeDAO {
	private static final String INSERT_EMP_QUERY="INSERT INTO EMPLOYEE_INFO VALUES(ENO_SEQ.NEXTVAL,?,?,?,?,?)";
	@Autowired
	private DataSource ds;
	@Override
	public int insertEmployee(Employee emp) throws Exception {
		try(Connection con=ds.getConnection() ;
				PreparedStatement ps= con.prepareStatement(INSERT_EMP_QUERY)){
			if(ps!=null) {
				ps.setString(1, emp.getEname());
				ps.setString(2, emp.getEadd());
				ps.setDouble(3, emp.getBasicSalary());
				ps.setDouble( 4, emp.getGrossSalary());
				ps.setDouble(5, emp.getNetSalary());
				
			}
			System.out.println(ds.getClass());
			int count= ps.executeUpdate();
			return count;
			
		}
		catch (SQLException e) {
			e.printStackTrace();
			throw e;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw e;
			
		}
	
	}

}
