package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.DAO.OracleEmployeeDAO;
import com.nt.sbeans.Customer;
@Service("CustService")
public class CustomerRegistrationService implements ICustomerService {
	@Autowired
	private OracleEmployeeDAO  cdao;
	private final int gst=18;
	
	@Override
	public String ragistrationService(Customer cust) throws Exception {
		double gstbill=(cust.getCoreBill()*gst)/100;
		double totalBill=cust.getCoreBill()+gstbill;
		double discount=totalBill-250;
		cust.setTotalBill(totalBill);
		cust.setAfterDiscount(discount);
		
		int count=cdao.registerCustomer(cust);
		
		return  count==0?"Customer Registration Failed":"Customer Registration done and billAmount= "+cust.getTotalBill()+" and after discount total payable :: "+cust.getAfterDiscount();
	}
	

}
