package com.sanjay.ProxyDesignPattern;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public void create(String Client, Employee obj) {
		System.out.println("Create Method");
	}

	@Override
	public void delete(String Client, Employee obj) {
		System.out.println("delete");
	}

	@Override
	public Employee get(String client, Employee obj) {
		System.out.println("Employee Get");
		return new Employee();
	}

}
