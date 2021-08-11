package com.springemployee.employee;

public class Employee {
	private int emptId;
	private String empName;
	private String empAddress;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int emptId, String empName, String empAddress) {
		super();
		this.emptId = emptId;
		this.empName = empName;
		this.empAddress = empAddress;
	}
	@Override
	public String toString() {
		return "Employee [emptId=" + emptId + ", empName=" + empName + ", empAddress=" + empAddress + "]";
	}
	public int getEmptId() {
		return emptId;
	}
	public void setEmptId(int emptId) {
		this.emptId = emptId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

}
