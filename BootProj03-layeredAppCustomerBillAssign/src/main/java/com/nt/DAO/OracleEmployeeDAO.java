package com.nt.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import com.nt.sbeans.Customer;

@Repository("CustDAO")

public class OracleEmployeeDAO implements ICustomerRagistration {
	int count=0;
	private static final String Customer_Insert_Query="INSERT INTO CUSTOMER_INFO VALUES(CUST_NO_SEQ.NEXTVAL, ?,?,?,?,?)";
	
	@Autowired
	private DataSource ds;
	
	@Override
	public int registerCustomer(Customer cust) throws Exception {
		try(Connection con= ds.getConnection();
				PreparedStatement ps=con.prepareStatement(Customer_Insert_Query)){
			if(ps!=null) {
				ps.setString(1, cust.getCname());
				ps.setString(2, cust.getCadd());
				ps.setDouble(3, cust.getCoreBill());
				ps.setDouble(4, cust.getTotalBill());
				ps.setDouble(5, cust.getAfterDiscount());
			}
			
			count=ps.executeUpdate();
			System.out.println("Injected datascourse class name :: "+ds.getClass());
			
			
		}catch(SQLException se) {
			se.printStackTrace();
			throw se;
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		
		return count;
	}

}
