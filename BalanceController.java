package com.example.velu.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.velu.models.BalanceModel;
import com.example.velu.services.BalanceService;

@Controller
public class BalanceController {
 
	@Autowired
	BalanceService balanceService;

	@Autowired
	BalanceModel balanceModel;


	@RequestMapping (value = "api/transactions")
	public List<BalanceModel> getTransactions(){
		List<BalanceModel> balance = null;
		//balance = ArrayList<BalanceModel>();
		//	
		//	returns list of transactions with details
		return balance;
	}

	@RequestMapping (value = "api/balance")
	public String getBalance(@RequestParam("balancetype") String balancetype){
		String balance = "";
		System.out.println("Bank Balance process started");
		balance = balanceService.getBalance(balancetype);
		System.out.println("Bank Balance process completed");
		return balance;
}
}

