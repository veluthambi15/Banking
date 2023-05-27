package com.example.velu.models;

import java.util.Date;

public class BalanceModel {
	
private String openBalance;
private String closingBalance;
private Date fromDate;
private Date toDate;
private String credit;
private String debit;


public String getOpenBalance() {
	return openBalance;
}
public void setOpenBalance(String openBalance) {
	this.openBalance = openBalance;
}
public String getClosingBalance() {
	return closingBalance;
}
public void setClosingBalance(String closingBalance) {
	this.closingBalance = closingBalance;
}
public Date getFromDate() {
	return fromDate;
}
public void setFromDate(Date fromDate) {
	this.fromDate = fromDate;
}
public Date getToDate() {
	return toDate;
}
public void setToDate(Date toDate) {
	this.toDate = toDate;
}
public String getCredit() {
	return credit;
}
public void setCredit(String credit) {
	this.credit = credit;
}
public String getDebit() {
	return debit;
}
public void setDebit(String debit) {
	this.debit = debit;
}


}
