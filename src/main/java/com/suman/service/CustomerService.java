package com.suman.service;

import java.util.List;

import com.suman.dto.CustomerDTO;
import com.suman.exception.InfyBankException;

public interface CustomerService {
	public CustomerDTO getCustomer(Integer customerId) throws InfyBankException;
	public List<CustomerDTO> getAllCustomers() throws InfyBankException;
	public Integer addCustomer(CustomerDTO customer) throws InfyBankException;
	public void updateCustomer(Integer customerId, String emailId) throws InfyBankException;
	public void deleteCustomer(Integer customerId) throws InfyBankException;
}
