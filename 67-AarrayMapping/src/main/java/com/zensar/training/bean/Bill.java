package com.zensar.training.bean;

import java.time.LocalDate;

public class Bill {
	
	int billId;
	String customerName;
	LocalDate billDate;
	int index;
	
	BillItem [] billItem=new BillItem[3];
	
	
			
			public int getBillId() {
		return billId;
	}



	public void setBillId(int billId) {
		this.billId = billId;
	}



	public String getCustomerName() {
		return customerName;
	}



	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}



	public LocalDate getBillDate() {
		return billDate;
	}



	public void setBillDate(LocalDate billDate) {
		this.billDate = billDate;
	}



	public int getIndex() {
		return index;
	}



	public void setIndex(int index) {
		this.index = index;
	}



	public BillItem[] getBillItem() {
		return billItem;
	}



	public void setBillItem(BillItem[] billItem) {
		this.billItem = billItem;
	}



		public void addBillItem(BillItem billItem) {
		this.billItem[index++]=billItem;
	}
		

}
