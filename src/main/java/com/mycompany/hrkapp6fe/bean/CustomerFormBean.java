package com.mycompany.hrkapp6fe.bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import com.mycompany.hrkapp6fe.dto.CustomersDTO;
import com.mycompany.hrkapp6fe.service.CustomerService;

@ManagedBean
@RequestScoped
public class CustomerFormBean {
	
	private String firstName;
    private String lastName;
    private String company;
	private String emailAddress;
	private String jobTitle;
	private String businessPhone;
	private String homePhone;
	private String mobilePhone;
	private String faxNumber;
	private String address;
	private String city;
	private String stateProvince;
	private String zipPostalCode;
	private String countryRegion;
    
    
    public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}


	public String getJobTitle() {
		return jobTitle;
	}


	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}


	public String getBusinessPhone() {
		return businessPhone;
	}


	public void setBusinessPhone(String businessPhone) {
		this.businessPhone = businessPhone;
	}


	public String getHomePhone() {
		return homePhone;
	}


	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}


	public String getMobilePhone() {
		return mobilePhone;
	}


	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}


	public String getFaxNumber() {
		return faxNumber;
	}


	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getStateProvince() {
		return stateProvince;
	}


	public void setStateProvince(String stateProvince) {
		this.stateProvince = stateProvince;
	}


	public String getZipPostalCode() {
		return zipPostalCode;
	}


	public void setZipPostalCode(String zipPostalCode) {
		this.zipPostalCode = zipPostalCode;
	}


	public String getCountryRegion() {
		return countryRegion;
	}


	public void setCountryRegion(String countryRegion) {
		this.countryRegion = countryRegion;
	}


	public String save() {
        //FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Welcome " + firstname + " " + lastname));
        
        CustomersDTO customerDTO = new CustomersDTO("", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", null);
        
        if(company != null)
        {
        	customerDTO.setCompany(company);
        }
        
        if(firstName != null)
        {
        	customerDTO.setFirstName(firstName);
        }
        
        if(lastName != null)
        {
        	customerDTO.setLastName(lastName);
        }
        
        if(company != null)
        {
        	customerDTO.setCompany(company);
        }
        
        if(emailAddress != null)
        {
        	customerDTO.setEmailAddress(emailAddress);
        }
        
        if(jobTitle != null)
        {
        	customerDTO.setJobTitle(jobTitle);
        }
        
        if(businessPhone != null)
        {
        	customerDTO.setBusinessPhone(businessPhone);
        }
        
        if(homePhone != null)
        {
        	customerDTO.setHomePhone(homePhone);
        }
        
        if(mobilePhone != null)
        {
        	customerDTO.setMobilePhone(mobilePhone);
        }
        
        if(faxNumber != null)
        {
        	customerDTO.setFaxNumber(faxNumber);
        }
        
        if(address != null)
        {
        	customerDTO.setAddress(address);
        }
        
        if(city != null)
        {
        	customerDTO.setCity(city);
        }
        
        if(stateProvince != null)
        {
        	customerDTO.setStateProvince(stateProvince);
        }

        if(countryRegion != null)
        {
        	customerDTO.setCountryRegion(countryRegion);
        }
 
        CustomerService cs = new CustomerService();
        cs.create(customerDTO);
        
        return "customers?faces-redirect=true";       
    }

}
