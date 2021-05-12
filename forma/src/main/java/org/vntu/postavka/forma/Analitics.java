package org.vntu.postavka.forma;

public class Analitics implements Order, Customer, Provider {    
  private String idNumber;     
  private String orderDate;    
  private String orderTime;    

  private String customerName;    
  private String customerDate;    
  private String customerTime; 
  private String customerAdress;    

  private String providerName;    
  private String providerDate;    
  private String providerTime;    
  private String providerAdress;    

  public String getIDNumber() {
		return idNumber;
	}

  public void setIDNumber(String idNumber) {
		this.idNumber = idNumber;
	}

  public String getOrderDate() {
		return orderDate;
	}

  public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

  public String getOrderTime() {
		return orderTime;
	}

  public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}

  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public String getCustomerDate() {
    return customerDate;
  }

  public void setCustomerDate(String customerDate) {
    this.customerDate = customerDate;
  } 

  public String getCustomerTime() {
    return customerTime;
  }

  public void setCustomerTime(String customerTime) {
    this.customerTime = customerTime;
  } 

  public String getCustomerAddress() {
    return customerAdress;
  } 

  public void setCustomerAddress(String customerAdress) {
    this.customerAdress = customerAdress;
  }

  public String getProviderName() {
    return providerName;
  }

  public void setProviderName(String providerName) {
    this.providerName = providerName;
  }

  public String getProviderDate() {
    return providerDate;
  }

  public void setProviderDate(String providerDate) {
    this.providerDate = providerDate;
  }

  public String getProviderTime() {
    return providerTime;
  }

  public void setProviderTime(String providerTime) {
    this.providerTime = providerTime;
  }

  public String getProviderAddress() {
    return providerAdress;
  }

  public void setProviderAddress(String providerAdress) {
    this.providerAdress = providerAdress;
  } 
}