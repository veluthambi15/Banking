package com.example.velu.serviceImplementation;

import java.util.List;

import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import com.example.velu.models.BalanceModel;
import com.example.velu.services.BalanceService;

public class BalanceServiceImpl implements BalanceService {

//	@Autowired
//	TransactionDetails transactionDetails;   //ServiceImplementation for getting the transaction details through another API
	
	@Override
	public String getBalance(String balanceType) {
		
		String balance = "";
		Date fromDate = null, toDate = null;
		
		java.util.Date currentDate = new java.util.Date();
		java.util.Date date = currentDate;
		Calendar c = null;
		c.setTime(date);
		
		List<BalanceModel> balanceModel = new ArrayList<BalanceModel>();
		
		if(balanceType == "MONTHLY") {
			fromDate = date;
			c.add(c.DATE, -30);
			toDate = c.getTime();
			balance = getReqBalance(fromDate, toDate);
			balance = "Monthly Balance : " + balance;
		}else if(balanceType  == "CUMULATIVE") {
			fromDate = date;
			c.add(c.DATE, -365);
			toDate = c.getTime();
			balance = getReqBalance(fromDate, toDate);
			balance = "Cumulative Balance : " + balance;
		}
		return balance;
		
	}
	
	public String getReqBalance(Date fromDate, Date toDate) {
		
		String balanceAmount = "";
//		balanceModel = transactionDetails.getTransactions(fromDate, toDate); // getting transaction details from another API
//		balanceAmount = (openingAmount + totalCredit) - totalDebit; 
		
		return balanceAmount;
		
	}
	
}
