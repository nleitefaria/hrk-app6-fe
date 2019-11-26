package com.mycompany.hrkapp6fe.dto;

import java.math.BigDecimal;
import java.util.Date;

public class OrdersDTO {
	
    private Integer id;    
    private Date orderDate;  
    private Date shippedDate;    
    private String shipName;  
    private String shipAddress;   
    private String shipCity;   
    private String shipStateProvince;   
    private String shipZipPostalCode;    
    private String shipCountryRegion;    
    private BigDecimal shippingFee;    
    private BigDecimal taxes;  
    private String paymentType;   
    private Date paidDate;    
    private String notes;   
    private Double taxRate;
    
	public OrdersDTO() {
		super();
	}

	public OrdersDTO(Integer id, Date orderDate, Date shippedDate, String shipName, String shipAddress, String shipCity,
			String shipStateProvince, String shipZipPostalCode, String shipCountryRegion, BigDecimal shippingFee,
			BigDecimal taxes, String paymentType, Date paidDate, String notes, Double taxRate) {
		super();
		this.id = id;
		this.orderDate = orderDate;
		this.shippedDate = shippedDate;
		this.shipName = shipName;
		this.shipAddress = shipAddress;
		this.shipCity = shipCity;
		this.shipStateProvince = shipStateProvince;
		this.shipZipPostalCode = shipZipPostalCode;
		this.shipCountryRegion = shipCountryRegion;
		this.shippingFee = shippingFee;
		this.taxes = taxes;
		this.paymentType = paymentType;
		this.paidDate = paidDate;
		this.notes = notes;
		this.taxRate = taxRate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Date getShippedDate() {
		return shippedDate;
	}

	public void setShippedDate(Date shippedDate) {
		this.shippedDate = shippedDate;
	}

	public String getShipName() {
		return shipName;
	}

	public void setShipName(String shipName) {
		this.shipName = shipName;
	}

	public String getShipAddress() {
		return shipAddress;
	}

	public void setShipAddress(String shipAddress) {
		this.shipAddress = shipAddress;
	}

	public String getShipCity() {
		return shipCity;
	}

	public void setShipCity(String shipCity) {
		this.shipCity = shipCity;
	}

	public String getShipStateProvince() {
		return shipStateProvince;
	}

	public void setShipStateProvince(String shipStateProvince) {
		this.shipStateProvince = shipStateProvince;
	}

	public String getShipZipPostalCode() {
		return shipZipPostalCode;
	}

	public void setShipZipPostalCode(String shipZipPostalCode) {
		this.shipZipPostalCode = shipZipPostalCode;
	}

	public String getShipCountryRegion() {
		return shipCountryRegion;
	}

	public void setShipCountryRegion(String shipCountryRegion) {
		this.shipCountryRegion = shipCountryRegion;
	}

	public BigDecimal getShippingFee() {
		return shippingFee;
	}

	public void setShippingFee(BigDecimal shippingFee) {
		this.shippingFee = shippingFee;
	}

	public BigDecimal getTaxes() {
		return taxes;
	}

	public void setTaxes(BigDecimal taxes) {
		this.taxes = taxes;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public Date getPaidDate() {
		return paidDate;
	}

	public void setPaidDate(Date paidDate) {
		this.paidDate = paidDate;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Double getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(Double taxRate) {
		this.taxRate = taxRate;
	}
}
