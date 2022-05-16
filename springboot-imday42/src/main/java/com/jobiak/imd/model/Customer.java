package com.jobiak.imd.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;



@Entity
@ToString
@AllArgsConstructor
@Setter
@Getter
public class Customer {

	public Customer() {
		// TODO Auto-generated constructor stub
	}
	@Id
	private long acctno;
	private String name;
	private double balance;
	
	
	/*
	 * public Customer() { // TODO Auto-generated constructor stub }
	 */
	
	/*
	 * public long getAcctno() { return acctno; } public void setAcctno(long acctno)
	 * { this.acctno = acctno; } public String getName() { return name; } public
	 * void setName(String name) { this.name = name; } public double getBalance() {
	 * return balance; } public void setBalance(double balance) { this.balance =
	 * balance; }
	 * 
	 * @Override public String toString() { return "Customer [acctno=" + acctno +
	 * ", name=" + name + ", balance=" + balance + "]"; }
	 */
}
