package com.csv.demo.CsvParserDemo.model;

public class Employee {

	private String eid;
	private String ename;
	private String address;
	private String salary;
	
	
	
	public Employee(String eid, String ename, String address, String salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.address = address;
		this.salary = salary;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", address=" + address + ", salary=" + salary + "]";
	}
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	
	
	
}
