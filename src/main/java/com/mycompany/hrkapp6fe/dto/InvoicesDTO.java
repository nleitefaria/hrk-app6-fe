package com.mycompany.hrkapp6fe.dto;

import java.math.BigDecimal;
import java.util.Date;

public class InvoicesDTO {
		
    private Integer id;   
    private Date invoiceDate;  
    private Date dueDate;   
    private BigDecimal tax;   
    private BigDecimal shipping;   
    private BigDecimal amountDue;
    
	public InvoicesDTO() {
		super();
	}
	
	public InvoicesDTO(Integer id, Date invoiceDate, Date dueDate, BigDecimal tax, BigDecimal shipping, BigDecimal amountDue) {
		super();
		this.id = id;
		this.invoiceDate = invoiceDate;
		this.dueDate = dueDate;
		this.tax = tax;
		this.shipping = shipping;
		this.amountDue = amountDue;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getInvoiceDate() {
		return invoiceDate;
	}
	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	public BigDecimal getTax() {
		return tax;
	}
	public void setTax(BigDecimal tax) {
		this.tax = tax;
	}
	public BigDecimal getShipping() {
		return shipping;
	}
	public void setShipping(BigDecimal shipping) {
		this.shipping = shipping;
	}
	public BigDecimal getAmountDue() {
		return amountDue;
	}
	public void setAmountDue(BigDecimal amountDue) {
		this.amountDue = amountDue;
	}
}
