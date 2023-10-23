package com.sanjay.ProxyDesignPattern;

public interface EmployeeDao {
	public void create(String Client ,Employee obj) throws Exception;
	public void delete(String Client,Employee obj) throws Exception;
	public Employee get(String client,Employee obj) throws Exception;
}
