package com.sanjay.ProxyDesignPattern;

public class EmployeeProxy implements EmployeeDao {

	EmployeeDaoImpl employeeDaoImpl;
	
	public EmployeeProxy() {
		this.employeeDaoImpl = new EmployeeDaoImpl();
	}
	
	@Override
	public void create(String Client, Employee obj) throws Exception {
		if(Client.equals("ADMIN")) {
			employeeDaoImpl.create(Client, obj);
		}
		throw new Exception("Access Denied");
	}

	@Override
	public void delete(String Client, Employee obj) throws Exception {
		if(Client.equals("ADMIN")) {
			employeeDaoImpl.create(Client, obj);
		}
		throw new Exception("Access Denied");
	}

	@Override
	public Employee get(String client, Employee obj) {
		return null;
	}

}
